package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaxInfo extends js.Object {
  /** Whether this is a government charge or a carrier surcharge. */
  var chargeType: js.UndefOr[java.lang.String] = js.undefined
  /** The code to enter in the ticket's tax box. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** For government charges, the country levying the charge. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier uniquely identifying this tax in a response. Not present for unnamed carrier surcharges. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this as a tax information object. Value: the fixed string qpxexpress#taxInfo. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The price of the tax in the sales or equivalent currency. */
  var salePrice: js.UndefOr[java.lang.String] = js.undefined
}

