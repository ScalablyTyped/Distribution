package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShippingsettingsGetSupportedCarriersResponse extends js.Object {
  /** A list of supported carriers. May be empty. */
  var carriers: js.UndefOr[js.Array[CarriersCarrier]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedCarriersResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ShippingsettingsGetSupportedCarriersResponse {
  @scala.inline
  def apply(carriers: js.Array[CarriersCarrier] = null, kind: java.lang.String = null): ShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    if (carriers != null) __obj.updateDynamic("carriers")(carriers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ShippingsettingsGetSupportedCarriersResponse]
  }
}

