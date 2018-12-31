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

