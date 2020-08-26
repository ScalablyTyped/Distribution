package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItems extends js.Object {
  /** A read only collection of the selected items
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.native
  /** Controls the visibility of selector.
    * @Default {ej.datavisualization.Diagram.SelectorConstraints.All}
    */
  var constraints: js.UndefOr[SelectorConstraints | String] = js.native
  /** Defines a method that dynamically enables/ disables the interaction with multiple selection.
    * @Default {null}
    */
  var getConstraints: js.UndefOr[js.Any] = js.native
  /** Sets the height of the selected items
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** Sets the x position of the selector
    * @Default {0}
    */
  var offsetX: js.UndefOr[Double] = js.native
  /** Sets the y position of the selector
    * @Default {0}
    */
  var offsetY: js.UndefOr[Double] = js.native
  /** Sets the angle to rotate the selected items
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[Double] = js.native
  /** Sets the angle to rotate the selected items. For tooltip properties, refer Tooltip
    * @Default {ej.datavisualization.Diagram.Tooltip()}
    */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** A collection of frequently used commands that will be added around the selector
    * @Default {[]}
    */
  var userHandles: js.UndefOr[js.Array[SelectedItemsUserHandle]] = js.native
  /** Sets the width of the selected items
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object SelectedItems {
  @scala.inline
  def apply(): SelectedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItems]
  }
  @scala.inline
  implicit class SelectedItemsOps[Self <: SelectedItems] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setConstraints(value: SelectorConstraints | String): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setGetConstraints(value: js.Any): Self = this.set("getConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetConstraints: Self = this.set("getConstraints", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setRotateAngle(value: Double): Self = this.set("rotateAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateAngle: Self = this.set("rotateAngle", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setUserHandlesVarargs(value: SelectedItemsUserHandle*): Self = this.set("userHandles", js.Array(value :_*))
    @scala.inline
    def setUserHandles(value: js.Array[SelectedItemsUserHandle]): Self = this.set("userHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserHandles: Self = this.set("userHandles", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

