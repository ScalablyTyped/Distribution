package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Requirements for the password used to unlock a device.
  */
@js.native
trait SchemaPasswordRequirements extends js.Object {
  /**
    * Number of incorrect device-unlock passwords that can be entered before a
    * device is wiped. A value of 0 means there is no restriction.
    */
  var maximumFailedPasswordsForWipe: js.UndefOr[Double] = js.native
  /**
    * Password expiration timeout.
    */
  var passwordExpirationTimeout: js.UndefOr[String] = js.native
  /**
    * The length of the password history. After setting this field, the user
    * won&#39;t be able to enter a new password that is the same as any
    * password in the history. A value of 0 means there is no restriction.
    */
  var passwordHistoryLength: js.UndefOr[Double] = js.native
  /**
    * The minimum allowed password length. A value of 0 means there is no
    * restriction. Only enforced when password_quality is NUMERIC,
    * NUMERIC_COMPLEX, ALPHABETIC, ALPHANUMERIC, or COMPLEX.
    */
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  /**
    * Minimum number of letters required in the password. Only enforced when
    * password_quality is COMPLEX.
    */
  var passwordMinimumLetters: js.UndefOr[Double] = js.native
  /**
    * Minimum number of lower case letters required in the password. Only
    * enforced when password_quality is COMPLEX.
    */
  var passwordMinimumLowerCase: js.UndefOr[Double] = js.native
  /**
    * Minimum number of non-letter characters (numerical digits or symbols)
    * required in the password. Only enforced when password_quality is COMPLEX.
    */
  var passwordMinimumNonLetter: js.UndefOr[Double] = js.native
  /**
    * Minimum number of numerical digits required in the password. Only
    * enforced when password_quality is COMPLEX.
    */
  var passwordMinimumNumeric: js.UndefOr[Double] = js.native
  /**
    * Minimum number of symbols required in the password. Only enforced when
    * password_quality is COMPLEX.
    */
  var passwordMinimumSymbols: js.UndefOr[Double] = js.native
  /**
    * Minimum number of upper case letters required in the password. Only
    * enforced when password_quality is COMPLEX.
    */
  var passwordMinimumUpperCase: js.UndefOr[Double] = js.native
  /**
    * The required password quality.
    */
  var passwordQuality: js.UndefOr[String] = js.native
  /**
    * The scope that the password requirement applies to.
    */
  var passwordScope: js.UndefOr[String] = js.native
}

object SchemaPasswordRequirements {
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
    passwordQuality: String = null,
    passwordScope: String = null
  ): SchemaPasswordRequirements = {
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
    if (passwordScope != null) __obj.updateDynamic("passwordScope")(passwordScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPasswordRequirements]
  }
}

