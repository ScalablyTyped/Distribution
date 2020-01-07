package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of all clusters in a project.
  */
@js.native
trait Schema$ListClustersResponse extends js.Object {
  /**
    * Output only. The clusters in the project.
    */
  var clusters: js.UndefOr[js.Array[Schema$Cluster]] = js.native
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent &lt;code&gt;ListClustersRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[Schema$Cluster] = null, nextPageToken: String = null): Schema$ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListClustersResponse]
  }
}

