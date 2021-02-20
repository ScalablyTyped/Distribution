package typings.firebaseAnalytics

import typings.firebaseAnalytics.anon.DynamicConfigPromisesList
import typings.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typings.firebaseAnalyticsTypes.mod.SettingsOptions
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@firebase/analytics/dist/src/factory", "factory")
  @js.native
  def factory(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = js.native
  
  @JSImport("@firebase/analytics/dist/src/factory", "getGlobalVars")
  @js.native
  def getGlobalVars(): DynamicConfigPromisesList = js.native
  
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: js.UndefOr[scala.Nothing],
    newInitializationPromisesMap: js.UndefOr[scala.Nothing],
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: js.UndefOr[scala.Nothing], newInitializationPromisesMap: js.Object): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: js.UndefOr[scala.Nothing],
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: Boolean): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.UndefOr[scala.Nothing],
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(newGlobalInitDone: Boolean, newInitializationPromisesMap: js.Object): Unit = js.native
  @JSImport("@firebase/analytics/dist/src/factory", "resetGlobalVars")
  @js.native
  def resetGlobalVars(
    newGlobalInitDone: Boolean,
    newInitializationPromisesMap: js.Object,
    newDynamicPromises: js.Array[scala.Nothing]
  ): Unit = js.native
  
  @JSImport("@firebase/analytics/dist/src/factory", "settings")
  @js.native
  def settings(options: SettingsOptions): Unit = js.native
}
