package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReadsResponse extends js.Object {
  /**
    * The list of matching alignments sorted by mapped genomic coordinate,
    * if any, ascending in position within the same reference. Unmapped reads,
    * which have no position, are returned contiguously and are sorted in
    * ascending lexicographic order by fragment name.
    */
  var alignments: js.UndefOr[js.Array[Read]] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object SearchReadsResponse {
  @scala.inline
  def apply(alignments: js.Array[Read] = null, nextPageToken: java.lang.String = null): SearchReadsResponse = {
    val __obj = js.Dynamic.literal()
    if (alignments != null) __obj.updateDynamic("alignments")(alignments)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[SearchReadsResponse]
  }
}

