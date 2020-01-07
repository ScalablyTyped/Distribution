package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListItemNamesForUnmappedIdentityResponse extends js.Object {
  var itemNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListItemNamesForUnmappedIdentityResponse {
  @scala.inline
  def apply(itemNames: js.Array[String] = null, nextPageToken: String = null): Schema$ListItemNamesForUnmappedIdentityResponse = {
    val __obj = js.Dynamic.literal()
    if (itemNames != null) __obj.updateDynamic("itemNames")(itemNames.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListItemNamesForUnmappedIdentityResponse]
  }
}

