package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListUnmappedIdentitiesResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var unmappedIdentities: js.UndefOr[js.Array[Schema$UnmappedIdentity]] = js.native
}

object Schema$ListUnmappedIdentitiesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, unmappedIdentities: js.Array[Schema$UnmappedIdentity] = null): Schema$ListUnmappedIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (unmappedIdentities != null) __obj.updateDynamic("unmappedIdentities")(unmappedIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListUnmappedIdentitiesResponse]
  }
}

