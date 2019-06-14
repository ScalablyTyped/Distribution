package typings
package googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationResult extends js.Object

@JSGlobal("libphonenumber.PhoneNumberUtil.ValidationResult")
@js.native
object ValidationResult extends js.Object {
  @js.native
  sealed trait INVALID_COUNTRY_CODE
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult
  
  @js.native
  sealed trait IS_POSSIBLE
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult
  
  @js.native
  sealed trait TOO_LONG
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult
  
  @js.native
  sealed trait TOO_SHORT
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult
  
  /* 1 */ val INVALID_COUNTRY_CODE: INVALID_COUNTRY_CODE with scala.Double = js.native
  /* 0 */ val IS_POSSIBLE: IS_POSSIBLE with scala.Double = js.native
  /* 3 */ val TOO_LONG: TOO_LONG with scala.Double = js.native
  /* 2 */ val TOO_SHORT: TOO_SHORT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult with scala.Double
  ] = js.native
}

