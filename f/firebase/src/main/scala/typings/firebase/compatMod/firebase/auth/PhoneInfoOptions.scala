package typings.firebase.compatMod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The information required to verify the ownership of a phone number. The
  * information that's required depends on whether you are doing single-factor
  * sign-in, multi-factor enrollment or multi-factor sign-in.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebase.compatMod.firebase.auth.PhoneSingleFactorInfoOptions
  - typings.firebase.compatMod.firebase.auth.PhoneMultiFactorEnrollInfoOptions
  - typings.firebase.compatMod.firebase.auth.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  inline def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typings.firebase.compatMod.firebase.auth.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebase.compatMod.firebase.auth.PhoneMultiFactorEnrollInfoOptions]
  }
  
  inline def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typings.firebase.compatMod.firebase.auth.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebase.compatMod.firebase.auth.PhoneMultiFactorSignInInfoOptions]
  }
  
  inline def PhoneSingleFactorInfoOptions(phoneNumber: String): typings.firebase.compatMod.firebase.auth.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebase.compatMod.firebase.auth.PhoneSingleFactorInfoOptions]
  }
}
