package typings.firebaseInstallations

import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerInstallations(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInstallations")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Define extension behavior of `registerInstallations`
    */
  object firebaseAppTypesAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      def installations(): FirebaseInstallations
    }
    object FirebaseApp {
      
      @scala.inline
      def apply(installations: () => FirebaseInstallations): FirebaseApp = {
        val __obj = js.Dynamic.literal(installations = js.Any.fromFunction0(installations))
        __obj.asInstanceOf[FirebaseApp]
      }
      
      @scala.inline
      implicit class FirebaseAppMutableBuilder[Self <: FirebaseApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInstallations(value: () => FirebaseInstallations): Self = StObject.set(x, "installations", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      def installations(): FirebaseInstallations = js.native
      def installations(app: FirebaseApp): FirebaseInstallations = js.native
    }
  }
}
