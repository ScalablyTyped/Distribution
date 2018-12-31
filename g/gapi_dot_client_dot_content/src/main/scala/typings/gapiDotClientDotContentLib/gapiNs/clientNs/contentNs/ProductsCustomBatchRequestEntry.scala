package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** The product to insert. Only required if the method is insert. */
  var product: js.UndefOr[Product] = js.undefined
  /** The ID of the product to get or delete. Only defined if the method is get or delete. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
}

