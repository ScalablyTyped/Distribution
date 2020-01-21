package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreativesResponse extends js.Object {
  /** The list of creatives. */
  var creatives: js.UndefOr[js.Array[Creative]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativesRequest.page_token
    * field in the subsequent call to `ListCreatives` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListCreativesResponse {
  @scala.inline
  def apply(creatives: js.Array[Creative] = null, nextPageToken: String = null): ListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    if (creatives != null) __obj.updateDynamic("creatives")(creatives.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCreativesResponse]
  }
}

