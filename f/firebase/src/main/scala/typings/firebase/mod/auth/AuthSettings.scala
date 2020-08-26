package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an Auth instance's settings, currently used for
  * enabling/disabling app verification for phone Auth testing.
  */
@js.native
trait AuthSettings extends js.Object {
  /**
    * When set, this property disables app verification for the purpose of testing
    * phone authentication. For this property to take effect, it needs to be set
    * before rendering a reCAPTCHA app verifier. When this is disabled, a
    * mock reCAPTCHA is rendered instead. This is useful for manual testing during
    * development or for automated integration tests.
    *
    * In order to use this feature, you will need to
    * {@link https://firebase.google.com/docs/auth/web/phone-auth#test-with-whitelisted-phone-numbers
    * whitelist your phone number} via the
    * Firebase Console.
    *
    * The default value is false (app verification is enabled).
    */
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

