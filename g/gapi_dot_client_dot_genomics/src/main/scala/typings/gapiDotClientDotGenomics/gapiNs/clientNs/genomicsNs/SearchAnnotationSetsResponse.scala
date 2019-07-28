package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAnnotationSetsResponse extends js.Object {
  /** The matching annotation sets. */
  var annotationSets: js.UndefOr[js.Array[AnnotationSet]] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object SearchAnnotationSetsResponse {
  @scala.inline
  def apply(annotationSets: js.Array[AnnotationSet] = null, nextPageToken: String = null): SearchAnnotationSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationSets != null) __obj.updateDynamic("annotationSets")(annotationSets)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[SearchAnnotationSetsResponse]
  }
}

