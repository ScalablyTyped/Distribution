package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesStripLine extends js.Object {
  /** Border color of the strip line.
    * @Default {gray}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Background color of the strip line.
    * @Default {gray}
    */
  var color: js.UndefOr[String] = js.undefined
  /** End value of the strip line.
    * @Default {null}
    */
  var end: js.UndefOr[Double] = js.undefined
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[AxesStripLineFont] = js.undefined
  /** Start value of the strip line.
    * @Default {null}
    */
  var start: js.UndefOr[Double] = js.undefined
  /** Indicates whether to render the strip line from the minimum/start value of the axis. This property does not work when start property is set.
    * @Default {false}
    */
  var startFromAxis: js.UndefOr[Boolean] = js.undefined
  /** Specifies text to be displayed inside the strip line.
    * @Default {stripLine}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the alignment of the text inside the strip line.
    * @Default {middlecenter. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.undefined
  /** Show/hides the strip line.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Width of the strip line.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.undefined
  /** Specifies the order where the strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered under the series and when it is â€œoverâ€, it is
    * rendered above the series.
    * @Default {over. See ZIndex}
    */
  var zIndex: js.UndefOr[ZIndex | String] = js.undefined
}

object AxesStripLine {
  @scala.inline
  def apply(
    borderColor: String = null,
    color: String = null,
    end: js.UndefOr[Double] = js.undefined,
    font: AxesStripLineFont = null,
    start: js.UndefOr[Double] = js.undefined,
    startFromAxis: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    textAlignment: TextAlignment | String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zIndex: ZIndex | String = null
  ): AxesStripLine = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startFromAxis)) __obj.updateDynamic("startFromAxis")(startFromAxis.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesStripLine]
  }
}

