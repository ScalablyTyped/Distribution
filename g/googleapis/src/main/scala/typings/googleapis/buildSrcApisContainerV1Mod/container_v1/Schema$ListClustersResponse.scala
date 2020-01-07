package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListClustersResponse is the result of ListClustersRequest.
  */
@js.native
trait Schema$ListClustersResponse extends js.Object {
  /**
    * A list of clusters in the project in the specified zone, or across all
    * ones.
    */
  var clusters: js.UndefOr[js.Array[Schema$Cluster]] = js.native
  /**
    * If any zones are listed here, the list of clusters returned may be
    * missing those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[Schema$Cluster] = null, missingZones: js.Array[String] = null): Schema$ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (missingZones != null) __obj.updateDynamic("missingZones")(missingZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListClustersResponse]
  }
}

