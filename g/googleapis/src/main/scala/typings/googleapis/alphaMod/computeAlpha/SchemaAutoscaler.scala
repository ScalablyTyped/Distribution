package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an Autoscaler resource. Autoscalers allow you to automatically
  * scale virtual machine instances in managed instance groups according to an
  * autoscaling policy that you define. For more information, read Autoscaling
  * Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for
  * v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (==
  * resource_for v1.regionAutoscalers ==)
  */
@js.native
trait SchemaAutoscaler extends js.Object {
  /**
    * The configuration parameters for the autoscaling algorithm. You can
    * define one or more of the policies for an autoscaler: cpuUtilization,
    * customMetricUtilizations, and loadBalancingUtilization.  If none of these
    * are specified, the default will be to autoscale based on cpuUtilization
    * to 0.6 or 60%.
    */
  var autoscalingPolicy: js.UndefOr[SchemaAutoscalingPolicy] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#autoscaler for
    * autoscalers.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Target recommended MIG size (number of instances) computed
    * by autoscaler. Autoscaler calculates recommended MIG size even when
    * autoscaling policy mode is different from ON. This field is empty when
    * autoscaler is not connected to the existing managed instance group or
    * autoscaler did not generate its prediction.
    */
  var recommendedSize: js.UndefOr[Double] = js.native
  /**
    * [Output Only] URL of the region where the instance group resides (for
    * autoscalers living in regional scope).
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of the autoscaler configuration.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output Only] Human-readable details about the current state of the
    * autoscaler. Read the documentation for Commonly returned status messages
    * for examples of status messages you might encounter.
    */
  var statusDetails: js.UndefOr[js.Array[SchemaAutoscalerStatusDetails]] = js.native
  /**
    * URL of the managed instance group that this autoscaler will scale.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the zone where the instance group resides (for
    * autoscalers living in zonal scope).
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaAutoscaler {
  @scala.inline
  def apply(
    autoscalingPolicy: SchemaAutoscalingPolicy = null,
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    recommendedSize: js.UndefOr[Double] = js.undefined,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    status: String = null,
    statusDetails: js.Array[SchemaAutoscalerStatusDetails] = null,
    target: String = null,
    zone: String = null
  ): SchemaAutoscaler = {
    val __obj = js.Dynamic.literal()
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(recommendedSize)) __obj.updateDynamic("recommendedSize")(recommendedSize.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscaler]
  }
}

