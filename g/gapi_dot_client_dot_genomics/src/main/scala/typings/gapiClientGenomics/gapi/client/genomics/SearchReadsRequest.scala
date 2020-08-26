package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReadsRequest extends js.Object {
  /**
    * The end position of the range on the reference, 0-based exclusive. If
    * specified, `referenceName` must also be specified.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 256. The maximum value is 2048.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the read groups within which to search for reads. All specified
    * read groups must belong to the same read group sets. Must specify one of
    * `readGroupSetIds` or `readGroupIds`.
    */
  var readGroupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The IDs of the read groups sets within which to search for reads. All
    * specified read group sets must be aligned against a common set of reference
    * sequences; this defines the genomic coordinates for the query. Must specify
    * one of `readGroupSetIds` or `readGroupIds`.
    */
  var readGroupSetIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The reference sequence name, for example `chr1`, `1`, or `chrX`. If set to
    * `&#42;`, only unmapped reads are returned. If unspecified, all reads (mapped
    * and unmapped) are returned.
    */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * The start position of the range on the reference, 0-based inclusive. If
    * specified, `referenceName` must also be specified.
    */
  var start: js.UndefOr[String] = js.native
}

object SearchReadsRequest {
  @scala.inline
  def apply(): SearchReadsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchReadsRequest]
  }
  @scala.inline
  implicit class SearchReadsRequestOps[Self <: SearchReadsRequest] (val x: Self) extends AnyVal {
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setReadGroupIdsVarargs(value: String*): Self = this.set("readGroupIds", js.Array(value :_*))
    @scala.inline
    def setReadGroupIds(value: js.Array[String]): Self = this.set("readGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadGroupIds: Self = this.set("readGroupIds", js.undefined)
    @scala.inline
    def setReadGroupSetIdsVarargs(value: String*): Self = this.set("readGroupSetIds", js.Array(value :_*))
    @scala.inline
    def setReadGroupSetIds(value: js.Array[String]): Self = this.set("readGroupSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadGroupSetIds: Self = this.set("readGroupSetIds", js.undefined)
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

