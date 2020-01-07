package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.ListKeyRings.
  */
@js.native
trait Schema$ListKeyRingsResponse extends js.Object {
  /**
    * The list of KeyRings.
    */
  var keyRings: js.UndefOr[js.Array[Schema$KeyRing]] = js.native
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

object Schema$ListKeyRingsResponse {
  @scala.inline
  def apply(
    keyRings: js.Array[Schema$KeyRing] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): Schema$ListKeyRingsResponse = {
    val __obj = js.Dynamic.literal()
    if (keyRings != null) __obj.updateDynamic("keyRings")(keyRings.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListKeyRingsResponse]
  }
}

