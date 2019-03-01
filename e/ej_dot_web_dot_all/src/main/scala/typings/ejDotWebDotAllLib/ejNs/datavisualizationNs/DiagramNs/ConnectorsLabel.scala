package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsLabel extends js.Object {
  /** Defines how the label should be aligned with respect to the segment
    * @Default {ej.datavisualization.Diagram.Alignment.Center}
    */
  var alignment: js.UndefOr[Alignment | java.lang.String] = js.undefined
  /** Enables/disables the bold style
    * @Default {false}
    */
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the border color of the label
    * @Default {transparent}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the border width of the label
    * @Default {0}
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines whether the label should be aligned within the connector boundaries
    * @Default {true}
    */
  var boundaryConstraints: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the default behaviors of the label.
    * @Default {ej.datavisualization.Diagram.LabelConstraints.None}
    */
  var constraints: js.UndefOr[LabelConstraints | java.lang.String] = js.undefined
  /** Sets the value which is used to drag the label within certain bounds.
    * @Default {null}
    */
  var dragLimit: js.UndefOr[ConnectorsLabelsDragLimit] = js.undefined
  /** Sets the fill color of the text area
    * @Default {transparent}
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the font color of the text
    * @Default {black}
    */
  var fontColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the font family of the text
    * @Default {Arial}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the font size of the text
    * @Default {12}
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /** Sets the height of the label(the maximum value of label height and the connector height will be considered as label height)
    * @Default {0}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Sets the horizontal alignment of the label.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | java.lang.String] = js.undefined
  /** Sets the hyperlink for the labels in the connectors.
    * @Default {none}
    */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables the italic style
    * @Default {false}
    */
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the fraction/ratio(relative to connector) that defines the position of the label
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var margin: js.UndefOr[ConnectorsLabelsMargin] = js.undefined
  /** Gets whether the label is currently being edited or not.
    * @Default {ej.datavisualization.Diagram.LabelEditMode.Edit}
    */
  var mode: js.UndefOr[LabelEditMode | java.lang.String] = js.undefined
  /** Sets the unique identifier of the label
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the fraction/ratio(relative to connector) that defines the position of the label
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** Defines the transparency of labels
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Sets the padding for connector label.
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** Defines whether the label is editable or not
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines whether the label should be positioned whether relative to segments or connector boundaries
    * @Default {ej.datavisualization.Diagram.LabelRelativeMode.SegmentPath}
    */
  var relativeMode: js.UndefOr[LabelRelativeMode | java.lang.String] = js.undefined
  /** Defines the angle to which the label needs to be rotated
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[scala.Double] = js.undefined
  /** Sets the position of the label with respect to the total segment length
    * @Default {0.5}
    */
  var segmentOffset: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the label text
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Defines how to align the text inside the label.
    * @Default {ej.datavisualization.Diagram.TextAlign.Center}
    */
  var textAlign: js.UndefOr[TextAlign | java.lang.String] = js.undefined
  /** Sets how to decorate the label text.
    * @Default {ej.datavisualization.Diagram.TextDecorations.None}
    */
  var textDecoration: js.UndefOr[TextDecorations | java.lang.String] = js.undefined
  /** Sets the vertical alignment of the label.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | java.lang.String] = js.undefined
  /** Enables or disables the visibility of the label
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the width of the label(the maximum value of label width and the connector width will be considered as label width)
    * @Default {50}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Defines how the label text needs to be wrapped.
    * @Default {ej.datavisualization.Diagram.TextWrapping.WrapWithOverflow}
    */
  var wrapping: js.UndefOr[TextWrapping | java.lang.String] = js.undefined
}

object ConnectorsLabel {
  @scala.inline
  def apply(
    alignment: Alignment | java.lang.String = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    borderColor: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    boundaryConstraints: js.UndefOr[scala.Boolean] = js.undefined,
    constraints: LabelConstraints | java.lang.String = null,
    dragLimit: ConnectorsLabelsDragLimit = null,
    fillColor: java.lang.String = null,
    fontColor: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    horizontalAlignment: HorizontalAlignment | java.lang.String = null,
    hyperlink: java.lang.String = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    margin: ConnectorsLabelsMargin = null,
    mode: LabelEditMode | java.lang.String = null,
    name: java.lang.String = null,
    offset: js.Any = null,
    opacity: scala.Int | scala.Double = null,
    padding: js.Any = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    relativeMode: LabelRelativeMode | java.lang.String = null,
    rotateAngle: scala.Int | scala.Double = null,
    segmentOffset: java.lang.String = null,
    text: java.lang.String = null,
    textAlign: TextAlign | java.lang.String = null,
    textDecoration: TextDecorations | java.lang.String = null,
    verticalAlignment: VerticalAlignment | java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    wrapping: TextWrapping | java.lang.String = null
  ): ConnectorsLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(boundaryConstraints)) __obj.updateDynamic("boundaryConstraints")(boundaryConstraints)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (dragLimit != null) __obj.updateDynamic("dragLimit")(dragLimit)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (relativeMode != null) __obj.updateDynamic("relativeMode")(relativeMode.asInstanceOf[js.Any])
    if (rotateAngle != null) __obj.updateDynamic("rotateAngle")(rotateAngle.asInstanceOf[js.Any])
    if (segmentOffset != null) __obj.updateDynamic("segmentOffset")(segmentOffset)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapping != null) __obj.updateDynamic("wrapping")(wrapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsLabel]
  }
}

