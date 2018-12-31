package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#productsCustomBatchResponseEntry". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The inserted product. Only defined if the method is insert and if the request was successful. */
  var product: js.UndefOr[Product] = js.undefined
}

