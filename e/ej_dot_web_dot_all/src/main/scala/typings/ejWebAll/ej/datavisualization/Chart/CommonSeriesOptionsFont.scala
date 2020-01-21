package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsFont extends js.Object {
  /** Font color of the text in all series.
    * @Default {#707070}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Font Family for all the series.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Specifies the font Style for all the series.
    * @Default {normal}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Specifies the font weight for all the series.
    * @Default {regular}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Opacity for text in all the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Font size for text in all the series.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object CommonSeriesOptionsFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    opacity: Int | Double = null,
    size: String = null
  ): CommonSeriesOptionsFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonSeriesOptionsFont]
  }
}

