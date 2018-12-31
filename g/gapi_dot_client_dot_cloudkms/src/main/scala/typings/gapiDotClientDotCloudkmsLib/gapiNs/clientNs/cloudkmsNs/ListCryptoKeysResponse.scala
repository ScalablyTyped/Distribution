package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCryptoKeysResponse extends js.Object {
  /** The list of CryptoKeys. */
  var cryptoKeys: js.UndefOr[js.Array[CryptoKey]] = js.undefined
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeysRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of CryptoKeys that matched the query. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

