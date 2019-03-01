package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStoreInfosResponse extends js.Object {
  /** See 'List methods rules' for info about this field. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** List of StoreInfos that match the request criteria. */
  var storeInfos: js.UndefOr[js.Array[StoreInfo]] = js.undefined
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

object ListStoreInfosResponse {
  @scala.inline
  def apply(
    nextPageToken: java.lang.String = null,
    storeInfos: js.Array[StoreInfo] = null,
    totalSize: scala.Int | scala.Double = null
  ): ListStoreInfosResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (storeInfos != null) __obj.updateDynamic("storeInfos")(storeInfos)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStoreInfosResponse]
  }
}

