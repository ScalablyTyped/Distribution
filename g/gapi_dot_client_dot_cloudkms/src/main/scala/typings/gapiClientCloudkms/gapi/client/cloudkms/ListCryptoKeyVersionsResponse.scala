package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCryptoKeyVersionsResponse extends js.Object {
  /** The list of CryptoKeyVersions. */
  var cryptoKeyVersions: js.UndefOr[js.Array[CryptoKeyVersion]] = js.undefined
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeyVersionsRequest.page_token to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * The total number of CryptoKeyVersions that matched the
    * query.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListCryptoKeyVersionsResponse {
  @scala.inline
  def apply(
    cryptoKeyVersions: js.Array[CryptoKeyVersion] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): ListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyVersions != null) __obj.updateDynamic("cryptoKeyVersions")(cryptoKeyVersions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCryptoKeyVersionsResponse]
  }
}

