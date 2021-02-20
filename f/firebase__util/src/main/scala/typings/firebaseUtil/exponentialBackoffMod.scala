package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentialBackoffMod {
  
  @JSImport("@firebase/util/dist/src/exponential_backoff", "MAX_VALUE_MILLIS")
  @js.native
  val MAX_VALUE_MILLIS: Double = js.native
  
  @JSImport("@firebase/util/dist/src/exponential_backoff", "RANDOM_FACTOR")
  @js.native
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  
  @JSImport("@firebase/util/dist/src/exponential_backoff", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double): Double = js.native
  @JSImport("@firebase/util/dist/src/exponential_backoff", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: js.UndefOr[scala.Nothing], backoffFactor: Double): Double = js.native
  @JSImport("@firebase/util/dist/src/exponential_backoff", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double): Double = js.native
  @JSImport("@firebase/util/dist/src/exponential_backoff", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double, backoffFactor: Double): Double = js.native
}
