package typings.firebasePerformance

import typings.firebaseAppTypes.mod.FirebaseNamespace
import typings.firebasePerformanceTypes.mod.FirebasePerformance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/performance", "registerPerformance")
  @js.native
  def registerPerformance(instance: FirebaseNamespace): Unit = js.native
  
  /* augmented module */
  object firebaseAppTypesAugmentingMod {
    
    @js.native
    trait FirebaseApp extends StObject {
      
      var performance: js.UndefOr[js.Function0[FirebasePerformance]] = js.native
    }
    object FirebaseApp {
      
      @scala.inline
      def apply(): FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FirebaseApp]
      }
      
      @scala.inline
      implicit class FirebaseAppMutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPerformance(value: () => FirebasePerformance): Self = StObject.set(x, "performance", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      var performance: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], FirebasePerformance]] = js.native
    }
    object FirebaseNamespace {
      
      @scala.inline
      def apply(): typings.firebasePerformance.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebasePerformance.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace]
      }
      
      @scala.inline
      implicit class FirebaseNamespaceMutableBuilder[Self <: typings.firebasePerformance.mod.firebaseAppTypesAugmentingMod.FirebaseNamespace] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPerformance(value: /* app */ js.UndefOr[FirebaseApp] => FirebasePerformance): Self = StObject.set(x, "performance", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
      }
    }
  }
}
