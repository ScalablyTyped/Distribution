package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesTitle extends js.Object {
  /** Specifies the position of the axis title.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[TextAlignment | java.lang.String] = js.undefined
  /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for customizing the title font.
    */
  var font: js.UndefOr[AxesTitleFont] = js.undefined
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
    * @Default {34}
    */
  var maximumTitleWidth: js.UndefOr[scala.Double] = js.undefined
  /** offset value for axis title.
    * @Default {0}
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position of the axis title.
    * @Default {outside. See Position}
    */
  var position: js.UndefOr[LabelPosition | java.lang.String] = js.undefined
  /** Title for the axis.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the visibility of axis title.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object AxesTitle {
  @scala.inline
  def apply(
    alignment: TextAlignment | java.lang.String = null,
    enableTrim: js.UndefOr[scala.Boolean] = js.undefined,
    font: AxesTitleFont = null,
    maximumTitleWidth: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    position: LabelPosition | java.lang.String = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): AxesTitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim)
    if (font != null) __obj.updateDynamic("font")(font)
    if (maximumTitleWidth != null) __obj.updateDynamic("maximumTitleWidth")(maximumTitleWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AxesTitle]
  }
}

