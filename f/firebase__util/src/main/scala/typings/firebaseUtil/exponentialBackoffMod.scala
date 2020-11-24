package typings.firebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/util/dist/src/exponential_backoff", JSImport.Namespace)
@js.native
object exponentialBackoffMod extends js.Object {
  
  val MAX_VALUE_MILLIS: Double = js.native
  
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  
  def calculateBackoffMillis(backoffCount: Double): Double = js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: js.UndefOr[scala.Nothing], backoffFactor: Double): Double = js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double): Double = js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double, backoffFactor: Double): Double = js.native
}
