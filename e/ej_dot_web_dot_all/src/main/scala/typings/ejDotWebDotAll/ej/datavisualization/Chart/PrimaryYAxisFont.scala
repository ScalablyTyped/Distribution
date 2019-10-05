package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisFont extends js.Object {
  /** Font family of labels.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** Font style of labels.
    * @Default {ej.datavisualization.Chart.FontStyle.Normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
  /** Font weight of the label.
    * @Default {ej.datavisualization.Chart.FontWeight.Regular. See FontWeight}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
  /** Opacity of the axis labels.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Font size of the axis labels.
    * @Default {13px}
    */
  var size: js.UndefOr[String] = js.undefined
}

object PrimaryYAxisFont {
  @scala.inline
  def apply(
    fontFamily: String = null,
    fontStyle: FontStyle | String = null,
    fontWeight: FontWeight | String = null,
    opacity: Int | Double = null,
    size: String = null
  ): PrimaryYAxisFont = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[PrimaryYAxisFont]
  }
}

