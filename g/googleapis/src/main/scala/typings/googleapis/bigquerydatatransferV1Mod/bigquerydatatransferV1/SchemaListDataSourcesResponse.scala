package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns list of supported data sources and their metadata.
  */
@js.native
trait SchemaListDataSourcesResponse extends js.Object {
  /**
    * List of supported data sources and their transfer settings.
    */
  var dataSources: js.UndefOr[js.Array[SchemaDataSource]] = js.native
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `ListDataSourcesRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDataSourcesResponse {
  @scala.inline
  def apply(dataSources: js.Array[SchemaDataSource] = null, nextPageToken: String = null): SchemaListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDataSourcesResponse]
  }
}

