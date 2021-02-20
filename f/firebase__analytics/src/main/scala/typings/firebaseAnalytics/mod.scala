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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/analytics", "factory")
  @js.native
  def factory(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = js.native
  
  @JSImport("@firebase/analytics", "getGlobalVars")
  @js.native
  def getGlobalVars(): DynamicConfigPromisesList = js.native
  
  @JSImport("@firebase/analytics", "registerAnalytics")
  @js.native
  def registerAnalytics(instance: FirebaseNamespace): Unit = js.native
  
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(): Unit = js.native
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: js.UndefOr[scala.Nothing],
    newInitializationPromisesMap: js.UndefOr[scala.Nothing],
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: js.UndefOr[scala.Nothing], newInitializationPromisesMap: js.Object): Unit = js.native
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: js.UndefOr[scala.Nothing],
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: Boolean): Unit = js.native
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.UndefOr[scala.Nothing],
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: Boolean, newInitializationPromisesMap: js.Object): Unit = js.native
  @JSImport("@firebase/analytics", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  
  @JSImport("@firebase/analytics", "settings")
  @js.native
  def settings(options: SettingsOptions): Unit = js.native
  
  /**
    * Define extension behavior of `registerAnalytics`
    */
  object firebaseAppTypesAugmentingMod {
    
    @js.native
    trait FirebaseApp extends StObject {
      
      def analytics(): FirebaseAnalytics = js.native
    }
    object FirebaseApp {
      
      @scala.inline
      def apply(analytics: () => FirebaseAnalytics): typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod.FirebaseApp = {
        val __obj = js.Dynamic.literal(analytics = js.Any.fromFunction0(analytics))
        __obj.asInstanceOf[typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod.FirebaseApp]
      }
      
      @scala.inline
      implicit class FirebaseAppMutableBuilder[Self <: typings.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod.FirebaseApp] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnalytics(value: () => FirebaseAnalytics): Self = StObject.set(x, "analytics", js.Any.fromFunction0(value))
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
