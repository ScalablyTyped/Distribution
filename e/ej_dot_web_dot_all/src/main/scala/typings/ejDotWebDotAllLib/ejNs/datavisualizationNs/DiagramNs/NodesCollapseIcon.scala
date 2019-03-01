package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesCollapseIcon extends js.Object {
  /** Sets the border color for collapse icon of node
    * @Default {black}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the border width for collapse icon of node
    * @Default {1}
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Sets the fill color for collapse icon of node
    * @Default {white}
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the height for collapse icon of node
    * @Default {15}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Sets the horizontal alignment of the icon.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | java.lang.String] = js.undefined
  /** To set the margin for the collapse icon of node
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Sets the fraction/ratio(relative to node) that defines the position of the icon
    * @Default {ej.datavisualization.Diagram.Point(0.5, 1)}
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** Defines the shape of the collapsed state of the node.
    * @Default {ej.datavisualization.Diagram.IconShapes.None}
    */
  var shape: js.UndefOr[IconShapes | java.lang.String] = js.undefined
  /** Sets the vertical alignment of the icon.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | java.lang.String] = js.undefined
}

object NodesCollapseIcon {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    fillColor: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    horizontalAlignment: HorizontalAlignment | java.lang.String = null,
    margin: js.Any = null,
    offset: js.Any = null,
    shape: IconShapes | java.lang.String = null,
    verticalAlignment: VerticalAlignment | java.lang.String = null
  ): NodesCollapseIcon = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesCollapseIcon]
  }
}

