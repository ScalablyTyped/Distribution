package typings.ejDotWebDotAll.ej.SunburstChart

import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.FontStyle
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelSettingsFont extends js.Object {
  /** Font color of the data label text.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Font family of the data label.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Font style of the data label.
    * @Default {normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Font weight of the data label.
    * @Default {regular. See FontWeight}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Opacity of the text.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Font size of the data label.
    * @Default {12px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object DataLabelSettingsFont {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    opacity: Int | Double = null,
    size: String = null
  ): DataLabelSettingsFont = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[DataLabelSettingsFont]
  }
}

