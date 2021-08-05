package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows autoscaling based on Stackdriver metrics.
  */
trait SchemaCustomMetric extends StObject {
  
  /**
    * Allows filtering on the metric&#39;s fields.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[String] = js.undefined
  
  /**
    * May be used instead of target_utilization when an instance can handle a
    * specific amount of work/resources and the metric value is equal to the
    * current amount of work remaining. The autoscaler will try to keep the
    * number of instances equal to the metric value divided by
    * single_instance_assignment.
    */
  var singleInstanceAssignment: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of the metric. Must be a string representing a Stackdriver
    * metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
    */
  var targetType: js.UndefOr[String] = js.undefined
  
  /**
    * The target value for the metric.
    */
  var targetUtilization: js.UndefOr[Double] = js.undefined
}
object SchemaCustomMetric {
  
  inline def apply(): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomMetric]
  }
  
  extension [Self <: SchemaCustomMetric](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setSingleInstanceAssignment(value: Double): Self = StObject.set(x, "singleInstanceAssignment", value.asInstanceOf[js.Any])
    
    inline def setSingleInstanceAssignmentUndefined: Self = StObject.set(x, "singleInstanceAssignment", js.undefined)
    
    inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setTargetUtilization(value: Double): Self = StObject.set(x, "targetUtilization", value.asInstanceOf[js.Any])
    
    inline def setTargetUtilizationUndefined: Self = StObject.set(x, "targetUtilization", js.undefined)
  }
}
