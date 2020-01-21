package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHistoriesResponse extends js.Object {
  /** Histories. */
  var histories: js.UndefOr[js.Array[History]] = js.undefined
  /**
    * A continuation token to resume the query at the next item.
    *
    * Will only be set if there are more histories to fetch.
    *
    * Tokens are valid for up to one hour from the time of the first list request. For instance, if you make a list request at 1PM and use the token from
    * this first request 10 minutes later, the token from this second response will only be valid for 50 minutes.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListHistoriesResponse {
  @scala.inline
  def apply(histories: js.Array[History] = null, nextPageToken: String = null): ListHistoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (histories != null) __obj.updateDynamic("histories")(histories.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHistoriesResponse]
  }
}

