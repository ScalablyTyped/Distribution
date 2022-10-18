package typings.firebaseUtil.anon

import typings.firebaseUtil.distSrcEmulatorMod.FirebaseSignInProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigninproviderFirebaseSignInProvider extends StObject {
  
  var identities: js.UndefOr[providerinFirebaseSignInP] = js.undefined
  
  var sign_in_provider: FirebaseSignInProvider
}
object SigninproviderFirebaseSignInProvider {
  
  inline def apply(sign_in_provider: FirebaseSignInProvider): SigninproviderFirebaseSignInProvider = {
    val __obj = js.Dynamic.literal(sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigninproviderFirebaseSignInProvider]
  }
  
  extension [Self <: SigninproviderFirebaseSignInProvider](x: Self) {
    
    inline def setIdentities(value: providerinFirebaseSignInP): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setSign_in_provider(value: FirebaseSignInProvider): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
  }
}
