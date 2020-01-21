package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisTitle extends js.Object {
  /** Specifies the position of the axis title.
    * @Default {center. See Alignment}
    */
  var alignment: js.UndefOr[TextAlignment | String] = js.undefined
  /** Specifies whether to trim the axis title when it exceeds the chart area or the maximum width of the title.
    * @Default {false}
    */
  var enableTrim: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the title font.
    */
  var font: js.UndefOr[PrimaryXAxisTitleFont] = js.undefined
  /** Maximum width of the title, when the title exceeds this width, the title gets trimmed, when enableTrim is true.
    * @Default {34}
    */
  var maximumTitleWidth: js.UndefOr[Double] = js.undefined
  /** offset value for axis title.
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.undefined
  /** Specifies the position of the axis title.
    * @Default {outside. See Position}
    */
  var position: js.UndefOr[LabelPosition | String] = js.undefined
  /** Title for the axis.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Controls the visibility of axis title.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PrimaryXAxisTitle {
  @scala.inline
  def apply(
    alignment: TextAlignment | String = null,
    enableTrim: js.UndefOr[Boolean] = js.undefined,
    font: PrimaryXAxisTitleFont = null,
    maximumTitleWidth: Int | Double = null,
    offset: Int | Double = null,
    position: LabelPosition | String = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PrimaryXAxisTitle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrim)) __obj.updateDynamic("enableTrim")(enableTrim.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (maximumTitleWidth != null) __obj.updateDynamic("maximumTitleWidth")(maximumTitleWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisTitle]
  }
}

