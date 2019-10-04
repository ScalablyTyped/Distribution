package typings.atFirebaseAnalytics.atFirebaseAnalyticsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.FirebaseAnalytics
import typings.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.SettingsOptions
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAppDashTypes.privateMod._FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def factory(app: FirebaseApp, extendApp: js.Function1[/* props */ StringDictionary[js.Any], Unit]): FirebaseAnalytics = js.native
  def registerAnalytics(instance: _FirebaseNamespace): Unit = js.native
  def resetGlobalVars(): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean): Unit = js.native
  def resetGlobalVars(newGlobalInitDone: Boolean, newGaInitializedPromise: js.Object): Unit = js.native
  def settings(options: SettingsOptions): Unit = js.native
}

