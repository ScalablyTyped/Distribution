package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CreateClusterRequest creates a cluster.
  */
@js.native
trait Schema$CreateClusterRequest extends js.Object {
  /**
    * A [cluster
    * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
    */
  var cluster: js.UndefOr[Schema$Cluster] = js.native
  /**
    * The parent (project and location) where the cluster will be created.
    * Specified in the format &#39;projects/x/locations/ *&#39;.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the parent field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$CreateClusterRequest {
  @scala.inline
  def apply(
    cluster: Schema$Cluster = null,
    parent: String = null,
    projectId: String = null,
    zone: String = null
  ): Schema$CreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateClusterRequest]
  }
}

