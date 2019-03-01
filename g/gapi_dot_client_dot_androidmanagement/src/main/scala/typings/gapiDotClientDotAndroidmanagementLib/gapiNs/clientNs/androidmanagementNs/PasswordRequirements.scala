package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRequirements extends js.Object {
  /** A device will be wiped after too many incorrect device-unlock passwords have been entered. A value of 0 means there is no restriction. */
  var maximumFailedPasswordsForWipe: js.UndefOr[scala.Double] = js.undefined
  /** Password expiration timeout. */
  var passwordExpirationTimeout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The length of the password history. After setting this, the user will not be able to enter a new password that is the same as any password in the
    * history. A value of 0 means there is no restriction.
    */
  var passwordHistoryLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum allowed password length. A value of 0 means there is no restriction. Only enforced when password_quality is NUMERIC, NUMERIC_COMPLEX,
    * ALPHABETIC, ALPHANUMERIC, or COMPLEX.
    */
  var passwordMinimumLength: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLetters: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of lower case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumLowerCase: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of non-letter characters (numerical digits or symbols) required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNonLetter: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of numerical digits required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumNumeric: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of symbols required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumSymbols: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of upper case letters required in the password. Only enforced when password_quality is COMPLEX. */
  var passwordMinimumUpperCase: js.UndefOr[scala.Double] = js.undefined
  /** The required password quality. */
  var passwordQuality: js.UndefOr[java.lang.String] = js.undefined
}

object PasswordRequirements {
  @scala.inline
  def apply(
    maximumFailedPasswordsForWipe: scala.Int | scala.Double = null,
    passwordExpirationTimeout: java.lang.String = null,
    passwordHistoryLength: scala.Int | scala.Double = null,
    passwordMinimumLength: scala.Int | scala.Double = null,
    passwordMinimumLetters: scala.Int | scala.Double = null,
    passwordMinimumLowerCase: scala.Int | scala.Double = null,
    passwordMinimumNonLetter: scala.Int | scala.Double = null,
    passwordMinimumNumeric: scala.Int | scala.Double = null,
    passwordMinimumSymbols: scala.Int | scala.Double = null,
    passwordMinimumUpperCase: scala.Int | scala.Double = null,
    passwordQuality: java.lang.String = null
  ): PasswordRequirements = {
    val __obj = js.Dynamic.literal()
    if (maximumFailedPasswordsForWipe != null) __obj.updateDynamic("maximumFailedPasswordsForWipe")(maximumFailedPasswordsForWipe.asInstanceOf[js.Any])
    if (passwordExpirationTimeout != null) __obj.updateDynamic("passwordExpirationTimeout")(passwordExpirationTimeout)
    if (passwordHistoryLength != null) __obj.updateDynamic("passwordHistoryLength")(passwordHistoryLength.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinimumLetters != null) __obj.updateDynamic("passwordMinimumLetters")(passwordMinimumLetters.asInstanceOf[js.Any])
    if (passwordMinimumLowerCase != null) __obj.updateDynamic("passwordMinimumLowerCase")(passwordMinimumLowerCase.asInstanceOf[js.Any])
    if (passwordMinimumNonLetter != null) __obj.updateDynamic("passwordMinimumNonLetter")(passwordMinimumNonLetter.asInstanceOf[js.Any])
    if (passwordMinimumNumeric != null) __obj.updateDynamic("passwordMinimumNumeric")(passwordMinimumNumeric.asInstanceOf[js.Any])
    if (passwordMinimumSymbols != null) __obj.updateDynamic("passwordMinimumSymbols")(passwordMinimumSymbols.asInstanceOf[js.Any])
    if (passwordMinimumUpperCase != null) __obj.updateDynamic("passwordMinimumUpperCase")(passwordMinimumUpperCase.asInstanceOf[js.Any])
    if (passwordQuality != null) __obj.updateDynamic("passwordQuality")(passwordQuality)
    __obj.asInstanceOf[PasswordRequirements]
  }
}

