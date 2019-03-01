package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersResponse extends js.Object {
  /** Output-only. The clusters in the project. */
  var clusters: js.UndefOr[js.Array[Cluster]] = js.undefined
  /**
    * Output-only. This token is included in the response if there are more results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent ListClustersRequest.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListClustersResponse {
  @scala.inline
  def apply(clusters: js.Array[Cluster] = null, nextPageToken: java.lang.String = null): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (clusters != null) __obj.updateDynamic("clusters")(clusters)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListClustersResponse]
  }
}

