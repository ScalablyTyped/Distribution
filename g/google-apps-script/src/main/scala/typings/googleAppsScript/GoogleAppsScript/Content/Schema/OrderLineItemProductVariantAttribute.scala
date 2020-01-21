package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemProductVariantAttribute extends js.Object {
  var dimension: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object OrderLineItemProductVariantAttribute {
  @scala.inline
  def apply(dimension: String = null, value: String = null): OrderLineItemProductVariantAttribute = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLineItemProductVariantAttribute]
  }
}

