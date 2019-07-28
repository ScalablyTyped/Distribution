package typings.googleDashLibphonenumber.libphonenumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneNumberType extends js.Object

@JSGlobal("libphonenumber.PhoneNumberType")
@js.native
object PhoneNumberType extends js.Object {
  @js.native
  sealed trait FIXED_LINE extends PhoneNumberType
  
  @js.native
  sealed trait FIXED_LINE_OR_MOBILE extends PhoneNumberType
  
  @js.native
  sealed trait MOBILE extends PhoneNumberType
  
  @js.native
  sealed trait PAGER extends PhoneNumberType
  
  @js.native
  sealed trait PERSONAL_NUMBER extends PhoneNumberType
  
  @js.native
  sealed trait PREMIUM_RATE extends PhoneNumberType
  
  @js.native
  sealed trait SHARED_COST extends PhoneNumberType
  
  @js.native
  sealed trait TOLL_FREE extends PhoneNumberType
  
  @js.native
  sealed trait UAN extends PhoneNumberType
  
  @js.native
  sealed trait UNKNOWN extends PhoneNumberType
  
  @js.native
  sealed trait VOICEMAIL extends PhoneNumberType
  
  @js.native
  sealed trait VOIP extends PhoneNumberType
  
  /* 0 */ val FIXED_LINE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.FIXED_LINE with Double = js.native
  /* 2 */ val FIXED_LINE_OR_MOBILE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.FIXED_LINE_OR_MOBILE with Double = js.native
  /* 1 */ val MOBILE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.MOBILE with Double = js.native
  /* 8 */ val PAGER: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.PAGER with Double = js.native
  /* 7 */ val PERSONAL_NUMBER: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.PERSONAL_NUMBER with Double = js.native
  /* 4 */ val PREMIUM_RATE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.PREMIUM_RATE with Double = js.native
  /* 5 */ val SHARED_COST: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.SHARED_COST with Double = js.native
  /* 3 */ val TOLL_FREE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.TOLL_FREE with Double = js.native
  /* 9 */ val UAN: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.UAN with Double = js.native
  /* -1 */ val UNKNOWN: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.UNKNOWN with Double = js.native
  /* 10 */ val VOICEMAIL: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.VOICEMAIL with Double = js.native
  /* 6 */ val VOIP: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberType.VOIP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneNumberType with Double] = js.native
}

