package typings
package googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CountryCodeSource extends js.Object

@JSGlobal("libphonenumber.PhoneNumber.CountryCodeSource")
@js.native
object CountryCodeSource extends js.Object {
  @js.native
  sealed trait FROM_DEFAULT_COUNTRY
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberNs.CountryCodeSource
  
  @js.native
  sealed trait FROM_NUMBER_WITHOUT_PLUS_SIGN
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberNs.CountryCodeSource
  
  @js.native
  sealed trait FROM_NUMBER_WITH_IDD
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberNs.CountryCodeSource
  
  @js.native
  sealed trait FROM_NUMBER_WITH_PLUS_SIGN
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberNs.CountryCodeSource
  
  /* 20 */ val FROM_DEFAULT_COUNTRY: FROM_DEFAULT_COUNTRY with scala.Double = js.native
  /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: FROM_NUMBER_WITHOUT_PLUS_SIGN with scala.Double = js.native
  /* 5 */ val FROM_NUMBER_WITH_IDD: FROM_NUMBER_WITH_IDD with scala.Double = js.native
  /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: FROM_NUMBER_WITH_PLUS_SIGN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberNs.CountryCodeSource with scala.Double
  ] = js.native
}

