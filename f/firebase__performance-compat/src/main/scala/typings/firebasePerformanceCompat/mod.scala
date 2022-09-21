package typings.firebasePerformanceCompat

import typings.firebasePerformanceTypes.mod.FirebasePerformance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait FirebaseApp extends StObject {
    
    def performance(): FirebasePerformance
  }
  object FirebaseApp {
    
    inline def apply(performance: () => FirebasePerformance): FirebaseApp = {
      val __obj = js.Dynamic.literal(performance = js.Any.fromFunction0(performance))
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setPerformance(value: () => FirebasePerformance): Self = StObject.set(x, "performance", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    def performance(): FirebasePerformance = js.native
    def performance(app: FirebaseApp): FirebasePerformance = js.native
  }
}
