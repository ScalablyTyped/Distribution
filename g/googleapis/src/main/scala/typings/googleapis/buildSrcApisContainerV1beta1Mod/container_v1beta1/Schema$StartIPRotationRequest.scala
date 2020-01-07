package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StartIPRotationRequest creates a new IP for the cluster and then performs a
  * node upgrade on each node pool to point to the new IP.
  */
@js.native
trait Schema$StartIPRotationRequest extends js.Object {
  /**
    * Deprecated. The name of the cluster. This field has been deprecated and
    * replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster id) of the cluster to start IP
    * rotation. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://developers.google.com/console/help/new/#projectnumber).
    * This field has been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Whether to rotate credentials during IP rotation.
    */
  var rotateCredentials: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$StartIPRotationRequest {
  @scala.inline
  def apply(
    clusterId: String = null,
    name: String = null,
    projectId: String = null,
    rotateCredentials: js.UndefOr[Boolean] = js.undefined,
    zone: String = null
  ): Schema$StartIPRotationRequest = {
    val __obj = js.Dynamic.literal()
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateCredentials)) __obj.updateDynamic("rotateCredentials")(rotateCredentials.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StartIPRotationRequest]
  }
}

