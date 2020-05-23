package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAvailsResponse extends js.Object {
  /** List of Avails that match the request criteria. */
  var avails: js.UndefOr[js.Array[Avail]] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListAvailsResponse {
  @scala.inline
  def apply(
    avails: js.Array[Avail] = null,
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): ListAvailsResponse = {
    val __obj = js.Dynamic.literal()
    if (avails != null) __obj.updateDynamic("avails")(avails.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailsResponse]
  }
}

