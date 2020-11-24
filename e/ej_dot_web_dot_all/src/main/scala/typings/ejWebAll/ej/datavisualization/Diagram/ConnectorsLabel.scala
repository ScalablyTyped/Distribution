package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorsLabel extends js.Object {
  
  /** Defines how the label should be aligned with respect to the segment
    * @Default {ej.datavisualization.Diagram.Alignment.Center}
    */
  var alignment: js.UndefOr[Alignment | String] = js.native
  
  /** Enables/disables the bold style
    * @Default {false}
    */
  var bold: js.UndefOr[Boolean] = js.native
  
  /** Sets the border color of the label
    * @Default {transparent}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** Sets the border width of the label
    * @Default {0}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /** Defines whether the label should be aligned within the connector boundaries
    * @Default {true}
    */
  var boundaryConstraints: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the default behaviors of the label.
    * @Default {ej.datavisualization.Diagram.LabelConstraints.None}
    */
  var constraints: js.UndefOr[LabelConstraints | String] = js.native
  
  /** Sets the value which is used to drag the label within certain bounds.
    * @Default {null}
    */
  var dragLimit: js.UndefOr[ConnectorsLabelsDragLimit] = js.native
  
  /** Sets the fill color of the text area
    * @Default {transparent}
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /** Sets the font color of the text
    * @Default {black}
    */
  var fontColor: js.UndefOr[String] = js.native
  
  /** Sets the font family of the text
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /** Defines the font size of the text
    * @Default {12}
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /** Sets the height of the label(the maximum value of label height and the connector height will be considered as label height)
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Sets the horizontal alignment of the label.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  
  /** Sets the hyperlink for the labels in the connectors.
    * @Default {none}
    */
  var hyperlink: js.UndefOr[String] = js.native
  
  /** Enables/disables the italic style
    * @Default {false}
    */
  var italic: js.UndefOr[Boolean] = js.native
  
  /** Sets the fraction/ratio(relative to connector) that defines the position of the label
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var margin: js.UndefOr[ConnectorsLabelsMargin] = js.native
  
  /** Gets whether the label is currently being edited or not.
    * @Default {ej.datavisualization.Diagram.LabelEditMode.Edit}
    */
  var mode: js.UndefOr[LabelEditMode | String] = js.native
  
  /** Sets the unique identifier of the label
    */
  var name: js.UndefOr[String] = js.native
  
  /** Sets the fraction/ratio(relative to connector) that defines the position of the label
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  
  /** Defines the transparency of labels
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Sets the padding for connector label.
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var padding: js.UndefOr[js.Any] = js.native
  
  /** Defines whether the label is editable or not
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /** Defines whether the label should be positioned whether relative to segments or connector boundaries
    * @Default {ej.datavisualization.Diagram.LabelRelativeMode.SegmentPath}
    */
  var relativeMode: js.UndefOr[LabelRelativeMode | String] = js.native
  
  /** Defines the angle to which the label needs to be rotated
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[Double] = js.native
  
  /** Sets the position of the label with respect to the total segment length
    * @Default {0.5}
    */
  var segmentOffset: js.UndefOr[String] = js.native
  
  /** Defines the label text
    */
  var text: js.UndefOr[String] = js.native
  
  /** Defines how to align the text inside the label.
    * @Default {ej.datavisualization.Diagram.TextAlign.Center}
    */
  var textAlign: js.UndefOr[TextAlign | String] = js.native
  
  /** Sets how to decorate the label text.
    * @Default {ej.datavisualization.Diagram.TextDecorations.None}
    */
  var textDecoration: js.UndefOr[TextDecorations | String] = js.native
  
  /** Sets the vertical alignment of the label.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  
  /** Enables or disables the visibility of the label
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Sets the width of the label(the maximum value of label width and the connector width will be considered as label width)
    * @Default {50}
    */
  var width: js.UndefOr[Double] = js.native
  
  /** Defines how the label text needs to be wrapped.
    * @Default {ej.datavisualization.Diagram.TextWrapping.WrapWithOverflow}
    */
  var wrapping: js.UndefOr[TextWrapping | String] = js.native
}
object ConnectorsLabel {
  
  @scala.inline
  def apply(): ConnectorsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsLabel]
  }
  
  @scala.inline
  implicit class ConnectorsLabelOps[Self <: ConnectorsLabel] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: Alignment | String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBoundaryConstraints(value: Boolean): Self = this.set("boundaryConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryConstraints: Self = this.set("boundaryConstraints", js.undefined)
    
    @scala.inline
    def setConstraints(value: LabelConstraints | String): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setDragLimit(value: ConnectorsLabelsDragLimit): Self = this.set("dragLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragLimit: Self = this.set("dragLimit", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: HorizontalAlignment | String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setMargin(value: ConnectorsLabelsMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMode(value: LabelEditMode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRelativeMode(value: LabelRelativeMode | String): Self = this.set("relativeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeMode: Self = this.set("relativeMode", js.undefined)
    
    @scala.inline
    def setRotateAngle(value: Double): Self = this.set("rotateAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotateAngle: Self = this.set("rotateAngle", js.undefined)
    
    @scala.inline
    def setSegmentOffset(value: String): Self = this.set("segmentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentOffset: Self = this.set("segmentOffset", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlign | String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: TextDecorations | String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrapping(value: TextWrapping | String): Self = this.set("wrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapping: Self = this.set("wrapping", js.undefined)
  }
}
