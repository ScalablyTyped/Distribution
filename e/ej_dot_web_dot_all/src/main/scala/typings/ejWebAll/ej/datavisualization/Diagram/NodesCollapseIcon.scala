package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesCollapseIcon extends js.Object {
  /** Sets the border color for collapse icon of node
    * @Default {black}
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /** Sets the border width for collapse icon of node
    * @Default {1}
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /** Sets the fill color for collapse icon of node
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /** Defines the height for collapse icon of node
    * @Default {15}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Sets the horizontal alignment of the icon.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
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
  var shape: js.UndefOr[IconShapes | String] = js.undefined
  /** Sets the vertical alignment of the icon.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.undefined
}

object NodesCollapseIcon {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    fillColor: String = null,
    height: js.UndefOr[Double] = js.undefined,
    horizontalAlignment: HorizontalAlignment | String = null,
    margin: js.Any = null,
    offset: js.Any = null,
    shape: IconShapes | String = null,
    verticalAlignment: VerticalAlignment | String = null
  ): NodesCollapseIcon = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesCollapseIcon]
  }
}

