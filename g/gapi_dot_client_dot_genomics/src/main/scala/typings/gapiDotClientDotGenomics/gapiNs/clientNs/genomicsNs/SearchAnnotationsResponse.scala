package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAnnotationsResponse extends js.Object {
  /** The matching annotations. */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object SearchAnnotationsResponse {
  @scala.inline
  def apply(annotations: js.Array[Annotation] = null, nextPageToken: String = null): SearchAnnotationsResponse = {
    val __obj = js.Dynamic.literal()
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[SearchAnnotationsResponse]
  }
}

