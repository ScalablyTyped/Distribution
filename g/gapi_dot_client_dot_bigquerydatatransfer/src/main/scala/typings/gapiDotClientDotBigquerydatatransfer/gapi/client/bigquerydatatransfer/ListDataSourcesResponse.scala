package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataSourcesResponse extends js.Object {
  /** List of supported data sources and their transfer settings. */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.undefined
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `ListDataSourcesRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(dataSources: js.Array[DataSource] = null, nextPageToken: String = null): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
}

