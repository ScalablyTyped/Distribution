package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemProductVariantAttribute extends js.Object {
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object OrderLineItemProductVariantAttribute {
  @scala.inline
  def apply(dimension: java.lang.String = null, value: java.lang.String = null): OrderLineItemProductVariantAttribute = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OrderLineItemProductVariantAttribute]
  }
}

