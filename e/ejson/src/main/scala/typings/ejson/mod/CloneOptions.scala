package typings.ejson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneOptions extends js.Object {
  var keyOrderSensitive: Boolean = js.native
}

object CloneOptions {
  @scala.inline
  def apply(keyOrderSensitive: Boolean): CloneOptions = {
    val __obj = js.Dynamic.literal(keyOrderSensitive = keyOrderSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneOptions]
  }
  @scala.inline
  implicit class CloneOptionsOps[Self <: CloneOptions] (val x: Self) extends AnyVal {
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
    def setKeyOrderSensitive(value: Boolean): Self = this.set("keyOrderSensitive", value.asInstanceOf[js.Any])
  }
  
}

