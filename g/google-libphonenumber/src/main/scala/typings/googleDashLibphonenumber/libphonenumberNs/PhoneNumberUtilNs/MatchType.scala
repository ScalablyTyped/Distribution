package typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatchType extends js.Object

@JSGlobal("libphonenumber.PhoneNumberUtil.MatchType")
@js.native
object MatchType extends js.Object {
  @js.native
  sealed trait EXACT_MATCH extends MatchType
  
  @js.native
  sealed trait NOT_A_NUMBER extends MatchType
  
  @js.native
  sealed trait NO_MATCH extends MatchType
  
  @js.native
  sealed trait NSN_MATCH extends MatchType
  
  @js.native
  sealed trait SHORT_NSN_MATCH extends MatchType
  
  /* 0 */ val EXACT_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.EXACT_MATCH with Double = js.native
  /* 2 */ val NOT_A_NUMBER: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.NOT_A_NUMBER with Double = js.native
  /* 1 */ val NO_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.NO_MATCH with Double = js.native
  /* 3 */ val NSN_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.NSN_MATCH with Double = js.native
  /* 4 */ val SHORT_NSN_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.SHORT_NSN_MATCH with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatchType with Double] = js.native
}

