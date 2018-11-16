package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShippingsettingsCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry to which this entry responds. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** A list of errors defined if, and only if, the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsCustomBatchResponseEntry". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The retrieved or updated account shipping settings. */
  var shippingSettings: js.UndefOr[ShippingSettings] = js.undefined
}

