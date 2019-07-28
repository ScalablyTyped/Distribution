package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsMarkerDataLabel extends js.Object {
  /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
    * @Default {null}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Options for customizing the border of the data label.
    */
  var border: js.UndefOr[CommonSeriesOptionsMarkerDataLabelBorder] = js.undefined
  /** Options for displaying and customizing the line that connects point and data label.
    */
  var connectorLine: js.UndefOr[CommonSeriesOptionsMarkerDataLabelConnectorLine] = js.undefined
  /** Enables saturation to the data label.
    * @Default {false}
    */
  var enableContrastColor: js.UndefOr[Boolean] = js.undefined
  /** Enable the wrap option to the data label.
    * @Default {false}
    */
  var enableWrap: js.UndefOr[Boolean] = js.undefined
  /** Background color of the data label.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[CommonSeriesOptionsMarkerDataLabelFont] = js.undefined
  /** Horizontal alignment of the data label.
    * @Default {center}
    */
  var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.undefined
  /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
    */
  var margin: js.UndefOr[CommonSeriesOptionsMarkerDataLabelMargin] = js.undefined
  /** Maximum label width of the data label.
    * @Default {null}
    */
  var maximumLabelWidth: js.UndefOr[Double] = js.undefined
  /** Options for customizing the datalabel positions
    */
  var offset: js.UndefOr[CommonSeriesOptionsMarkerDataLabelOffset] = js.undefined
  /** Opacity of the data label.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Background shape of the data label.
    * @Default {none. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.undefined
  /** Displays the partially visible labels inside the chart Area
    * @Default {false}
    */
  var showEdgeLabels: js.UndefOr[Boolean] = js.undefined
  /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    */
  var template: js.UndefOr[String] = js.undefined
  /** Name of a field in data source, where datalabel text is displayed.
    */
  var textMappingName: js.UndefOr[String] = js.undefined
  /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
    * candle and OHLC.
    * @Default {top. See TextPosition}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.undefined
  /** Vertical alignment of the data label.
    * @Default {center}
    */
  var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.undefined
  /** Controls the visibility of the data labels.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CommonSeriesOptionsMarkerDataLabel {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    border: CommonSeriesOptionsMarkerDataLabelBorder = null,
    connectorLine: CommonSeriesOptionsMarkerDataLabelConnectorLine = null,
    enableContrastColor: js.UndefOr[Boolean] = js.undefined,
    enableWrap: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    font: CommonSeriesOptionsMarkerDataLabelFont = null,
    horizontalTextAlignment: HorizontalTextAlignment | String = null,
    margin: CommonSeriesOptionsMarkerDataLabelMargin = null,
    maximumLabelWidth: Int | Double = null,
    offset: CommonSeriesOptionsMarkerDataLabelOffset = null,
    opacity: Int | Double = null,
    shape: Shape | String = null,
    showEdgeLabels: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    textMappingName: String = null,
    textPosition: TextPosition | String = null,
    verticalTextAlignment: VerticalTextAlignment | String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CommonSeriesOptionsMarkerDataLabel = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (connectorLine != null) __obj.updateDynamic("connectorLine")(connectorLine)
    if (!js.isUndefined(enableContrastColor)) __obj.updateDynamic("enableContrastColor")(enableContrastColor)
    if (!js.isUndefined(enableWrap)) __obj.updateDynamic("enableWrap")(enableWrap)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalTextAlignment != null) __obj.updateDynamic("horizontalTextAlignment")(horizontalTextAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maximumLabelWidth != null) __obj.updateDynamic("maximumLabelWidth")(maximumLabelWidth.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(showEdgeLabels)) __obj.updateDynamic("showEdgeLabels")(showEdgeLabels)
    if (template != null) __obj.updateDynamic("template")(template)
    if (textMappingName != null) __obj.updateDynamic("textMappingName")(textMappingName)
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition.asInstanceOf[js.Any])
    if (verticalTextAlignment != null) __obj.updateDynamic("verticalTextAlignment")(verticalTextAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CommonSeriesOptionsMarkerDataLabel]
  }
}

