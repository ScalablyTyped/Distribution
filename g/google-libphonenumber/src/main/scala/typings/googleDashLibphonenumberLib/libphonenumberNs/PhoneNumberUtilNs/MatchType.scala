package typings
package googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatchType extends js.Object

@JSGlobal("libphonenumber.PhoneNumberUtil.MatchType")
@js.native
object MatchType extends js.Object {
  @js.native
  sealed trait EXACT_MATCH
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType
  
  @js.native
  sealed trait NOT_A_NUMBER
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType
  
  @js.native
  sealed trait NO_MATCH
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType
  
  @js.native
  sealed trait NSN_MATCH
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType
  
  @js.native
  sealed trait SHORT_NSN_MATCH
    extends googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType
  
  val EXACT_MATCH: EXACT_MATCH with java.lang.String = js.native
  val NOT_A_NUMBER: NOT_A_NUMBER with java.lang.String = js.native
  val NO_MATCH: NO_MATCH with java.lang.String = js.native
  val NSN_MATCH: NSN_MATCH with java.lang.String = js.native
  val SHORT_NSN_MATCH: SHORT_NSN_MATCH with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType with java.lang.String
  ] = js.native
}

