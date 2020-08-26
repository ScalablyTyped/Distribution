package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCallSetsResponse extends js.Object {
  /** The list of matching call sets. */
  var callSets: js.UndefOr[js.Array[CallSet]] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SearchCallSetsResponse {
  @scala.inline
  def apply(): SearchCallSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchCallSetsResponse]
  }
  @scala.inline
  implicit class SearchCallSetsResponseOps[Self <: SearchCallSetsResponse] (val x: Self) extends AnyVal {
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
    def setCallSetsVarargs(value: CallSet*): Self = this.set("callSets", js.Array(value :_*))
    @scala.inline
    def setCallSets(value: js.Array[CallSet]): Self = this.set("callSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallSets: Self = this.set("callSets", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

