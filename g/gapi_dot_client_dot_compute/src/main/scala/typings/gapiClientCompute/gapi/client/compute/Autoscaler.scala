package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoscaler extends js.Object {
  /**
    * The configuration parameters for the autoscaling algorithm. You can define one or more of the policies for an autoscaler: cpuUtilization,
    * customMetricUtilizations, and loadBalancingUtilization.
    *
    * If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
    */
  var autoscalingPolicy: js.UndefOr[AutoscalingPolicy] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#autoscaler for autoscalers. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] URL of the region where the instance group resides (for autoscalers living in regional scope). */
  var region: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] The status of the autoscaler configuration. */
  var status: js.UndefOr[String] = js.undefined
  /**
    * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for
    * examples of status messages you might encounter.
    */
  var statusDetails: js.UndefOr[js.Array[AutoscalerStatusDetails]] = js.undefined
  /** URL of the managed instance group that this autoscaler will scale. */
  var target: js.UndefOr[String] = js.undefined
  /** [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal scope). */
  var zone: js.UndefOr[String] = js.undefined
}

object Autoscaler {
  @scala.inline
  def apply(
    autoscalingPolicy: AutoscalingPolicy = null,
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    region: String = null,
    selfLink: String = null,
    status: String = null,
    statusDetails: js.Array[AutoscalerStatusDetails] = null,
    target: String = null,
    zone: String = null
  ): Autoscaler = {
    val __obj = js.Dynamic.literal()
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoscaler]
  }
}

