package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  /** Specifies font color. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies font family. */
  var family: js.UndefOr[String] = js.undefined
  /** Specifies font opacity. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies font size. */
  var size: js.UndefOr[String | Double] = js.undefined
  /** Specifies font weight. Accepts values from 100 to 900 in increments of 100. Higher values increase boldness. */
  var weight: js.UndefOr[Double] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    color: String = null,
    family: String = null,
    opacity: Int | Double = null,
    size: String | Double = null,
    weight: Int | Double = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

