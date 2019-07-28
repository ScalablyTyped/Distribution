package typings.gapiDotClientDotAdsensehost.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdClient extends js.Object {
  /** Whether this ad client is opted in to ARC. */
  var arcOptIn: js.UndefOr[Boolean] = js.undefined
  /** Unique identifier of this ad client. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#adClient. */
  var kind: js.UndefOr[String] = js.undefined
  /** This ad client's product code, which corresponds to the PRODUCT_CODE report dimension. */
  var productCode: js.UndefOr[String] = js.undefined
  /** Whether this ad client supports being reported on. */
  var supportsReporting: js.UndefOr[Boolean] = js.undefined
}

object AdClient {
  @scala.inline
  def apply(
    arcOptIn: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    productCode: String = null,
    supportsReporting: js.UndefOr[Boolean] = js.undefined
  ): AdClient = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arcOptIn)) __obj.updateDynamic("arcOptIn")(arcOptIn)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productCode != null) __obj.updateDynamic("productCode")(productCode)
    if (!js.isUndefined(supportsReporting)) __obj.updateDynamic("supportsReporting")(supportsReporting)
    __obj.asInstanceOf[AdClient]
  }
}

