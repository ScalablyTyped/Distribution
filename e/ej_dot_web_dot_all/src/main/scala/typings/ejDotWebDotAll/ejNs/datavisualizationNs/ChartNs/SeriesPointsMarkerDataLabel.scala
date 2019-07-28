package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointsMarkerDataLabel extends js.Object {
  /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
    * @Default {null}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Options for customizing the border of the data label.
    */
  var border: js.UndefOr[SeriesPointsMarkerDataLabelBorder] = js.undefined
  /** Options for displaying and customizing the line that connects point and data label.
    */
  var connectorLine: js.UndefOr[SeriesPointsMarkerDataLabelConnectorLine] = js.undefined
  /** Background color of the data label.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[SeriesPointsMarkerDataLabelFont] = js.undefined
  /** Horizontal alignment of the data label.
    * @Default {center}
    */
  var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.undefined
  /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
    */
  var margin: js.UndefOr[SeriesPointsMarkerDataLabelMargin] = js.undefined
  /** Moves the label vertically by specified offset.
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.undefined
  /** Opacity of the data label.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Background shape of the data label.
    * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.undefined
  /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    */
  var template: js.UndefOr[String] = js.undefined
  /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
    * candle and OHLC.
    * @Default {top. See TextPosition}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.undefined
  /** Vertical alignment of the data label.
    * @Default {'center'}
    */
  var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.undefined
  /** Controls the visibility of the data labels.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SeriesPointsMarkerDataLabel {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    border: SeriesPointsMarkerDataLabelBorder = null,
    connectorLine: SeriesPointsMarkerDataLabelConnectorLine = null,
    fill: String = null,
    font: SeriesPointsMarkerDataLabelFont = null,
    horizontalTextAlignment: HorizontalTextAlignment | String = null,
    margin: SeriesPointsMarkerDataLabelMargin = null,
    offset: Int | Double = null,
    opacity: Int | Double = null,
    shape: Shape | String = null,
    template: String = null,
    textPosition: TextPosition | String = null,
    verticalTextAlignment: VerticalTextAlignment | String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SeriesPointsMarkerDataLabel = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (connectorLine != null) __obj.updateDynamic("connectorLine")(connectorLine)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalTextAlignment != null) __obj.updateDynamic("horizontalTextAlignment")(horizontalTextAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition.asInstanceOf[js.Any])
    if (verticalTextAlignment != null) __obj.updateDynamic("verticalTextAlignment")(verticalTextAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SeriesPointsMarkerDataLabel]
  }
}

