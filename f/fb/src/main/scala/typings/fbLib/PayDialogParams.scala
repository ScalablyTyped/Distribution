package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PayDialogParams extends js.Object {
   // "pay"
  var action: java.lang.String
  var method: java.lang.String
  var pricepoint_id: js.UndefOr[java.lang.String] = js.undefined
   // "purchaseitem"
  var product: java.lang.String
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var quantity_max: js.UndefOr[scala.Double] = js.undefined
  var quantity_min: js.UndefOr[scala.Double] = js.undefined
  var request_id: js.UndefOr[java.lang.String] = js.undefined
  var test_currency: js.UndefOr[java.lang.String] = js.undefined
}

