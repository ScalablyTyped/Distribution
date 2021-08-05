package typings.firebaseFunctions

import typings.firebaseFunctions.anon.Call
import typings.firebaseFunctionsTypes.mod.FirebaseFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait FirebaseApp extends StObject {
    
    var functions: js.UndefOr[js.Function1[/* regionOrCustomDomain */ js.UndefOr[String], FirebaseFunctions]] = js.undefined
  }
  object FirebaseApp {
    
    inline def apply(): FirebaseApp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setFunctions(value: /* regionOrCustomDomain */ js.UndefOr[String] => FirebaseFunctions): Self = StObject.set(x, "functions", js.Any.fromFunction1(value))
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    var functions: js.UndefOr[Call] = js.undefined
  }
  object FirebaseNamespace {
    
    inline def apply(): FirebaseNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setFunctions(value: Call): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    }
  }
}
