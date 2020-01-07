package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the conditions under which some aspect of your system is
  * considered to be &quot;unhealthy&quot; and the ways to notify people or
  * services about this state. For an overview of alert policies, see
  * Introduction to Alerting.
  */
@js.native
trait Schema$AlertPolicy extends js.Object {
  /**
    * How to combine the results of multiple conditions to determine if an
    * incident should be opened.
    */
  var combiner: js.UndefOr[String] = js.native
  /**
    * A list of conditions for the policy. The conditions are combined by AND
    * or OR according to the combiner field. If the combined conditions
    * evaluate to true, then an incident is created. A policy can have from one
    * to six conditions.
    */
  var conditions: js.UndefOr[js.Array[Schema$Condition]] = js.native
  /**
    * A read-only record of the creation of the alerting policy. If provided in
    * a call to create or update, this field will be ignored.
    */
  var creationRecord: js.UndefOr[Schema$MutationRecord] = js.native
  /**
    * A short name or phrase used to identify the policy in dashboards,
    * notifications, and incidents. To avoid confusion, don&#39;t use the same
    * display name for multiple policies in the same project. The name is
    * limited to 512 Unicode characters.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Documentation that is included with notifications and incidents related
    * to this policy. Best practice is for the documentation to include
    * information to help responders understand, mitigate, escalate, and
    * correct the underlying problems detected by the alerting policy.
    * Notification channels that have limited capacity might not show this
    * documentation.
    */
  var documentation: js.UndefOr[Schema$Documentation] = js.native
  /**
    * Whether or not the policy is enabled. On write, the default
    * interpretation if unset is that the policy is enabled. On read, clients
    * should not make any assumption about the state if it has not been
    * populated. The field should always be populated on List and Get
    * operations, unless a field projection has been specified that strips it
    * out.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * A read-only record of the most recent change to the alerting policy. If
    * provided in a call to create or update, this field will be ignored.
    */
  var mutationRecord: js.UndefOr[Schema$MutationRecord] = js.native
  /**
    * Required if the policy exists. The resource name for this policy. The
    * syntax is: projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
    * [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy
    * is created. When calling the alertPolicies.create method, do not include
    * the name field in the alerting policy passed as part of the request.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Identifies the notification channels to which notifications should be
    * sent when incidents are opened or closed or when new violations occur on
    * an already opened incident. Each element of this array corresponds to the
    * name field in each of the NotificationChannel objects that are returned
    * from the ListNotificationChannels method. The syntax of the entries in
    * this field is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]
    */
  var notificationChannels: js.UndefOr[js.Array[String]] = js.native
  /**
    * User-supplied key/value data to be used for organizing and identifying
    * the AlertPolicy objects.The field can contain up to 64 entries. Each key
    * and value is limited to 63 Unicode characters or 128 bytes, whichever is
    * smaller. Labels and values can contain only lowercase letters, numerals,
    * underscores, and dashes. Keys must begin with a letter.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$AlertPolicy {
  @scala.inline
  def apply(
    combiner: String = null,
    conditions: js.Array[Schema$Condition] = null,
    creationRecord: Schema$MutationRecord = null,
    displayName: String = null,
    documentation: Schema$Documentation = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    mutationRecord: Schema$MutationRecord = null,
    name: String = null,
    notificationChannels: js.Array[String] = null,
    userLabels: StringDictionary[String] = null
  ): Schema$AlertPolicy = {
    val __obj = js.Dynamic.literal()
    if (combiner != null) __obj.updateDynamic("combiner")(combiner.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (creationRecord != null) __obj.updateDynamic("creationRecord")(creationRecord.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (mutationRecord != null) __obj.updateDynamic("mutationRecord")(mutationRecord.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationChannels != null) __obj.updateDynamic("notificationChannels")(notificationChannels.asInstanceOf[js.Any])
    if (userLabels != null) __obj.updateDynamic("userLabels")(userLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AlertPolicy]
  }
}

