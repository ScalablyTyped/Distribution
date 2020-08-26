package typings.feathersjsAuthentication.mod.AuthHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestrictOptions extends js.Object {
  var idField: String = js.native
  var ownerField: String = js.native
}

object RestrictOptions {
  @scala.inline
  def apply(idField: String, ownerField: String): RestrictOptions = {
    val __obj = js.Dynamic.literal(idField = idField.asInstanceOf[js.Any], ownerField = ownerField.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictOptions]
  }
  @scala.inline
  implicit class RestrictOptionsOps[Self <: RestrictOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdField(value: String): Self = this.set("idField", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerField(value: String): Self = this.set("ownerField", value.asInstanceOf[js.Any])
  }
  
}

