package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemsUserHandle extends js.Object {
  /** Defines the background color of the user handle
    * @Default {#2382c3}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Sets the border color of the user handle
    * @Default {transparent}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Defines whether the user handle should be added, when more than one element is selected
    * @Default {false}
    */
  var enableMultiSelection: js.UndefOr[Boolean] = js.native
  /** Sets the horizontal alignment of the user handle
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  /** To set the margin of the user handle
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines the name of the user handle
    */
  var name: js.UndefOr[String] = js.native
  /** Sets the fraction/ratio(relative to node) that defines the position of the user handle
    * @Default {ej.datavisualization.Diagram.point(0.5, 1)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  /** Sets the stroke color of the user handle
    * @Default {transparent}
    */
  var pathColor: js.UndefOr[String] = js.native
  /** Defines the custom shape of the user handle
    */
  var pathData: js.UndefOr[String] = js.native
  /** Defines the position of the user handle
    * @Default {ej.datavisualization.Diagram.UserHandlePositions.BottomCenter}
    */
  var position: js.UndefOr[UserHandlePositions | String] = js.native
  /** Defines the size of the user handle
    * @Default {8}
    */
  var size: js.UndefOr[Double] = js.native
  /** Defines the interactive behaviors of the user handle
    */
  var tool: js.UndefOr[js.Any] = js.native
  /** Sets the vertical alignment of the user handle
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  /** Defines the visibility of the user handle
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object SelectedItemsUserHandle {
  @scala.inline
  def apply(): SelectedItemsUserHandle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsUserHandle]
  }
  @scala.inline
  implicit class SelectedItemsUserHandleOps[Self <: SelectedItemsUserHandle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setEnableMultiSelection(value: Boolean): Self = this.set("enableMultiSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMultiSelection: Self = this.set("enableMultiSelection", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: HorizontalAlignment | String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPathColor(value: String): Self = this.set("pathColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathColor: Self = this.set("pathColor", js.undefined)
    @scala.inline
    def setPathData(value: String): Self = this.set("pathData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathData: Self = this.set("pathData", js.undefined)
    @scala.inline
    def setPosition(value: UserHandlePositions | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTool(value: js.Any): Self = this.set("tool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTool: Self = this.set("tool", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

