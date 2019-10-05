package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStepThumbnailsResponse extends js.Object {
  /**
    * A continuation token to resume the query at the next item.
    *
    * If set, indicates that there are more thumbnails to read, by calling list again with this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * A list of image data.
    *
    * Images are returned in a deterministic order; they are ordered by these factors, in order of importance: &#42; First, by their associated test case. Images
    * without a test case are considered greater than images with one. &#42; Second, by their creation time. Images without a creation time are greater than
    * images with one. &#42; Third, by the order in which they were added to the step (by calls to CreateStep or UpdateStep).
    */
  var thumbnails: js.UndefOr[js.Array[Image]] = js.undefined
}

object ListStepThumbnailsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, thumbnails: js.Array[Image] = null): ListStepThumbnailsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    __obj.asInstanceOf[ListStepThumbnailsResponse]
  }
}

