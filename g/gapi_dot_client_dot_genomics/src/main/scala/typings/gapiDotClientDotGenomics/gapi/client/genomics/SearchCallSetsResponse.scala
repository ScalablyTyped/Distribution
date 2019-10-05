package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCallSetsResponse extends js.Object {
  /** The list of matching call sets. */
  var callSets: js.UndefOr[js.Array[CallSet]] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object SearchCallSetsResponse {
  @scala.inline
  def apply(callSets: js.Array[CallSet] = null, nextPageToken: String = null): SearchCallSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (callSets != null) __obj.updateDynamic("callSets")(callSets)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[SearchCallSetsResponse]
  }
}

