package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns list of supported data sources and their metadata.
  */
@js.native
trait Schema$ListDataSourcesResponse extends js.Object {
  /**
    * List of supported data sources and their transfer settings.
    */
  var dataSources: js.UndefOr[js.Array[Schema$DataSource]] = js.native
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `ListDataSourcesRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDataSourcesResponse {
  @scala.inline
  def apply(dataSources: js.Array[Schema$DataSource] = null, nextPageToken: String = null): Schema$ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDataSourcesResponse]
  }
}

