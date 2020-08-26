package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReadsResponse extends js.Object {
  /**
    * The list of matching alignments sorted by mapped genomic coordinate,
    * if any, ascending in position within the same reference. Unmapped reads,
    * which have no position, are returned contiguously and are sorted in
    * ascending lexicographic order by fragment name.
    */
  var alignments: js.UndefOr[js.Array[Read]] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SearchReadsResponse {
  @scala.inline
  def apply(): SearchReadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchReadsResponse]
  }
  @scala.inline
  implicit class SearchReadsResponseOps[Self <: SearchReadsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignmentsVarargs(value: Read*): Self = this.set("alignments", js.Array(value :_*))
    @scala.inline
    def setAlignments(value: js.Array[Read]): Self = this.set("alignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignments: Self = this.set("alignments", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

