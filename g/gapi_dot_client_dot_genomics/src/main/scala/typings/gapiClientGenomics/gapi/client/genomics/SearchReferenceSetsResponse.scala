package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReferenceSetsResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The matching references sets. */
  var referenceSets: js.UndefOr[js.Array[ReferenceSet]] = js.native
}

object SearchReferenceSetsResponse {
  @scala.inline
  def apply(): SearchReferenceSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchReferenceSetsResponse]
  }
  @scala.inline
  implicit class SearchReferenceSetsResponseOps[Self <: SearchReferenceSetsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setReferenceSetsVarargs(value: ReferenceSet*): Self = this.set("referenceSets", js.Array(value :_*))
    @scala.inline
    def setReferenceSets(value: js.Array[ReferenceSet]): Self = this.set("referenceSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSets: Self = this.set("referenceSets", js.undefined)
  }
  
}

