package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListProductsResponse extends js.Object {
  /** The token for the retrieval of the next page of product statuses. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** List of the products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}

