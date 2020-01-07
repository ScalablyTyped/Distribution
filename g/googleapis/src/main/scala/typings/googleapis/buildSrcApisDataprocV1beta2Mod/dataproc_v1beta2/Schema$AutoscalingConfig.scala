package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Autoscaling Policy config associated with the cluster.
  */
@js.native
trait Schema$AutoscalingConfig extends js.Object {
  /**
    * Optional. The autoscaling policy used by the cluster.Only resource names
    * including projectid and location (region) are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]
    * projects/[project_id]/locations/[dataproc_region]/autoscalingPolicies/[policy_id]Note
    * that the policy must be in the same project and Cloud Dataproc region.
    */
  var policyUri: js.UndefOr[String] = js.native
}

object Schema$AutoscalingConfig {
  @scala.inline
  def apply(policyUri: String = null): Schema$AutoscalingConfig = {
    val __obj = js.Dynamic.literal()
    if (policyUri != null) __obj.updateDynamic("policyUri")(policyUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoscalingConfig]
  }
}

