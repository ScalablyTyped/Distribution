package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCreateMediaItemsResponse extends js.Object {
  /** Output only. List of media items created. */
  var newMediaItemResults: js.UndefOr[js.Array[NewMediaItemResult]] = js.undefined
}

object BatchCreateMediaItemsResponse {
  @scala.inline
  def apply(newMediaItemResults: js.Array[NewMediaItemResult] = null): BatchCreateMediaItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (newMediaItemResults != null) __obj.updateDynamic("newMediaItemResults")(newMediaItemResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateMediaItemsResponse]
  }
}

