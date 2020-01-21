package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAlbumsResponse extends js.Object {
  /**
    * Output only. List of albums shown in the Albums tab of the user's Google
    * Photos app.
    */
  var albums: js.UndefOr[js.Array[Album]] = js.undefined
  /**
    * Output only. Token to use to get the next set of albums. Populated if
    * there are more albums to retrieve for this request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListAlbumsResponse {
  @scala.inline
  def apply(albums: js.Array[Album] = null, nextPageToken: String = null): ListAlbumsResponse = {
    val __obj = js.Dynamic.literal()
    if (albums != null) __obj.updateDynamic("albums")(albums.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlbumsResponse]
  }
}

