package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicator extends js.Object {
  /** Contains property to customize the font of indicator.
    */
  var font: js.UndefOr[CaptionSettingsIndicatorFont] = js.undefined
  /** Contains property to customize the location of indicator.
    */
  var location: js.UndefOr[CaptionSettingsIndicatorLocation] = js.undefined
  /** Specifies the padding to be applied when text position is used.
    * @Default {2}
    */
  var padding: js.UndefOr[Double] = js.undefined
  /** Contains property to customize the symbol of indicator.
    */
  var symbol: js.UndefOr[CaptionSettingsIndicatorSymbol] = js.undefined
  /** Specifies the text to be displayed as indicator text. By default difference between current value and target will be displayed
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the alignment of indicator with respect to scale based on text position
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
  /** Specifies where indicator text should be anchored when indicator overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
    * position. Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.undefined
  /** indicator text render in the specified angle.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.undefined
  /** Specifies where indicator should be placed
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.undefined
  /** Specifies the space between indicator symbol and text.
    * @Default {3}
    */
  var textSpacing: js.UndefOr[Double] = js.undefined
  /** Specifies whether indicator will be visible or not.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CaptionSettingsIndicator {
  @scala.inline
  def apply(
    font: CaptionSettingsIndicatorFont = null,
    location: CaptionSettingsIndicatorLocation = null,
    padding: Int | Double = null,
    symbol: CaptionSettingsIndicatorSymbol = null,
    text: String = null,
    textAlignment: TextAlignment | String = null,
    textAnchor: TextAnchor | String = null,
    textAngle: Int | Double = null,
    textPosition: TextPosition | String = null,
    textSpacing: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CaptionSettingsIndicator = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textAngle != null) __obj.updateDynamic("textAngle")(textAngle.asInstanceOf[js.Any])
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition.asInstanceOf[js.Any])
    if (textSpacing != null) __obj.updateDynamic("textSpacing")(textSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicator]
  }
}

