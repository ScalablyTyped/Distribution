package typings.firebaseAuthCompat

import typings.firebaseAuthCompat.anon.Call
import typings.firebaseAuthTypes.mod.FirebaseAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object appCompatMod {
  
  trait FirebaseApp extends StObject {
    
    var auth: js.UndefOr[js.Function0[FirebaseAuth]] = js.undefined
  }
  object FirebaseApp {
    
    inline def apply(): FirebaseApp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setAuth(value: () => FirebaseAuth): Self = StObject.set(x, "auth", js.Any.fromFunction0(value))
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    def auth(): FirebaseAuth
    def auth(app: FirebaseApp): FirebaseAuth
    @JSName("auth")
    var auth_Original: Call
  }
  object FirebaseNamespace {
    
    inline def apply(auth: Call): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setAuth(value: Call): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
}
