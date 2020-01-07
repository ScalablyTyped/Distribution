package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Requirements for the password used to unlock a device.
  */
@js.native
trait Schema$PasswordRequirements extends js.Object {
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

object Schema$PasswordRequirements {
  @scala.inline
  def apply(
    maximumFailedPasswordsForWipe: Int | Double = null,
    passwordExpirationTimeout: String = null,
    passwordHistoryLength: Int | Double = null,
    passwordMinimumLength: Int | Double = null,
    passwordMinimumLetters: Int | Double = null,
    passwordMinimumLowerCase: Int | Double = null,
    passwordMinimumNonLetter: Int | Double = null,
    passwordMinimumNumeric: Int | Double = null,
    passwordMinimumSymbols: Int | Double = null,
    passwordMinimumUpperCase: Int | Double = null,
    passwordQuality: String = null,
    passwordScope: String = null
  ): Schema$PasswordRequirements = {
    val __obj = js.Dynamic.literal()
    if (maximumFailedPasswordsForWipe != null) __obj.updateDynamic("maximumFailedPasswordsForWipe")(maximumFailedPasswordsForWipe.asInstanceOf[js.Any])
    if (passwordExpirationTimeout != null) __obj.updateDynamic("passwordExpirationTimeout")(passwordExpirationTimeout.asInstanceOf[js.Any])
    if (passwordHistoryLength != null) __obj.updateDynamic("passwordHistoryLength")(passwordHistoryLength.asInstanceOf[js.Any])
    if (passwordMinimumLength != null) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.asInstanceOf[js.Any])
    if (passwordMinimumLetters != null) __obj.updateDynamic("passwordMinimumLetters")(passwordMinimumLetters.asInstanceOf[js.Any])
    if (passwordMinimumLowerCase != null) __obj.updateDynamic("passwordMinimumLowerCase")(passwordMinimumLowerCase.asInstanceOf[js.Any])
    if (passwordMinimumNonLetter != null) __obj.updateDynamic("passwordMinimumNonLetter")(passwordMinimumNonLetter.asInstanceOf[js.Any])
    if (passwordMinimumNumeric != null) __obj.updateDynamic("passwordMinimumNumeric")(passwordMinimumNumeric.asInstanceOf[js.Any])
    if (passwordMinimumSymbols != null) __obj.updateDynamic("passwordMinimumSymbols")(passwordMinimumSymbols.asInstanceOf[js.Any])
    if (passwordMinimumUpperCase != null) __obj.updateDynamic("passwordMinimumUpperCase")(passwordMinimumUpperCase.asInstanceOf[js.Any])
    if (passwordQuality != null) __obj.updateDynamic("passwordQuality")(passwordQuality.asInstanceOf[js.Any])
    if (passwordScope != null) __obj.updateDynamic("passwordScope")(passwordScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PasswordRequirements]
  }
}

