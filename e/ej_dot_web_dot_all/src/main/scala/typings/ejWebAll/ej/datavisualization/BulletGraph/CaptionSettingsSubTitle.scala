package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsSubTitle extends js.Object {
  /** Contains property to customize the font of subtitle.
    */
  var font: js.UndefOr[CaptionSettingsSubTitleFont] = js.undefined
  /** Contains property to customize the location of subtitle.
    */
  var location: js.UndefOr[CaptionSettingsSubTitleLocation] = js.undefined
  /** Specifies the padding to be applied when text position is used.
    * @Default {5}
    */
  var padding: js.UndefOr[Double] = js.undefined
  /** Specifies the text to be displayed as subtitle.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the alignment of sub title text with respect to scale. Alignment will not be applied in float position.
    * @Default {'Near'}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
  /** Specifies where subtitle text should be anchored when sub title text overlaps with other caption group text. Text will be anchored when overlapping caption group text are at same
    * position. Anchoring is not applicable for float position.
    * @Default {'start'}
    */
  var textAnchor: js.UndefOr[TextAnchor | String] = js.undefined
  /** Subtitle render in the specified angle.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.undefined
  /** Specifies where sub title text should be placed.
    * @Default {'float'}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.undefined
}

object CaptionSettingsSubTitle {
  @scala.inline
  def apply(
    font: CaptionSettingsSubTitleFont = null,
    location: CaptionSettingsSubTitleLocation = null,
    padding: Int | Double = null,
    text: String = null,
    textAlignment: TextAlignment | String = null,
    textAnchor: TextAnchor | String = null,
    textAngle: Int | Double = null,
    textPosition: TextPosition | String = null
  ): CaptionSettingsSubTitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textAngle != null) __obj.updateDynamic("textAngle")(textAngle.asInstanceOf[js.Any])
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsSubTitle]
  }
}

