package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListKeyRingsResponse extends js.Object {
  /** The list of KeyRings. */
  var keyRings: js.UndefOr[js.Array[KeyRing]] = js.undefined
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListKeyRingsRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The total number of KeyRings that matched the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListKeyRingsResponse {
  @scala.inline
  def apply(
    keyRings: js.Array[KeyRing] = null,
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): ListKeyRingsResponse = {
    val __obj = js.Dynamic.literal()
    if (keyRings != null) __obj.updateDynamic("keyRings")(keyRings.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeyRingsResponse]
  }
}

