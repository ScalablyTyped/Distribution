package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicator extends js.Object {
  /** Specifies the backgroundColor in bar indicators
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies the border in bar indicators
    * @Default {null}
    */
  var border: js.UndefOr[ScalesIndicatorsBorder] = js.undefined
  /** Specifies the font of bar indicators
    * @Default {null}
    */
  var font: js.UndefOr[ScalesIndicatorsFont] = js.undefined
  /** Specifies the indicator Height of bar indicators
    * @Default {30}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies the opacity in bar indicators
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the position in bar indicators
    * @Default {null}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.undefined
  /** Specifies the state ranges in bar indicators
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.undefined
  /** Specifies the textLocation in bar indicators
    * @Default {null}
    */
  var textLocation: js.UndefOr[ScalesIndicatorsTextLocation] = js.undefined
  /** Specifies the indicator Style of font in bar indicators
    * @Default {ej.datavisualization.LinearGauge.IndicatorType.Rectangle}
    */
  var `type`: js.UndefOr[IndicatorTypes | String] = js.undefined
  /** Specifies the indicator Width in bar indicators
    * @Default {30}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesIndicator {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: ScalesIndicatorsBorder = null,
    font: ScalesIndicatorsFont = null,
    height: Int | Double = null,
    opacity: Int | Double = null,
    position: ScalesIndicatorsPosition = null,
    stateRanges: js.Array[ScalesIndicatorsStateRange] = null,
    textLocation: ScalesIndicatorsTextLocation = null,
    `type`: IndicatorTypes | String = null,
    width: Int | Double = null
  ): ScalesIndicator = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (border != null) __obj.updateDynamic("border")(border)
    if (font != null) __obj.updateDynamic("font")(font)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (stateRanges != null) __obj.updateDynamic("stateRanges")(stateRanges)
    if (textLocation != null) __obj.updateDynamic("textLocation")(textLocation)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicator]
  }
}

