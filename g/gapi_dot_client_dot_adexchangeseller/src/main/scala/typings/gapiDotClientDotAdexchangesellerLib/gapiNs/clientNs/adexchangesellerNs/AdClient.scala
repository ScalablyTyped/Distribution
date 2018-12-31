package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdClient extends js.Object {
  /** Whether this ad client is opted in to ARC. */
  var arcOptIn: js.UndefOr[scala.Boolean] = js.undefined
  /** Unique identifier of this ad client. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#adClient. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** This ad client's product code, which corresponds to the PRODUCT_CODE report dimension. */
  var productCode: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this ad client supports being reported on. */
  var supportsReporting: js.UndefOr[scala.Boolean] = js.undefined
}

