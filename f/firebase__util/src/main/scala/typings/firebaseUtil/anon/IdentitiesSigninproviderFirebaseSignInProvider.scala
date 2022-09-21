package typings.firebaseUtil.anon

import org.scalablytyped.runtime.TopLevel
import typings.firebaseUtil.mod.FirebaseSignInProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitiesSigninproviderFirebaseSignInProvider extends StObject {
  
  var identities: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ provider in @firebase/util.@firebase/util.FirebaseSignInProvider ]:? std.Array<string>}
    */ typings.firebaseUtil.firebaseUtilStrings.IdentitiesSigninproviderFirebaseSignInProvider & TopLevel[Any]
  ] = js.undefined
  
  var sign_in_provider: FirebaseSignInProvider
}
object IdentitiesSigninproviderFirebaseSignInProvider {
  
  inline def apply(sign_in_provider: FirebaseSignInProvider): IdentitiesSigninproviderFirebaseSignInProvider = {
    val __obj = js.Dynamic.literal(sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitiesSigninproviderFirebaseSignInProvider]
  }
  
  extension [Self <: IdentitiesSigninproviderFirebaseSignInProvider](x: Self) {
    
    inline def setIdentities(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ provider in @firebase/util.@firebase/util.FirebaseSignInProvider ]:? std.Array<string>}
      */ typings.firebaseUtil.firebaseUtilStrings.IdentitiesSigninproviderFirebaseSignInProvider & TopLevel[Any]
    ): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setSign_in_provider(value: FirebaseSignInProvider): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
  }
}
