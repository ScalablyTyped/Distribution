package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisStripLine extends js.Object {
  /** Border color of the strip line.
    * @Default {gray}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Background color of the strip line.
    * @Default {gray}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** End value of the strip line.
    * @Default {null}
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[PrimaryYAxisStripLineFont] = js.undefined
  /** Start value of the strip line.
    * @Default {null}
    */
  var start: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether to render the strip line from the minimum/start value of the axis. This property wonâ€™t work when start property is set.
    * @Default {false}
    */
  var startFromAxis: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies text to be displayed inside the strip line.
    * @Default {stripLine}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the alignment of the text inside the strip line.
    * @Default {middlecenter. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | java.lang.String] = js.undefined
  /** Show/hides the strip line.
    * @Default {false}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the strip line.
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the order in which strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered below the series and when it is â€œoverâ€, it is
    * rendered above the series.
    * @Default {over. See ZIndex}
    */
  var zIndex: js.UndefOr[ZIndex | java.lang.String] = js.undefined
}

object PrimaryYAxisStripLine {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    color: java.lang.String = null,
    end: scala.Int | scala.Double = null,
    font: PrimaryYAxisStripLineFont = null,
    start: scala.Int | scala.Double = null,
    startFromAxis: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    textAlignment: TextAlignment | java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    zIndex: ZIndex | java.lang.String = null
  ): PrimaryYAxisStripLine = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(startFromAxis)) __obj.updateDynamic("startFromAxis")(startFromAxis)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisStripLine]
  }
}

