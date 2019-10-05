package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaxInfo extends js.Object {
  /** Whether this is a government charge or a carrier surcharge. */
  var chargeType: js.UndefOr[String] = js.undefined
  /** The code to enter in the ticket's tax box. */
  var code: js.UndefOr[String] = js.undefined
  /** For government charges, the country levying the charge. */
  var country: js.UndefOr[String] = js.undefined
  /** Identifier uniquely identifying this tax in a response. Not present for unnamed carrier surcharges. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies this as a tax information object. Value: the fixed string qpxexpress#taxInfo. */
  var kind: js.UndefOr[String] = js.undefined
  /** The price of the tax in the sales or equivalent currency. */
  var salePrice: js.UndefOr[String] = js.undefined
}

object TaxInfo {
  @scala.inline
  def apply(
    chargeType: String = null,
    code: String = null,
    country: String = null,
    id: String = null,
    kind: String = null,
    salePrice: String = null
  ): TaxInfo = {
    val __obj = js.Dynamic.literal()
    if (chargeType != null) __obj.updateDynamic("chargeType")(chargeType)
    if (code != null) __obj.updateDynamic("code")(code)
    if (country != null) __obj.updateDynamic("country")(country)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice)
    __obj.asInstanceOf[TaxInfo]
  }
}

