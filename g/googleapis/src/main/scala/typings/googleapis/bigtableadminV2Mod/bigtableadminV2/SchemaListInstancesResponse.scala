package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BigtableInstanceAdmin.ListInstances.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * Locations from which Instance information could not be retrieved, due to
    * an outage or some other transient condition. Instances whose Clusters are
    * all in one of the failed locations may be missing from `instances`, and
    * Instances with at least one Cluster in a failed location may only have
    * partial information returned. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The list of requested instances.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInstancesResponse {
  @scala.inline
  def apply(
    failedLocations: js.Array[String] = null,
    instances: js.Array[SchemaInstance] = null,
    nextPageToken: String = null
  ): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (failedLocations != null) __obj.updateDynamic("failedLocations")(failedLocations.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
}

