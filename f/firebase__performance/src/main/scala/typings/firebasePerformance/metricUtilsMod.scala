package typings.firebasePerformance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricUtilsMod {
  
  @JSImport("@firebase/performance/dist/src/utils/metric_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertMetricValueToInteger(providedValue: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMetricValueToInteger")(providedValue.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isValidMetricName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidMetricName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidMetricName(name: String, traceName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMetricName")(name.asInstanceOf[js.Any], traceName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
