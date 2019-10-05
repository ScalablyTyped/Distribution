package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReadGroupSetsResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of matching read group sets. */
  var readGroupSets: js.UndefOr[js.Array[ReadGroupSet]] = js.undefined
}

object SearchReadGroupSetsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, readGroupSets: js.Array[ReadGroupSet] = null): SearchReadGroupSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (readGroupSets != null) __obj.updateDynamic("readGroupSets")(readGroupSets)
    __obj.asInstanceOf[SearchReadGroupSetsResponse]
  }
}

