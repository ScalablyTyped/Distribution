package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

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
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The total number of CryptoKeyVersions that matched the
    * query.
    */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

object ListCryptoKeyVersionsResponse {
  @scala.inline
  def apply(
    cryptoKeyVersions: js.Array[CryptoKeyVersion] = null,
    nextPageToken: java.lang.String = null,
    totalSize: scala.Int | scala.Double = null
  ): ListCryptoKeyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyVersions != null) __obj.updateDynamic("cryptoKeyVersions")(cryptoKeyVersions)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCryptoKeyVersionsResponse]
  }
}

