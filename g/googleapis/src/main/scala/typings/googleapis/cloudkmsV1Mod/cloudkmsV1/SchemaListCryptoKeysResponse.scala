package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.ListCryptoKeys.
  */
@js.native
trait SchemaListCryptoKeysResponse extends js.Object {
  /**
    * The list of CryptoKeys.
    */
  var cryptoKeys: js.UndefOr[js.Array[SchemaCryptoKey]] = js.native
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

object SchemaListCryptoKeysResponse {
  @scala.inline
  def apply(
    cryptoKeys: js.Array[SchemaCryptoKey] = null,
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeys != null) __obj.updateDynamic("cryptoKeys")(cryptoKeys.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCryptoKeysResponse]
  }
}

