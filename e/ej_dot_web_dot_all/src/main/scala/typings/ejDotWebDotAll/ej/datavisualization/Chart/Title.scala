package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /** Background color for the chart title.
    * @Default {transparent}
    */
  var background: js.UndefOr[String] = js.undefined
  /** Options to customize the border of the title.
    */
  var border: js.UndefOr[TitleBorder] = js.undefined
  /** Specifies whether to trim the Chart Title when the width of the title exceeds the maximumWidth.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the font of Chart title.
    */
  var font: js.UndefOr[TitleFont] = js.undefined
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
    * @Default {auto}
    */
  var maximumWidth: js.UndefOr[String] = js.undefined
  /** Options to customize the sub title of Chart.
    */
  var subTitle: js.UndefOr[TitleSubTitle] = js.undefined
  /** Text to be displayed in Chart title.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Alignment of the title text.
    * @Default {Center. See TextAlignment}
    */
  var textAlignment: js.UndefOr[Alignment | String] = js.undefined
  /** Specifies the action taken when the Chart width is more than the titleWidth.
    * @Default {trim.}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
  /** Controls the visibility of the Chart title
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Title {
  @scala.inline
  def apply(
    background: String = null,
    border: TitleBorder = null,
    enableTrim: js.UndefOr[Boolean] = js.undefined,
    font: TitleFont = null,
    maximumWidth: String = null,
    subTitle: TitleSubTitle = null,
    text: String = null,
    textAlignment: Alignment | String = null,
    textOverflow: TextOverflow | String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Title = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (maximumWidth != null) __obj.updateDynamic("maximumWidth")(maximumWidth.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

