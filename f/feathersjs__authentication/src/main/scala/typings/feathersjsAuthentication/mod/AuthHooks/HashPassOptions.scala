package typings.feathersjsAuthentication.mod.AuthHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashPassOptions extends js.Object {
  var passwordField: String = js.native
}

object HashPassOptions {
  @scala.inline
  def apply(passwordField: String): HashPassOptions = {
    val __obj = js.Dynamic.literal(passwordField = passwordField.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashPassOptions]
  }
  @scala.inline
  implicit class HashPassOptionsOps[Self <: HashPassOptions] (val x: Self) extends AnyVal {
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
    def setPasswordField(value: String): Self = this.set("passwordField", value.asInstanceOf[js.Any])
  }
  
}

