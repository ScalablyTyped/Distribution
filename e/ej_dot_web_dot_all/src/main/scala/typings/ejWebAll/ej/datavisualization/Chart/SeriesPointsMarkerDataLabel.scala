package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPointsMarkerDataLabel extends js.Object {
  /** Angle of the data label in degrees. Only the text gets rotated, whereas the background and border does not rotate.
    * @Default {null}
    */
  var angle: js.UndefOr[Double] = js.native
  /** Options for customizing the border of the data label.
    */
  var border: js.UndefOr[SeriesPointsMarkerDataLabelBorder] = js.native
  /** Options for displaying and customizing the line that connects point and data label.
    */
  var connectorLine: js.UndefOr[SeriesPointsMarkerDataLabelConnectorLine] = js.native
  /** Background color of the data label.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the data label font.
    */
  var font: js.UndefOr[SeriesPointsMarkerDataLabelFont] = js.native
  /** Horizontal alignment of the data label.
    * @Default {center}
    */
  var horizontalTextAlignment: js.UndefOr[HorizontalTextAlignment | String] = js.native
  /** Margin of the text to its background shape. The size of the background shape increases based on the margin applied to its text.
    */
  var margin: js.UndefOr[SeriesPointsMarkerDataLabelMargin] = js.native
  /** Moves the label vertically by specified offset.
    * @Default {0}
    */
  var offset: js.UndefOr[Double] = js.native
  /** Opacity of the data label.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Background shape of the data label.
    * @Default {No shape is rendered by default, so its value is â€˜noneâ€™. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.native
  /** Custom template to format the data label content. Use â€œpoint.xâ€ and â€œpoint.yâ€ as a placeholder text to display the corresponding data pointâ€™s x and y value.
    */
  var template: js.UndefOr[String] = js.native
  /** Specifies the position of the data label. This property can be used only for the series such as column, bar, stacked column, stacked bar, 100% stacked column, 100% stacked bar,
    * candle and OHLC.
    * @Default {top. See TextPosition}
    */
  var textPosition: js.UndefOr[TextPosition | String] = js.native
  /** Vertical alignment of the data label.
    * @Default {'center'}
    */
  var verticalTextAlignment: js.UndefOr[VerticalTextAlignment | String] = js.native
  /** Controls the visibility of the data labels.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object SeriesPointsMarkerDataLabel {
  @scala.inline
  def apply(): SeriesPointsMarkerDataLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPointsMarkerDataLabel]
  }
  @scala.inline
  implicit class SeriesPointsMarkerDataLabelOps[Self <: SeriesPointsMarkerDataLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setBorder(value: SeriesPointsMarkerDataLabelBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setConnectorLine(value: SeriesPointsMarkerDataLabelConnectorLine): Self = this.set("connectorLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorLine: Self = this.set("connectorLine", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: SeriesPointsMarkerDataLabelFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalTextAlignment(value: HorizontalTextAlignment | String): Self = this.set("horizontalTextAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalTextAlignment: Self = this.set("horizontalTextAlignment", js.undefined)
    @scala.inline
    def setMargin(value: SeriesPointsMarkerDataLabelMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShape(value: Shape | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTextPosition(value: TextPosition | String): Self = this.set("textPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextPosition: Self = this.set("textPosition", js.undefined)
    @scala.inline
    def setVerticalTextAlignment(value: VerticalTextAlignment | String): Self = this.set("verticalTextAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalTextAlignment: Self = this.set("verticalTextAlignment", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

