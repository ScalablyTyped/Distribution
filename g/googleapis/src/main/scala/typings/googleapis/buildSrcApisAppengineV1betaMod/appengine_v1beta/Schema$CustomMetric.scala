package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows autoscaling based on Stackdriver metrics.
  */
@js.native
trait Schema$CustomMetric extends js.Object {
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

object Schema$CustomMetric {
  @scala.inline
  def apply(
    filter: String = null,
    metricName: String = null,
    singleInstanceAssignment: Int | Double = null,
    targetType: String = null,
    targetUtilization: Int | Double = null
  ): Schema$CustomMetric = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (singleInstanceAssignment != null) __obj.updateDynamic("singleInstanceAssignment")(singleInstanceAssignment.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    if (targetUtilization != null) __obj.updateDynamic("targetUtilization")(targetUtilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomMetric]
  }
}

