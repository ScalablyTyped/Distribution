package typings.googleLibphonenumber.libphonenumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneNumberType extends StObject
@JSGlobal("libphonenumber.PhoneNumberType")
@js.native
object PhoneNumberType extends StObject {
  
  @js.native
  sealed trait FIXED_LINE
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait FIXED_LINE_OR_MOBILE
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait MOBILE
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait PAGER
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait PERSONAL_NUMBER
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait PREMIUM_RATE
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait SHARED_COST
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait TOLL_FREE
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait UAN
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait VOICEMAIL
    extends StObject
       with PhoneNumberType
  
  @js.native
  sealed trait VOIP
    extends StObject
       with PhoneNumberType
}
