package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  /** @name Font.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name Font.family */
  var family: js.UndefOr[String] = js.undefined
  /** @name Font.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name Font.size */
  var size: js.UndefOr[String | Double] = js.undefined
  /** @name Font.weight */
  var weight: js.UndefOr[Double] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    color: String = null,
    family: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    size: String | Double = null,
    weight: js.UndefOr[Double] = js.undefined
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

