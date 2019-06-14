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
  
  /* 0 */ val EXACT_MATCH: EXACT_MATCH with scala.Double = js.native
  /* 2 */ val NOT_A_NUMBER: NOT_A_NUMBER with scala.Double = js.native
  /* 1 */ val NO_MATCH: NO_MATCH with scala.Double = js.native
  /* 3 */ val NSN_MATCH: NSN_MATCH with scala.Double = js.native
  /* 4 */ val SHORT_NSN_MATCH: SHORT_NSN_MATCH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType with scala.Double
  ] = js.native
}

