package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListSearchApplicationsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var searchApplications: js.UndefOr[js.Array[Schema$SearchApplication]] = js.native
}

object Schema$ListSearchApplicationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, searchApplications: js.Array[Schema$SearchApplication] = null): Schema$ListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (searchApplications != null) __obj.updateDynamic("searchApplications")(searchApplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSearchApplicationsResponse]
  }
}

