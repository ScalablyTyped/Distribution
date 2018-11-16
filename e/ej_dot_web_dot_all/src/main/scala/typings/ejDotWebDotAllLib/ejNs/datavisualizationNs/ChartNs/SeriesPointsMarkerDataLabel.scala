package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SeriesPointsMarkerDataLabel extends js.Object {
  /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
               * @Default {null}
               */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the border of the data label.
               */
  var border: js.UndefOr[SeriesPointsMarkerDataLabelBorder] = js.undefined
  /** Options for displaying and customizing the line that connects point and data label.
               */
  var connectorLine: js.UndefOr[SeriesPointsMarkerDataLabelConnectorLine] = js.undefined
  /** Background color of the data label.
               * @Default {null}
               */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options for customizing the data label font.
               */
  var font: js.UndefOr[SeriesPointsMarkerDataLabelFont] = js.undefined
  /** Horizontal alignment of the data label.
               * @Default {center}
               */
  var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | java.lang.String] = js.undefined
  /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
               */
  var margin: js.UndefOr[SeriesPointsMarkerDataLabelMargin] = js.undefined
  /** Moves the label vertically by specified offset.
               * @Default {0}
               */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Opacity of the data label.
               * @Default {1}
               */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Background shape of the data label.
               * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
               */
  var shape: js.UndefOr[Shape | java.lang.String] = js.undefined
  /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
               */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
               * candle and OHLC.
               * @Default {top. See TextPosition}
               */
  var textPosition: js.UndefOr[TextPosition | java.lang.String] = js.undefined
  /** Vertical alignment of the data label.
               * @Default {'center'}
               */
  var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | java.lang.String] = js.undefined
  /** Controls the visibility of the data labels.
               * @Default {false}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

