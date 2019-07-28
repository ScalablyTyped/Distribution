package typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CountryCodeSource extends js.Object

@JSGlobal("libphonenumber.PhoneNumber.CountryCodeSource")
@js.native
object CountryCodeSource extends js.Object {
  @js.native
  sealed trait FROM_DEFAULT_COUNTRY extends CountryCodeSource
  
  @js.native
  sealed trait FROM_NUMBER_WITHOUT_PLUS_SIGN extends CountryCodeSource
  
  @js.native
  sealed trait FROM_NUMBER_WITH_IDD extends CountryCodeSource
  
  @js.native
  sealed trait FROM_NUMBER_WITH_PLUS_SIGN extends CountryCodeSource
  
  /* 20 */ val FROM_DEFAULT_COUNTRY: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberNs.CountryCodeSource.FROM_DEFAULT_COUNTRY with Double = js.native
  /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberNs.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN with Double = js.native
  /* 5 */ val FROM_NUMBER_WITH_IDD: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberNs.CountryCodeSource.FROM_NUMBER_WITH_IDD with Double = js.native
  /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberNs.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CountryCodeSource with Double] = js.native
}

