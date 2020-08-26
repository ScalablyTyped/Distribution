package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAnnotationsRequest extends js.Object {
  /**
    * Required. The annotation sets to search within. The caller must have
    * `READ` access to these annotation sets.
    * All queried annotation sets must have the same type.
    */
  var annotationSetIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The end position of the range on the reference, 0-based exclusive. If
    * referenceId or
    * referenceName
    * must be specified, Defaults to the length of the reference.
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
  /** The ID of the reference to query. */
  var referenceId: js.UndefOr[String] = js.native
  /**
    * The name of the reference to query, within the reference set associated
    * with this query.
    */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * The start position of the range on the reference, 0-based inclusive. If
    * specified,
    * referenceId or
    * referenceName
    * must be specified. Defaults to 0.
    */
  var start: js.UndefOr[String] = js.native
}

object SearchAnnotationsRequest {
  @scala.inline
  def apply(): SearchAnnotationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnnotationsRequest]
  }
  @scala.inline
  implicit class SearchAnnotationsRequestOps[Self <: SearchAnnotationsRequest] (val x: Self) extends AnyVal {
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
    def setAnnotationSetIdsVarargs(value: String*): Self = this.set("annotationSetIds", js.Array(value :_*))
    @scala.inline
    def setAnnotationSetIds(value: js.Array[String]): Self = this.set("annotationSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationSetIds: Self = this.set("annotationSetIds", js.undefined)
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
    def setReferenceId(value: String): Self = this.set("referenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceId: Self = this.set("referenceId", js.undefined)
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

