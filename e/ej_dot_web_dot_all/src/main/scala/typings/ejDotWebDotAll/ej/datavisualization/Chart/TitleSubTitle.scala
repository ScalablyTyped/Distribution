package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleSubTitle extends js.Object {
  /** Background color for the chart subtitle.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.undefined
  /** Options to customize the border of the title.
    */
  var border: js.UndefOr[TitleSubTitleBorder] = js.undefined
  /** Specifies whether to trim the Chart SubTitle when the width of the Subtitle exceeds the maximumWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the font of sub title.
    */
  var font: js.UndefOr[TitleSubTitleFont] = js.undefined
  /** Maximum width of the Subtitle, when the Subtitle exceeds this width, the Subtitle gets trimmed, when enableTrim is true.
    * @Default {auto}
    */
  var maximumWidth: js.UndefOr[String] = js.undefined
  /** Text to be displayed in sub title.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Alignment of sub title text.
    * @Default {far. See TextAlignment}
    */
  var textAlignment: js.UndefOr[Alignment | String] = js.undefined
  /** Specifies the action taken when the Chart width is more than the SubTitleWidth.
    * @Default {trim.}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
  /** Controls the visibility of the Chart SubTitle
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TitleSubTitle {
  @scala.inline
  def apply(
    background: String = null,
    border: TitleSubTitleBorder = null,
    enableTrim: js.UndefOr[Boolean] = js.undefined,
    font: TitleSubTitleFont = null,
    maximumWidth: String = null,
    text: String = null,
    textAlignment: Alignment | String = null,
    textOverflow: TextOverflow | String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TitleSubTitle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (maximumWidth != null) __obj.updateDynamic("maximumWidth")(maximumWidth.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleSubTitle]
  }
}

