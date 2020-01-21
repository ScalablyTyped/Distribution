package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListSearchApplicationsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var searchApplications: js.UndefOr[js.Array[SchemaSearchApplication]] = js.native
}

object SchemaListSearchApplicationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, searchApplications: js.Array[SchemaSearchApplication] = null): SchemaListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (searchApplications != null) __obj.updateDynamic("searchApplications")(searchApplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSearchApplicationsResponse]
  }
}

