package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current cell row and column index.
    */
  var currentCell: js.UndefOr[js.Any] = js.native
  /** Returns the drag cells range object.
    */
  var dragAndDropRange: js.UndefOr[js.Any] = js.native
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns the cell Overwriting alert option value.
    */
  var preventAlert: js.UndefOr[Boolean] = js.native
  /** Returns the sheet index.
    */
  var sheetIdx: js.UndefOr[Double] = js.native
  /** Returns the target item.
    */
  var target: js.UndefOr[HTMLElement] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object BeforeDropEventArgs {
  @scala.inline
  def apply(): BeforeDropEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeDropEventArgs]
  }
  @scala.inline
  implicit class BeforeDropEventArgsOps[Self <: BeforeDropEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCurrentCell(value: js.Any): Self = this.set("currentCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentCell: Self = this.set("currentCell", js.undefined)
    @scala.inline
    def setDragAndDropRange(value: js.Any): Self = this.set("dragAndDropRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAndDropRange: Self = this.set("dragAndDropRange", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPreventAlert(value: Boolean): Self = this.set("preventAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventAlert: Self = this.set("preventAlert", js.undefined)
    @scala.inline
    def setSheetIdx(value: Double): Self = this.set("sheetIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetIdx: Self = this.set("sheetIdx", js.undefined)
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

