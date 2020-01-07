package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.ListCryptoKeys.
  */
@js.native
trait Schema$ListCryptoKeysResponse extends js.Object {
  /**
    * The list of CryptoKeys.
    */
  var cryptoKeys: js.UndefOr[js.Array[Schema$CryptoKey]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeysRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of CryptoKeys that matched the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object Schema$ListCryptoKeysResponse {
  @scala.inline
  def apply(
    cryptoKeys: js.Array[Schema$CryptoKey] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): Schema$ListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeys != null) __obj.updateDynamic("cryptoKeys")(cryptoKeys.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCryptoKeysResponse]
  }
}

