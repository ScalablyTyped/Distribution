package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AdClient extends js.Object {
  /**
    * Whether this ad client is opted in to ARC.
    */
  var arcOptIn: js.UndefOr[Boolean] = js.native
  /**
    * Unique identifier of this ad client.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#adClient.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This ad client&#39;s product code, which corresponds to the PRODUCT_CODE
    * report dimension.
    */
  var productCode: js.UndefOr[String] = js.native
  /**
    * Whether this ad client supports being reported on.
    */
  var supportsReporting: js.UndefOr[Boolean] = js.native
}

object Schema$AdClient {
  @scala.inline
  def apply(
    arcOptIn: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    productCode: String = null,
    supportsReporting: js.UndefOr[Boolean] = js.undefined
  ): Schema$AdClient = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arcOptIn)) __obj.updateDynamic("arcOptIn")(arcOptIn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productCode != null) __obj.updateDynamic("productCode")(productCode.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsReporting)) __obj.updateDynamic("supportsReporting")(supportsReporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdClient]
  }
}

