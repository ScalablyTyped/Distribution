package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BigtableInstanceAdmin.ListClusters.
  */
@js.native
trait Schema$ListClustersResponse extends js.Object {
  /**
    * The list of requested clusters.
    */
  var clusters: js.UndefOr[js.Array[Schema$Cluster]] = js.native
  /**
    * Locations from which Cluster information could not be retrieved, due to
    * an outage or some other transient condition. Clusters from these
    * locations may be missing from `clusters`, or may only have partial
    * information returned. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListClustersResponse {
  @scala.inline
  def apply(
    clusters: js.Array[Schema$Cluster] = null,
    failedLocations: js.Array[String] = null,
    nextPageToken: String = null
  ): Schema$ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (failedLocations != null) __obj.updateDynamic("failedLocations")(failedLocations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListClustersResponse]
  }
}

