package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /** Specifies the Character settings for the DigitalGauge.
    * @Default {null}
    */
  var characterSettings: js.UndefOr[ItemsCharacterSettings] = js.undefined
  /** Enable/Disable the custom font to be applied to the text in the gauge.
    * @Default {false}
    */
  var enableCustomFont: js.UndefOr[Boolean] = js.undefined
  /** Set the specific font for the text, when the enableCustomFont is set to true
    * @Default {null}
    */
  var font: js.UndefOr[ItemsFont] = js.undefined
  /** Set the location for the text, where it needs to be placed within the gauge.
    * @Default {null}
    */
  var position: js.UndefOr[ItemsPosition] = js.undefined
  /** Set the segment settings for the digital gauge.
    * @Default {null}
    */
  var segmentSettings: js.UndefOr[ItemsSegmentSettings] = js.undefined
  /** Set the value for enabling/disabling the blurring effect for the shadows of the text
    * @Default {0}
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /** Specifies the color of the text shadow.
    * @Default {null}
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /** Set the x offset value for the shadow of the text, indicating the location where it needs to be displayed.
    * @Default {1}
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /** Set the y offset value for the shadow of the text, indicating the location where it needs to be displayed.
    * @Default {1}
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /** Set the alignment of the text that is displayed within the gauge.See TextAlign
    * @Default {left}
    */
  var textAlign: js.UndefOr[String] = js.undefined
  /** Specifies the color of the text.
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.undefined
  /** Specifies the text value.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    characterSettings: ItemsCharacterSettings = null,
    enableCustomFont: js.UndefOr[Boolean] = js.undefined,
    font: ItemsFont = null,
    position: ItemsPosition = null,
    segmentSettings: ItemsSegmentSettings = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    textAlign: String = null,
    textColor: String = null,
    value: String = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (characterSettings != null) __obj.updateDynamic("characterSettings")(characterSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCustomFont)) __obj.updateDynamic("enableCustomFont")(enableCustomFont.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (segmentSettings != null) __obj.updateDynamic("segmentSettings")(segmentSettings.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

