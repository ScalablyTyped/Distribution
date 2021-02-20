package typings.firebasePerformance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricUtilsMod {
  
  @JSImport("@firebase/performance/dist/src/utils/metric_utils", "convertMetricValueToInteger")
  @js.native
  def convertMetricValueToInteger(providedValue: Double): Double = js.native
  
  @JSImport("@firebase/performance/dist/src/utils/metric_utils", "isValidMetricName")
  @js.native
  def isValidMetricName(name: String): Boolean = js.native
  @JSImport("@firebase/performance/dist/src/utils/metric_utils", "isValidMetricName")
  @js.native
  def isValidMetricName(name: String, traceName: String): Boolean = js.native
}
