package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.anon.DynamicConfigPromisesList
import typings.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typings.firebaseAnalyticsTypes.mod.SettingsOptions
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(app.asInstanceOf[js.Any], installations.asInstanceOf[js.Any])).asInstanceOf[FirebaseAnalytics]
  
  inline def getGlobalVars(): DynamicConfigPromisesList = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalVars")().asInstanceOf[DynamicConfigPromisesList]
  
  inline def registerAnalytics(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAnalytics")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetGlobalVars(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")().asInstanceOf[Unit]
  inline def resetGlobalVars(newGlobalInitDone: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def resetGlobalVars(newGlobalInitDone: Boolean, newInitializationPromisesMap: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: Unit,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(newGlobalInitDone: Unit, newInitializationPromisesMap: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Unit,
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resetGlobalVars(
    newGlobalInitDone: Unit,
    newInitializationPromisesMap: Unit,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetGlobalVars")(newGlobalInitDone.asInstanceOf[js.Any], newInitializationPromisesMap.asInstanceOf[js.Any], newDynamicPromises.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def settings(options: SettingsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Define extension behavior of `registerAnalytics`
    */
  object firebaseAppTypesAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      def analytics(): FirebaseAnalytics
    }
    object FirebaseApp {
      
      inline def apply(analytics: () => FirebaseAnalytics): typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod.FirebaseApp = {
        val __obj = js.Dynamic.literal(analytics = js.Any.fromFunction0(analytics))
        __obj.asInstanceOf[typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod.FirebaseApp]
      }
      
      extension [Self <: typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod.FirebaseApp](x: Self) {
        
        inline def setAnalytics(value: () => FirebaseAnalytics): Self = StObject.set(x, "analytics", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      def analytics(): FirebaseAnalytics = js.native
      def analytics(app: typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod.FirebaseApp): FirebaseAnalytics = js.native
    }
  }
  
  object global {
    
    type Window = StringDictionary[js.Any]
  }
}
