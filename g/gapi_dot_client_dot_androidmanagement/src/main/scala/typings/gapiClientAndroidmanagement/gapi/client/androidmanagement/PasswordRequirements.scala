package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRequirements extends js.Object {
  /** A device will be wiped after too many incorrect device-unlock passwords have been entered. A value of 0 means there is no restriction. */
  var maximumFailedPasswordsForWipe: js.UndefOr[Double] = js.undefined
  /** Password expiration timeout. */
  var passwordExpirationTimeout: js.UndefOr[String] = js.undefined
  /**
    * The length of the password history. After setting this, the user will not be able to enter a new password that is the same as any password in the
    * history. A value of 0 means there is no restriction.
    */
  var passwordHistoryLength: js.UndefOr[Double] = js.undefined
  /**
    * The minimum allowed password length. A value of 0 means there is no restriction. Only enforced when password_quality is NUMERIC, NUMERIC_COMPLEX,
    * ALPHABETIC, ALPHANUMERIC, or COMPLEX.
    */
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  /** Minimum number of letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLetters: js.UndefOr[Double] = js.undefined
  /** Minimum number of lower case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLowerCase: js.UndefOr[Double] = js.undefined
  /** Minimum number of non-letter characters (numerical digits or symbols) required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNonLetter: js.UndefOr[Double] = js.undefined
  /** Minimum number of numerical digits required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNumeric: js.UndefOr[Double] = js.undefined
  /** Minimum number of symbols required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumSymbols: js.UndefOr[Double] = js.undefined
  /** Minimum number of upper case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumUpperCase: js.UndefOr[Double] = js.undefined
  /** The required password quality. */
  var passwordQuality: js.UndefOr[String] = js.undefined
}

object PasswordRequirements {
  @scala.inline
  def apply(
    maximumFailedPasswordsForWipe: js.UndefOr[Double] = js.undefined,
    passwordExpirationTimeout: String = null,
    passwordHistoryLength: js.UndefOr[Double] = js.undefined,
    passwordMinimumLength: js.UndefOr[Double] = js.undefined,
    passwordMinimumLetters: js.UndefOr[Double] = js.undefined,
    passwordMinimumLowerCase: js.UndefOr[Double] = js.undefined,
    passwordMinimumNonLetter: js.UndefOr[Double] = js.undefined,
    passwordMinimumNumeric: js.UndefOr[Double] = js.undefined,
    passwordMinimumSymbols: js.UndefOr[Double] = js.undefined,
    passwordMinimumUpperCase: js.UndefOr[Double] = js.undefined,
    passwordQuality: String = null
  ): PasswordRequirements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumFailedPasswordsForWipe)) __obj.updateDynamic("maximumFailedPasswordsForWipe")(maximumFailedPasswordsForWipe.get.asInstanceOf[js.Any])
    if (passwordExpirationTimeout != null) __obj.updateDynamic("passwordExpirationTimeout")(passwordExpirationTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordHistoryLength)) __obj.updateDynamic("passwordHistoryLength")(passwordHistoryLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLength)) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLetters)) __obj.updateDynamic("passwordMinimumLetters")(passwordMinimumLetters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLowerCase)) __obj.updateDynamic("passwordMinimumLowerCase")(passwordMinimumLowerCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumNonLetter)) __obj.updateDynamic("passwordMinimumNonLetter")(passwordMinimumNonLetter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumNumeric)) __obj.updateDynamic("passwordMinimumNumeric")(passwordMinimumNumeric.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumSymbols)) __obj.updateDynamic("passwordMinimumSymbols")(passwordMinimumSymbols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumUpperCase)) __obj.updateDynamic("passwordMinimumUpperCase")(passwordMinimumUpperCase.get.asInstanceOf[js.Any])
    if (passwordQuality != null) __obj.updateDynamic("passwordQuality")(passwordQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRequirements]
  }
}

