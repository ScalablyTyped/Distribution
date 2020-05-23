package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettings extends js.Object {
  /** Specifies whether trim the labels will be true or false.
    * @Default {true}
    */
  var enableTrim: js.UndefOr[Boolean] = js.undefined
  /** Contains property to customize the font of caption.
    */
  var font: js.UndefOr[CaptionSettingsFont] = js.undefined
  /** Contains property to customize the indicator.
    */
  var indicator: js.UndefOr[CaptionSettingsIndicator] = js.undefined
  /** Contains property to customize the location.
    */
  var location: js.UndefOr[CaptionSettingsLocation] = js.undefined
  /** Specifies the padding to be applied when text position is used.
    * @Default {5}
    */
  var padding: js.UndefOr[Double] = js.undefined
  /** Contains property to customize the subtitle.
    */
  var subTitle: js.UndefOr[CaptionSettingsSubTitle] = js.undefined
  /** Specifies the text to be displayed on bullet graph.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the alignment of caption text with respect to scale. This property will not be applied when text position is float.
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
  /** Specifies caption text anchoring when caption text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same position.
    * Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.undefined
  /** Specifies the angel in which the caption is rendered.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.undefined
  /** Specifies how caption text should be placed.
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.undefined
}

object CaptionSettings {
  @scala.inline
  def apply(
    enableTrim: js.UndefOr[Boolean] = js.undefined,
    font: CaptionSettingsFont = null,
    indicator: CaptionSettingsIndicator = null,
    location: CaptionSettingsLocation = null,
    padding: js.UndefOr[Double] = js.undefined,
    subTitle: CaptionSettingsSubTitle = null,
    text: String = null,
    textAlignment: TextAlignment | String = null,
    textAnchor: TextAnchor | String = null,
    textAngle: js.UndefOr[Double] = js.undefined,
    textPosition: TextPosition | String = null
  ): CaptionSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (!js.isUndefined(textAngle)) __obj.updateDynamic("textAngle")(textAngle.get.asInstanceOf[js.Any])
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettings]
  }
}

