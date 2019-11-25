package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDraftsResponse extends js.Object {
  /** List of drafts. */
  var drafts: js.UndefOr[js.Array[Draft]] = js.undefined
  /** Token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
}

object ListDraftsResponse {
  @scala.inline
  def apply(
    drafts: js.Array[Draft] = null,
    nextPageToken: String = null,
    resultSizeEstimate: Int | Double = null
  ): ListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    if (drafts != null) __obj.updateDynamic("drafts")(drafts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDraftsResponse]
  }
}

