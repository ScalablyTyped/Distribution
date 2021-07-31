package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exponentialBackoffMod {
  
  @JSImport("@firebase/util/dist/src/exponential_backoff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/util/dist/src/exponential_backoff", "MAX_VALUE_MILLIS")
  @js.native
  val MAX_VALUE_MILLIS: Double = js.native
  
  @JSImport("@firebase/util/dist/src/exponential_backoff", "RANDOM_FACTOR")
  @js.native
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  
  @scala.inline
  def calculateBackoffMillis(backoffCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double, backoffFactor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any], backoffFactor.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Unit, backoffFactor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateBackoffMillis")(backoffCount.asInstanceOf[js.Any], intervalMillis.asInstanceOf[js.Any], backoffFactor.asInstanceOf[js.Any])).asInstanceOf[Double]
}
