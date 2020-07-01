package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.ListCryptoKeyVersions.
  */
@js.native
trait SchemaListCryptoKeyVersionsResponse extends js.Object {
  /**
    * The list of CryptoKeyVersions.
    */
  var cryptoKeyVersions: js.UndefOr[js.Array[SchemaCryptoKeyVersion]] = js.native
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

object SchemaListCryptoKeyVersionsResponse {
  @scala.inline
  def apply(
    cryptoKeyVersions: js.Array[SchemaCryptoKeyVersion] = null,
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyVersions != null) __obj.updateDynamic("cryptoKeyVersions")(cryptoKeyVersions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCryptoKeyVersionsResponse]
  }
}

