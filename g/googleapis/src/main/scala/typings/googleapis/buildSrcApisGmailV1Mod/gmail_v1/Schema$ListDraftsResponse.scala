package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListDraftsResponse extends js.Object {
  /**
    * List of drafts.
    */
  var drafts: js.UndefOr[js.Array[Schema$Draft]] = js.native
  /**
    * Token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object Schema$ListDraftsResponse {
  @scala.inline
  def apply(
    drafts: js.Array[Schema$Draft] = null,
    nextPageToken: String = null,
    resultSizeEstimate: Int | Double = null
  ): Schema$ListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    if (drafts != null) __obj.updateDynamic("drafts")(drafts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (resultSizeEstimate != null) __obj.updateDynamic("resultSizeEstimate")(resultSizeEstimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDraftsResponse]
  }
}

