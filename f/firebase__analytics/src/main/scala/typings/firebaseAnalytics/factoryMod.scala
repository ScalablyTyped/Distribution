package typings.firebaseAnalytics

import typings.firebaseAnalytics.anon.DynamicConfigPromisesList
import typings.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typings.firebaseAnalyticsTypes.mod.SettingsOptions
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@firebase/analytics/dist/src/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(app.asInstanceOf[js.Any], installations.asInstanceOf[js.Any])).asInstanceOf[FirebaseAnalytics]
  
  inline def getGlobalVars(): DynamicConfigPromisesList = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalVars")().asInstanceOf[DynamicConfigPromisesList]
  
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
}
