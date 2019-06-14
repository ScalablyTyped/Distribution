package typings
package googleDashLibphonenumberLib.libphonenumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneNumberFormat extends js.Object

@JSGlobal("libphonenumber.PhoneNumberFormat")
@js.native
object PhoneNumberFormat extends js.Object {
  @js.native
  sealed trait E164
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberFormat
  
  @js.native
  sealed trait INTERNATIONAL
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberFormat
  
  @js.native
  sealed trait NATIONAL
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberFormat
  
  @js.native
  sealed trait RFC3966
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberFormat
  
  /* 0 */ val E164: E164 with scala.Double = js.native
  /* 1 */ val INTERNATIONAL: INTERNATIONAL with scala.Double = js.native
  /* 2 */ val NATIONAL: NATIONAL with scala.Double = js.native
  /* 3 */ val RFC3966: RFC3966 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberFormat with scala.Double] = js.native
}

