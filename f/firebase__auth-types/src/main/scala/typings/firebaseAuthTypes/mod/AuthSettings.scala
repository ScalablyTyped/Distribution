package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthSettings extends js.Object {
  var appVerificationDisabledForTesting: Boolean = js.native
}

object AuthSettings {
  @scala.inline
  def apply(appVerificationDisabledForTesting: Boolean): AuthSettings = {
    val __obj = js.Dynamic.literal(appVerificationDisabledForTesting = appVerificationDisabledForTesting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSettings]
  }
  @scala.inline
  implicit class AuthSettingsOps[Self <: AuthSettings] (val x: Self) extends AnyVal {
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
    def setAppVerificationDisabledForTesting(value: Boolean): Self = this.set("appVerificationDisabledForTesting", value.asInstanceOf[js.Any])
  }
  
}

