package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchVariantsRequest extends js.Object {
  /**
    * Only return variant calls which belong to call sets with these ids.
    * Leaving this blank returns all variant calls. If a variant has no
    * calls belonging to any of these call sets, it won't be returned at all.
    */
  var callSetIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The end of the window, 0-based exclusive. If unspecified or 0, defaults to
    * the length of the reference.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The maximum number of calls to return in a single page. Note that this
    * limit may be exceeded in the event that a matching variant contains more
    * calls than the requested maximum. If unspecified, defaults to 5000. The
    * maximum value is 10000.
    */
  var maxCalls: js.UndefOr[Double] = js.native
  /**
    * The maximum number of variants to return in a single page. If unspecified,
    * defaults to 5000. The maximum value is 10000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Required. Only return variants in this reference sequence. */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * The beginning of the window (0-based, inclusive) for which
    * overlapping variants should be returned. If unspecified, defaults to 0.
    */
  var start: js.UndefOr[String] = js.native
  /** Only return variants which have exactly this name. */
  var variantName: js.UndefOr[String] = js.native
  /**
    * At most one variant set ID must be provided. Only variants from this
    * variant set will be returned. If omitted, a call set id must be included in
    * the request.
    */
  var variantSetIds: js.UndefOr[js.Array[String]] = js.native
}

object SearchVariantsRequest {
  @scala.inline
  def apply(): SearchVariantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchVariantsRequest]
  }
  @scala.inline
  implicit class SearchVariantsRequestOps[Self <: SearchVariantsRequest] (val x: Self) extends AnyVal {
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
    def setCallSetIdsVarargs(value: String*): Self = this.set("callSetIds", js.Array(value :_*))
    @scala.inline
    def setCallSetIds(value: js.Array[String]): Self = this.set("callSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallSetIds: Self = this.set("callSetIds", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setMaxCalls(value: Double): Self = this.set("maxCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCalls: Self = this.set("maxCalls", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setVariantName(value: String): Self = this.set("variantName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantName: Self = this.set("variantName", js.undefined)
    @scala.inline
    def setVariantSetIdsVarargs(value: String*): Self = this.set("variantSetIds", js.Array(value :_*))
    @scala.inline
    def setVariantSetIds(value: js.Array[String]): Self = this.set("variantSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantSetIds: Self = this.set("variantSetIds", js.undefined)
  }
  
}

