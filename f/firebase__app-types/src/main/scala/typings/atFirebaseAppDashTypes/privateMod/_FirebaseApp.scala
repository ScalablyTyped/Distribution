package typings.atFirebaseAppDashTypes.privateMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _FirebaseApp extends FirebaseApp {
  var INTERNAL: FirebaseAppInternals = js.native
  def _removeServiceInstance(name: String): Unit = js.native
  def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
}

