package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetMasterAuthRequest updates the admin password of a cluster.
  */
@js.native
trait Schema$SetMasterAuthRequest extends js.Object {
  /**
    * The exact form of action to be taken on the master auth.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the cluster to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster) of the cluster to set auth.
    * Specified in the format &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A description of the update.
    */
  var update: js.UndefOr[Schema$MasterAuth] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$SetMasterAuthRequest {
  @scala.inline
  def apply(
    action: String = null,
    clusterId: String = null,
    name: String = null,
    projectId: String = null,
    update: Schema$MasterAuth = null,
    zone: String = null
  ): Schema$SetMasterAuthRequest = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetMasterAuthRequest]
  }
}

