package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisMultiLevelLabel extends js.Object {
  /** Options for customizing the border of the series.
    */
  var border: js.UndefOr[PrimaryYAxisMultiLevelLabelsBorder] = js.undefined
  /** Ending value of the multi level labels.
    * @Default {null}
    */
  var end: js.UndefOr[Double] = js.undefined
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[PrimaryYAxisMultiLevelLabelsFont] = js.undefined
  /** Specifies the level of multi level labels.
    * @Default {0}
    */
  var level: js.UndefOr[Double] = js.undefined
  /** Specifies the maximum width of the text in multi level labels.
    * @Default {null}
    */
  var maximumTextWidth: js.UndefOr[Double] = js.undefined
  /** Starting value of the multi level labels.
    * @Default {null}
    */
  var start: js.UndefOr[Double] = js.undefined
  /** Text of the multi level labels.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the alignment of the text in multi level labels.
    * @Default {center. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
  /** Specifies the handling of text over flow in multi level labels.
    * @Default {center. See TextOverflow}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
  /** Visibility of the multi level labels.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PrimaryYAxisMultiLevelLabel {
  @scala.inline
  def apply(
    border: PrimaryYAxisMultiLevelLabelsBorder = null,
    end: Int | Double = null,
    font: PrimaryYAxisMultiLevelLabelsFont = null,
    level: Int | Double = null,
    maximumTextWidth: Int | Double = null,
    start: Int | Double = null,
    text: String = null,
    textAlignment: TextAlignment | String = null,
    textOverflow: TextOverflow | String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PrimaryYAxisMultiLevelLabel = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maximumTextWidth != null) __obj.updateDynamic("maximumTextWidth")(maximumTextWidth.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PrimaryYAxisMultiLevelLabel]
  }
}

