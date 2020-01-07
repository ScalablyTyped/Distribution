package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from a request to list.
  */
@js.native
trait Schema$ListUserAssetsResponse extends js.Object {
  /**
    * The continuation token for retrieving the next page. If empty, indicates
    * that there are no more pages. To get the next page, submit the same
    * request specifying this value as the page_token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of assets in the list, without pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * A list of UserAssets matching the request.
    */
  var userAssets: js.UndefOr[js.Array[Schema$UserAsset]] = js.native
}

object Schema$ListUserAssetsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    totalSize: Int | Double = null,
    userAssets: js.Array[Schema$UserAsset] = null
  ): Schema$ListUserAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    if (userAssets != null) __obj.updateDynamic("userAssets")(userAssets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListUserAssetsResponse]
  }
}

