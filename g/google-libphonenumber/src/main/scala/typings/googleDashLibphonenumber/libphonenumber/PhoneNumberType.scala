package typings.googleDashLibphonenumber.libphonenumber

import org.scalablytyped.runtime.TopLevel
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE_OR_MOBILE
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.MOBILE
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.PAGER
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.PERSONAL_NUMBER
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.PREMIUM_RATE
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.SHARED_COST
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.TOLL_FREE
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.UAN
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.UNKNOWN
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.VOICEMAIL
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumberType.VOIP
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneNumberType with Double] = js.native
  /* 0 */ @js.native
  object FIXED_LINE extends TopLevel[FIXED_LINE with Double]
  
  /* 2 */ @js.native
  object FIXED_LINE_OR_MOBILE extends TopLevel[FIXED_LINE_OR_MOBILE with Double]
  
  /* 1 */ @js.native
  object MOBILE extends TopLevel[MOBILE with Double]
  
  /* 8 */ @js.native
  object PAGER extends TopLevel[PAGER with Double]
  
  /* 7 */ @js.native
  object PERSONAL_NUMBER extends TopLevel[PERSONAL_NUMBER with Double]
  
  /* 4 */ @js.native
  object PREMIUM_RATE extends TopLevel[PREMIUM_RATE with Double]
  
  /* 5 */ @js.native
  object SHARED_COST extends TopLevel[SHARED_COST with Double]
  
  /* 3 */ @js.native
  object TOLL_FREE extends TopLevel[TOLL_FREE with Double]
  
  /* 9 */ @js.native
  object UAN extends TopLevel[UAN with Double]
  
  /* -1 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /* 10 */ @js.native
  object VOICEMAIL extends TopLevel[VOICEMAIL with Double]
  
  /* 6 */ @js.native
  object VOIP extends TopLevel[VOIP with Double]
  
}

