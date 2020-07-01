package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.ListKeyRings.
  */
@js.native
trait SchemaListKeyRingsResponse extends js.Object {
  /**
    * The list of KeyRings.
    */
  var keyRings: js.UndefOr[js.Array[SchemaKeyRing]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListKeyRingsRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of KeyRings that matched the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaListKeyRingsResponse {
  @scala.inline
  def apply(
    keyRings: js.Array[SchemaKeyRing] = null,
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaListKeyRingsResponse = {
    val __obj = js.Dynamic.literal()
    if (keyRings != null) __obj.updateDynamic("keyRings")(keyRings.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListKeyRingsResponse]
  }
}

