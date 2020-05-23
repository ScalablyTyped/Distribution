package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisStripLineFont extends js.Object {
  /** Font color of the strip line text.
    * @Default {black}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Font family of the strip line text.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Font style of the strip line text.
    * @Default {Normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Font weight of the strip line text.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /** Opacity of the strip line text.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Font size of the strip line text.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object PrimaryXAxisStripLineFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    size: String = null
  ): PrimaryXAxisStripLineFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisStripLineFont]
  }
}

