package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition is a true/false test that determines when an alerting policy
  * should open an incident. If a condition evaluates to true, it signifies
  * that something is wrong.
  */
@js.native
trait Schema$Condition extends js.Object {
  /**
    * A condition that checks that a time series continues to receive new data
    * points.
    */
  var conditionAbsent: js.UndefOr[Schema$MetricAbsence] = js.native
  /**
    * A condition that compares a time series against a threshold.
    */
  var conditionThreshold: js.UndefOr[Schema$MetricThreshold] = js.native
  /**
    * A short name or phrase used to identify the condition in dashboards,
    * notifications, and incidents. To avoid confusion, don&#39;t use the same
    * display name for multiple conditions in the same policy.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Required if the condition exists. The unique resource name for this
    * condition. Its syntax is:
    * projects/[PROJECT_ID]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
    * [CONDITION_ID] is assigned by Stackdriver Monitoring when the condition
    * is created as part of a new or updated alerting policy.When calling the
    * alertPolicies.create method, do not include the name field in the
    * conditions of the requested alerting policy. Stackdriver Monitoring
    * creates the condition identifiers and includes them in the new
    * policy.When calling the alertPolicies.update method to update a policy,
    * including a condition name causes the existing condition to be updated.
    * Conditions without names are added to the updated policy. Existing
    * conditions are deleted if they are not updated.Best practice is to
    * preserve [CONDITION_ID] if you make only small changes, such as those to
    * condition thresholds, durations, or trigger values. Otherwise, treat the
    * change as a new condition and let the existing condition be deleted.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Condition {
  @scala.inline
  def apply(
    conditionAbsent: Schema$MetricAbsence = null,
    conditionThreshold: Schema$MetricThreshold = null,
    displayName: String = null,
    name: String = null
  ): Schema$Condition = {
    val __obj = js.Dynamic.literal()
    if (conditionAbsent != null) __obj.updateDynamic("conditionAbsent")(conditionAbsent.asInstanceOf[js.Any])
    if (conditionThreshold != null) __obj.updateDynamic("conditionThreshold")(conditionThreshold.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Condition]
  }
}

