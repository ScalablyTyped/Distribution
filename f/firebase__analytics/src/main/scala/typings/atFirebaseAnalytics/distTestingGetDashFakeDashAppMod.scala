package typings.atFirebaseAnalytics

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/testing/get-fake-app", JSImport.Namespace)
@js.native
object distTestingGetDashFakeDashAppMod extends js.Object {
  def getFakeApp(): FirebaseApp = js.native
  def getFakeApp(measurementId: String): FirebaseApp = js.native
  def getFakeApp(measurementId: String, fid: String): FirebaseApp = js.native
}

