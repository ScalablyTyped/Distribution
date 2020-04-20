package typings.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/performance/dist/src/services/remote_config_service", JSImport.Namespace)
@js.native
object remoteConfigServiceMod extends js.Object {
  def getConfig(iid: String): js.Promise[Unit] = js.native
  def isDestFl(iid: String, rolloutPercent: Double): Boolean = js.native
}

