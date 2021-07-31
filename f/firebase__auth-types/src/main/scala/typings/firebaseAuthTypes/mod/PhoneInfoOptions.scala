package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions
  - typings.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions
  - typings.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  @scala.inline
  def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typings.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions]
  }
  
  @scala.inline
  def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typings.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions]
  }
  
  @scala.inline
  def PhoneSingleFactorInfoOptions(phoneNumber: String): typings.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions]
  }
}
