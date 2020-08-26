package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchVariantSetsRequest extends js.Object {
  /**
    * Exactly one dataset ID must be provided here. Only variant sets which
    * belong to this dataset will be returned.
    */
  var datasetIds: js.UndefOr[js.Array[String]] = js.native
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
}

object SearchVariantSetsRequest {
  @scala.inline
  def apply(): SearchVariantSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchVariantSetsRequest]
  }
  @scala.inline
  implicit class SearchVariantSetsRequestOps[Self <: SearchVariantSetsRequest] (val x: Self) extends AnyVal {
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
    def setDatasetIdsVarargs(value: String*): Self = this.set("datasetIds", js.Array(value :_*))
    @scala.inline
    def setDatasetIds(value: js.Array[String]): Self = this.set("datasetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetIds: Self = this.set("datasetIds", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

