package typings.firebasePerformance

import typings.firebaseAppTypes.mod.FirebaseNamespace
import typings.firebasePerformanceTypes.mod.FirebasePerformance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/performance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerPerformance(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPerformance")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseAppTypesAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      var performance: js.UndefOr[js.Function0[FirebasePerformance]] = js.undefined
    }
    object FirebaseApp {
      
      inline def apply(): FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FirebaseApp]
      }
      
      extension [Self <: FirebaseApp](x: Self) {
        
        inline def setPerformance(value: () => FirebasePerformance): Self = StObject.set(x, "performance", js.Any.fromFunction0(value))
        
        inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
      }
    }
    
    trait FirebaseNamespace extends StObject {
      
      var performance: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], FirebasePerformance]] = js.undefined
    }
    object FirebaseNamespace {
      
      inline def apply(): typings.firebasePerformance.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebasePerformance.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace]
      }
      
      extension [Self <: typings.firebasePerformance.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace](x: Self) {
        
        inline def setPerformance(value: /* app */ js.UndefOr[FirebaseApp] => FirebasePerformance): Self = StObject.set(x, "performance", js.Any.fromFunction1(value))
        
        inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
      }
    }
  }
}
