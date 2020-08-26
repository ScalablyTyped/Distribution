package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAnnotationSetsResponse extends js.Object {
  /** The matching annotation sets. */
  var annotationSets: js.UndefOr[js.Array[AnnotationSet]] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SearchAnnotationSetsResponse {
  @scala.inline
  def apply(): SearchAnnotationSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnnotationSetsResponse]
  }
  @scala.inline
  implicit class SearchAnnotationSetsResponseOps[Self <: SearchAnnotationSetsResponse] (val x: Self) extends AnyVal {
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
    def setAnnotationSetsVarargs(value: AnnotationSet*): Self = this.set("annotationSets", js.Array(value :_*))
    @scala.inline
    def setAnnotationSets(value: js.Array[AnnotationSet]): Self = this.set("annotationSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationSets: Self = this.set("annotationSets", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

