package typings.firebaseAuth.distEsm5SrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneSingleFactorInfoOptions
  - typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions
  - typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  inline def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions]
  }
  
  inline def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions]
  }
  
  inline def PhoneSingleFactorInfoOptions(phoneNumber: String): typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distEsm5SrcModelPublicTypesMod.PhoneSingleFactorInfoOptions]
  }
}
