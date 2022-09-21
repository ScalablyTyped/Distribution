package typings.firebaseInstallationsCompat

import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define extension behavior of `registerInstallations`
  */
object mod {
  
  trait FirebaseApp extends StObject {
    
    def installations(): FirebaseInstallations
  }
  object FirebaseApp {
    
    inline def apply(installations: () => FirebaseInstallations): FirebaseApp = {
      val __obj = js.Dynamic.literal(installations = js.Any.fromFunction0(installations))
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setInstallations(value: () => FirebaseInstallations): Self = StObject.set(x, "installations", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    def installations(): FirebaseInstallations = js.native
    def installations(app: FirebaseApp): FirebaseInstallations = js.native
  }
}
