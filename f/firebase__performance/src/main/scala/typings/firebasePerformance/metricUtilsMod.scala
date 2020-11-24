package typings.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/performance/dist/src/utils/metric_utils", JSImport.Namespace)
@js.native
object metricUtilsMod extends js.Object {
  
  def convertMetricValueToInteger(providedValue: Double): Double = js.native
  
  def isValidMetricName(name: String): Boolean = js.native
  def isValidMetricName(name: String, traceName: String): Boolean = js.native
}
