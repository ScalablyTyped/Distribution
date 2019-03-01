package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisMultiLevelLabel extends js.Object {
  /** Options for customizing the border of the series.
    */
  var border: js.UndefOr[PrimaryXAxisMultiLevelLabelsBorder] = js.undefined
  /** Ending value of the multi level labels.
    * @Default {null}
    */
  var end: js.UndefOr[js.Any] = js.undefined
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[PrimaryXAxisMultiLevelLabelsFont] = js.undefined
  /** Specifies the level of multi level labels.
    * @Default {0}
    */
  var level: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the maximum width of the text in multi level labels.
    * @Default {null}
    */
  var maximumTextWidth: js.UndefOr[scala.Double] = js.undefined
  /** Starting value of the multi level labels.
    * @Default {null}
    */
  var start: js.UndefOr[js.Any] = js.undefined
  /** Text of the multi level labels.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment of the text in multi level labels.
    * @Default {center. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | java.lang.String] = js.undefined
  /** Specifies the handling of text over flow in multi level labels.
    * @Default {center. See TextOverflow}
    */
  var textOverflow: js.UndefOr[TextOverflow | java.lang.String] = js.undefined
  /** Visibility of the multi level labels.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object PrimaryXAxisMultiLevelLabel {
  @scala.inline
  def apply(
    border: PrimaryXAxisMultiLevelLabelsBorder = null,
    end: js.Any = null,
    font: PrimaryXAxisMultiLevelLabelsFont = null,
    level: scala.Int | scala.Double = null,
    maximumTextWidth: scala.Int | scala.Double = null,
    start: js.Any = null,
    text: java.lang.String = null,
    textAlignment: TextAlignment | java.lang.String = null,
    textOverflow: TextOverflow | java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PrimaryXAxisMultiLevelLabel = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (end != null) __obj.updateDynamic("end")(end)
    if (font != null) __obj.updateDynamic("font")(font)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maximumTextWidth != null) __obj.updateDynamic("maximumTextWidth")(maximumTextWidth.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PrimaryXAxisMultiLevelLabel]
  }
}

