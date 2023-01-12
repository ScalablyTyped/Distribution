package typings.firebaseAuthTypes.mod

import typings.firebaseAuthTypes.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object firebaseAppTypesAugmentingMod {
  
  trait FirebaseApp extends StObject {
    
    var auth: js.UndefOr[js.Function0[FirebaseAuth]] = js.undefined
  }
  object FirebaseApp {
    
    inline def apply(): FirebaseApp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseApp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: () => FirebaseAuth): Self = StObject.set(x, "auth", js.Any.fromFunction0(value))
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    var auth: js.UndefOr[Call] = js.undefined
  }
  object FirebaseNamespace {
    
    inline def apply(): FirebaseNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirebaseNamespace] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: Call): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    }
  }
}
