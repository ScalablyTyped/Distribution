package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows autoscaling based on Stackdriver metrics.
  */
@js.native
trait SchemaCustomMetric extends StObject {
  
  /**
    * Allows filtering on the metric&#39;s fields.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[String] = js.native
  
  /**
    * May be used instead of target_utilization when an instance can handle a
    * specific amount of work/resources and the metric value is equal to the
    * current amount of work remaining. The autoscaler will try to keep the
    * number of instances equal to the metric value divided by
    * single_instance_assignment.
    */
  var singleInstanceAssignment: js.UndefOr[Double] = js.native
  
  /**
    * The type of the metric. Must be a string representing a Stackdriver
    * metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
    */
  var targetType: js.UndefOr[String] = js.native
  
  /**
    * The target value for the metric.
    */
  var targetUtilization: js.UndefOr[Double] = js.native
}
object SchemaCustomMetric {
  
  @scala.inline
  def apply(): SchemaCustomMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomMetric]
  }
  
  @scala.inline
  implicit class SchemaCustomMetricMutableBuilder[Self <: SchemaCustomMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setSingleInstanceAssignment(value: Double): Self = StObject.set(x, "singleInstanceAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleInstanceAssignmentUndefined: Self = StObject.set(x, "singleInstanceAssignment", js.undefined)
    
    @scala.inline
    def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    @scala.inline
    def setTargetUtilization(value: Double): Self = StObject.set(x, "targetUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUtilizationUndefined: Self = StObject.set(x, "targetUtilization", js.undefined)
  }
}
