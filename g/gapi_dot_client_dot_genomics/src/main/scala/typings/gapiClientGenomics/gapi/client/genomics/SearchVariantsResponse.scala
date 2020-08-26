package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchVariantsResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of matching Variants. */
  var variants: js.UndefOr[js.Array[Variant]] = js.native
}

object SearchVariantsResponse {
  @scala.inline
  def apply(): SearchVariantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchVariantsResponse]
  }
  @scala.inline
  implicit class SearchVariantsResponseOps[Self <: SearchVariantsResponse] (val x: Self) extends AnyVal {
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
    def setVariantsVarargs(value: Variant*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[Variant]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
  
}

