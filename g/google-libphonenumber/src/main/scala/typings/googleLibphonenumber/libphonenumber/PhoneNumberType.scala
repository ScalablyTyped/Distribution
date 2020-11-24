package typings.googleLibphonenumber.libphonenumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
