package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCallSetsRequest extends js.Object {
  /**
    * Only return call sets for which a substring of the name matches this
    * string.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Restrict the query to call sets within the given variant sets. At least one
    * ID must be provided.
    */
  var variantSetIds: js.UndefOr[js.Array[String]] = js.native
}

object SearchCallSetsRequest {
  @scala.inline
  def apply(): SearchCallSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchCallSetsRequest]
  }
  @scala.inline
  implicit class SearchCallSetsRequestOps[Self <: SearchCallSetsRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setVariantSetIdsVarargs(value: String*): Self = this.set("variantSetIds", js.Array(value :_*))
    @scala.inline
    def setVariantSetIds(value: js.Array[String]): Self = this.set("variantSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantSetIds: Self = this.set("variantSetIds", js.undefined)
  }
  
}

