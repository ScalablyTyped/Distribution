package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStoreInfosResponse extends js.Object {
  /** See 'List methods rules' for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** List of StoreInfos that match the request criteria. */
  var storeInfos: js.UndefOr[js.Array[StoreInfo]] = js.undefined
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListStoreInfosResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    storeInfos: js.Array[StoreInfo] = null,
    totalSize: Int | Double = null
  ): ListStoreInfosResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (storeInfos != null) __obj.updateDynamic("storeInfos")(storeInfos.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStoreInfosResponse]
  }
}

