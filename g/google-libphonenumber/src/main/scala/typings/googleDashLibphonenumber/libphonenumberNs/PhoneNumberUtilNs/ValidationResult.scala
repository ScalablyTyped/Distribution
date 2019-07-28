package typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationResult extends js.Object

@JSGlobal("libphonenumber.PhoneNumberUtil.ValidationResult")
@js.native
object ValidationResult extends js.Object {
  @js.native
  sealed trait INVALID_COUNTRY_CODE extends ValidationResult
  
  @js.native
  sealed trait IS_POSSIBLE extends ValidationResult
  
  @js.native
  sealed trait TOO_LONG extends ValidationResult
  
  @js.native
  sealed trait TOO_SHORT extends ValidationResult
  
  /* 1 */ val INVALID_COUNTRY_CODE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.INVALID_COUNTRY_CODE with Double = js.native
  /* 0 */ val IS_POSSIBLE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.IS_POSSIBLE with Double = js.native
  /* 3 */ val TOO_LONG: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_LONG with Double = js.native
  /* 2 */ val TOO_SHORT: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_SHORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationResult with Double] = js.native
}

