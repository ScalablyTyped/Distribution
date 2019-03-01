package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedItems extends js.Object {
  /** A read only collection of the selected items
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /** Controls the visibility of selector.
    * @Default {ej.datavisualization.Diagram.SelectorConstraints.All}
    */
  var constraints: js.UndefOr[SelectorConstraints | java.lang.String] = js.undefined
  /** Defines a method that dynamically enables/ disables the interaction with multiple selection.
    * @Default {null}
    */
  var getConstraints: js.UndefOr[js.Any] = js.undefined
  /** Sets the height of the selected items
    * @Default {0}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Sets the x position of the selector
    * @Default {0}
    */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /** Sets the y position of the selector
    * @Default {0}
    */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  /** Sets the angle to rotate the selected items
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[scala.Double] = js.undefined
  /** Sets the angle to rotate the selected items. For tooltip properties, refer Tooltip
    * @Default {ej.datavisualization.Diagram.Tooltip()}
    */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** A collection of frequently used commands that will be added around the selector
    * @Default {[]}
    */
  var userHandles: js.UndefOr[js.Array[SelectedItemsUserHandle]] = js.undefined
  /** Sets the width of the selected items
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SelectedItems {
  @scala.inline
  def apply(
    children: js.Array[_] = null,
    constraints: SelectorConstraints | java.lang.String = null,
    getConstraints: js.Any = null,
    height: scala.Int | scala.Double = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    rotateAngle: scala.Int | scala.Double = null,
    tooltip: js.Any = null,
    userHandles: js.Array[SelectedItemsUserHandle] = null,
    width: scala.Int | scala.Double = null
  ): SelectedItems = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (getConstraints != null) __obj.updateDynamic("getConstraints")(getConstraints)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (rotateAngle != null) __obj.updateDynamic("rotateAngle")(rotateAngle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (userHandles != null) __obj.updateDynamic("userHandles")(userHandles)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItems]
  }
}

