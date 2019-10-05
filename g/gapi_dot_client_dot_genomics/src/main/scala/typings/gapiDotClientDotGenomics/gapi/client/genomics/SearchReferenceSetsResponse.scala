package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReferenceSetsResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The matching references sets. */
  var referenceSets: js.UndefOr[js.Array[ReferenceSet]] = js.undefined
}

object SearchReferenceSetsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, referenceSets: js.Array[ReferenceSet] = null): SearchReferenceSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (referenceSets != null) __obj.updateDynamic("referenceSets")(referenceSets)
    __obj.asInstanceOf[SearchReferenceSetsResponse]
  }
}

