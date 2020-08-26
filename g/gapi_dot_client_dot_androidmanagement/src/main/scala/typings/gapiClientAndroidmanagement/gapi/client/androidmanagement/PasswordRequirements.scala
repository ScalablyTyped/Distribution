package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordRequirements extends js.Object {
  /** A device will be wiped after too many incorrect device-unlock passwords have been entered. A value of 0 means there is no restriction. */
  var maximumFailedPasswordsForWipe: js.UndefOr[Double] = js.native
  /** Password expiration timeout. */
  var passwordExpirationTimeout: js.UndefOr[String] = js.native
  /**
    * The length of the password history. After setting this, the user will not be able to enter a new password that is the same as any password in the
    * history. A value of 0 means there is no restriction.
    */
  var passwordHistoryLength: js.UndefOr[Double] = js.native
  /**
    * The minimum allowed password length. A value of 0 means there is no restriction. Only enforced when password_quality is NUMERIC, NUMERIC_COMPLEX,
    * ALPHABETIC, ALPHANUMERIC, or COMPLEX.
    */
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  /** Minimum number of letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLetters: js.UndefOr[Double] = js.native
  /** Minimum number of lower case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLowerCase: js.UndefOr[Double] = js.native
  /** Minimum number of non-letter characters (numerical digits or symbols) required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNonLetter: js.UndefOr[Double] = js.native
  /** Minimum number of numerical digits required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNumeric: js.UndefOr[Double] = js.native
  /** Minimum number of symbols required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumSymbols: js.UndefOr[Double] = js.native
  /** Minimum number of upper case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumUpperCase: js.UndefOr[Double] = js.native
  /** The required password quality. */
  var passwordQuality: js.UndefOr[String] = js.native
}

object PasswordRequirements {
  @scala.inline
  def apply(): PasswordRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordRequirements]
  }
  @scala.inline
  implicit class PasswordRequirementsOps[Self <: PasswordRequirements] (val x: Self) extends AnyVal {
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
    def setMaximumFailedPasswordsForWipe(value: Double): Self = this.set("maximumFailedPasswordsForWipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFailedPasswordsForWipe: Self = this.set("maximumFailedPasswordsForWipe", js.undefined)
    @scala.inline
    def setPasswordExpirationTimeout(value: String): Self = this.set("passwordExpirationTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordExpirationTimeout: Self = this.set("passwordExpirationTimeout", js.undefined)
    @scala.inline
    def setPasswordHistoryLength(value: Double): Self = this.set("passwordHistoryLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordHistoryLength: Self = this.set("passwordHistoryLength", js.undefined)
    @scala.inline
    def setPasswordMinimumLength(value: Double): Self = this.set("passwordMinimumLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumLength: Self = this.set("passwordMinimumLength", js.undefined)
    @scala.inline
    def setPasswordMinimumLetters(value: Double): Self = this.set("passwordMinimumLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumLetters: Self = this.set("passwordMinimumLetters", js.undefined)
    @scala.inline
    def setPasswordMinimumLowerCase(value: Double): Self = this.set("passwordMinimumLowerCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumLowerCase: Self = this.set("passwordMinimumLowerCase", js.undefined)
    @scala.inline
    def setPasswordMinimumNonLetter(value: Double): Self = this.set("passwordMinimumNonLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumNonLetter: Self = this.set("passwordMinimumNonLetter", js.undefined)
    @scala.inline
    def setPasswordMinimumNumeric(value: Double): Self = this.set("passwordMinimumNumeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumNumeric: Self = this.set("passwordMinimumNumeric", js.undefined)
    @scala.inline
    def setPasswordMinimumSymbols(value: Double): Self = this.set("passwordMinimumSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumSymbols: Self = this.set("passwordMinimumSymbols", js.undefined)
    @scala.inline
    def setPasswordMinimumUpperCase(value: Double): Self = this.set("passwordMinimumUpperCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordMinimumUpperCase: Self = this.set("passwordMinimumUpperCase", js.undefined)
    @scala.inline
    def setPasswordQuality(value: String): Self = this.set("passwordQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordQuality: Self = this.set("passwordQuality", js.undefined)
  }
  
}

