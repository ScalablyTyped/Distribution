package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.ListCryptoKeyVersions.
  */
@js.native
trait Schema$ListCryptoKeyVersionsResponse extends js.Object {
  /**
    * The list of CryptoKeyVersions.
    */
  var cryptoKeyVersions: js.UndefOr[js.Array[Schema$CryptoKeyVersion]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeyVersionsRequest.page_token to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of CryptoKeyVersions that matched the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object Schema$ListCryptoKeyVersionsResponse {
  @scala.inline
  def apply(
    cryptoKeyVersions: js.Array[Schema$CryptoKeyVersion] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): Schema$ListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyVersions != null) __obj.updateDynamic("cryptoKeyVersions")(cryptoKeyVersions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCryptoKeyVersionsResponse]
  }
}

