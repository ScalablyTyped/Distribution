package typings.firebaseAuth.distRnSrcModelPublicTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions
  - typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions
  - typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  inline def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneMultiFactorEnrollInfoOptions]
  }
  
  inline def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneMultiFactorSignInInfoOptions]
  }
  
  inline def PhoneSingleFactorInfoOptions(phoneNumber: String): typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distRnSrcModelPublicTypesMod.PhoneSingleFactorInfoOptions]
  }
}
