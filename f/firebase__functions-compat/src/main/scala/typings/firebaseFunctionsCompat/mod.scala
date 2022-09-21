package typings.firebaseFunctionsCompat

import typings.firebaseFunctionsCompat.anon.Call
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait FirebaseApp extends StObject {
    
    def functions(): FirebaseFunctions = js.native
    def functions(regionOrCustomDomain: String): FirebaseFunctions = js.native
  }
  
  trait FirebaseNamespace extends StObject {
    
    def functions(): FirebaseFunctions
    def functions(app: FirebaseApp): FirebaseFunctions
    @JSName("functions")
    var functions_Original: Call
  }
  object FirebaseNamespace {
    
    inline def apply(functions: Call): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setFunctions(value: Call): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    }
  }
}
