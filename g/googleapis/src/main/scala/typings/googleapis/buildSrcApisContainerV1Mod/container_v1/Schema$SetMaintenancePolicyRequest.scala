package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetMaintenancePolicyRequest sets the maintenance policy for a cluster.
  */
@js.native
trait Schema$SetMaintenancePolicyRequest extends js.Object {
  /**
    * The name of the cluster to update.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The maintenance policy to be set for the cluster. An empty field clears
    * the existing maintenance policy.
    */
  var maintenancePolicy: js.UndefOr[Schema$MaintenancePolicy] = js.native
  /**
    * The name (project, location, cluster id) of the cluster to set
    * maintenance policy. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840).
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$SetMaintenancePolicyRequest {
  @scala.inline
  def apply(
    clusterId: String = null,
    maintenancePolicy: Schema$MaintenancePolicy = null,
    name: String = null,
    projectId: String = null,
    zone: String = null
  ): Schema$SetMaintenancePolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (maintenancePolicy != null) __obj.updateDynamic("maintenancePolicy")(maintenancePolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetMaintenancePolicyRequest]
  }
}

