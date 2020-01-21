package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetMediaItemsResponse extends js.Object {
  /**
    * Output only. List of media items retrieved.
    * Note that even if the call to BatchGetMediaItems succeeds, there may have
    * been failures for some media items in the batch. These failures are
    * indicated in each
    * MediaItemResult.status.
    */
  var mediaItemResults: js.UndefOr[js.Array[MediaItemResult]] = js.undefined
}

object BatchGetMediaItemsResponse {
  @scala.inline
  def apply(mediaItemResults: js.Array[MediaItemResult] = null): BatchGetMediaItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (mediaItemResults != null) __obj.updateDynamic("mediaItemResults")(mediaItemResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetMediaItemsResponse]
  }
}

