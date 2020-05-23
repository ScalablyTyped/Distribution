package typings.firebaseRemoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/client/exponential_backoff", JSImport.Namespace)
@js.native
object exponentialBackoffMod extends js.Object {
  val MAX_VALUE_MILLIS: Double = js.native
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  def calculateBackoffMillis(backoffCount: Double): Double = js.native
}

