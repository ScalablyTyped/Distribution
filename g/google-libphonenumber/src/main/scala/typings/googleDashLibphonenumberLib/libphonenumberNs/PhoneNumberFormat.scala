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
  
  val E164: E164 with java.lang.String = js.native
  val INTERNATIONAL: INTERNATIONAL with java.lang.String = js.native
  val NATIONAL: NATIONAL with java.lang.String = js.native
  val RFC3966: RFC3966 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberFormat with java.lang.String
  ] = js.native
}

