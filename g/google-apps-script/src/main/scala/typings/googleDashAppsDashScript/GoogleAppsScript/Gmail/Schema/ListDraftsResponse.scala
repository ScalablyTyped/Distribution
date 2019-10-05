package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDraftsResponse extends js.Object {
  var drafts: js.UndefOr[js.Array[Draft]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
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
    if (drafts != null) __obj.updateDynamic("drafts")(drafts)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDraftsResponse]
  }
}

