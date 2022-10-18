package typings.firebaseUtil.anon

import typings.firebaseUtil.distUtilMod.FirebaseSignInProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var identities: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ provider in @firebase/util.@firebase/util/dist/util.FirebaseSignInProvider ]:? std.Array<string>} */ js.Any
  ] = js.undefined
  
  var sign_in_provider: FirebaseSignInProvider
}
object `1` {
  
  inline def apply(sign_in_provider: FirebaseSignInProvider): `1` = {
    val __obj = js.Dynamic.literal(sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setIdentities(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ provider in @firebase/util.@firebase/util/dist/util.FirebaseSignInProvider ]:? std.Array<string>} */ js.Any
    ): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setSign_in_provider(value: FirebaseSignInProvider): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
  }
}
