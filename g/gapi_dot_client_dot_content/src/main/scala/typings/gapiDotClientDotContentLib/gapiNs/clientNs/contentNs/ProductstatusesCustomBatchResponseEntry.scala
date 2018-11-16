package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProductstatusesCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** A list of errors, if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#productstatusesCustomBatchResponseEntry". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The requested product status. Only defined if the request was successful. */
  var productStatus: js.UndefOr[ProductStatus] = js.undefined
}

