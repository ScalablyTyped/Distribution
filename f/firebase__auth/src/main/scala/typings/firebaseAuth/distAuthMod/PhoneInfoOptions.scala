package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuth.distAuthMod.PhoneSingleFactorInfoOptions
  - typings.firebaseAuth.distAuthMod.PhoneMultiFactorEnrollInfoOptions
  - typings.firebaseAuth.distAuthMod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  inline def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typings.firebaseAuth.distAuthMod.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distAuthMod.PhoneMultiFactorEnrollInfoOptions]
  }
  
  inline def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typings.firebaseAuth.distAuthMod.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distAuthMod.PhoneMultiFactorSignInInfoOptions]
  }
  
  inline def PhoneSingleFactorInfoOptions(phoneNumber: String): typings.firebaseAuth.distAuthMod.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distAuthMod.PhoneSingleFactorInfoOptions]
  }
}
