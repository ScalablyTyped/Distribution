package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListDataSourceResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var sources: js.UndefOr[js.Array[Schema$DataSource]] = js.native
}

object Schema$ListDataSourceResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sources: js.Array[Schema$DataSource] = null): Schema$ListDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDataSourceResponse]
  }
}

