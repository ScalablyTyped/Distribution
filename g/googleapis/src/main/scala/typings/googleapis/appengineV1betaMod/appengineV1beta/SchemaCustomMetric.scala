package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows autoscaling based on Stackdriver metrics.
  */
@js.native
trait SchemaCustomMetric extends js.Object {
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
  implicit class SchemaCustomMetricOps[Self <: SchemaCustomMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    @scala.inline
    def setSingleInstanceAssignment(value: Double): Self = this.set("singleInstanceAssignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleInstanceAssignment: Self = this.set("singleInstanceAssignment", js.undefined)
    @scala.inline
    def setTargetType(value: String): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
    @scala.inline
    def setTargetUtilization(value: Double): Self = this.set("targetUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetUtilization: Self = this.set("targetUtilization", js.undefined)
  }
  
}

