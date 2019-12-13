package typings.atFirebaseAnalytics.atFirebaseAnalyticsMod

import typings.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod.FirebaseAnalytics
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics", "factory")
@js.native
object factory extends js.Object {
  def apply(app: FirebaseApp, installations: FirebaseInstallations): FirebaseAnalytics = js.native
}

