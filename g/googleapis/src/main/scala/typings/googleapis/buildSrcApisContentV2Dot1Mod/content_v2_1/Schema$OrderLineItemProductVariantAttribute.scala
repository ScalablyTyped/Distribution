package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderLineItemProductVariantAttribute extends js.Object {
  /**
    * The dimension of the variant.
    */
  var dimension: js.UndefOr[String] = js.native
  /**
    * The value for the dimension.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$OrderLineItemProductVariantAttribute {
  @scala.inline
  def apply(dimension: String = null, value: String = null): Schema$OrderLineItemProductVariantAttribute = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderLineItemProductVariantAttribute]
  }
}

