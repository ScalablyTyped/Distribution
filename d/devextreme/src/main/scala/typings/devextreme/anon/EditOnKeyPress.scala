package typings.devextreme.anon

import typings.devextreme.devextremeStrings.column
import typings.devextreme.devextremeStrings.moveFocus
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.row
import typings.devextreme.devextremeStrings.startEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditOnKeyPress extends js.Object {
  var editOnKeyPress: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var enterKeyAction: js.UndefOr[startEdit | moveFocus] = js.native
  var enterKeyDirection: js.UndefOr[none | column | row] = js.native
}

object EditOnKeyPress {
  @scala.inline
  def apply(): EditOnKeyPress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOnKeyPress]
  }
  @scala.inline
  implicit class EditOnKeyPressOps[Self <: EditOnKeyPress] (val x: Self) extends AnyVal {
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
    def setEditOnKeyPress(value: Boolean): Self = this.set("editOnKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditOnKeyPress: Self = this.set("editOnKeyPress", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEnterKeyAction(value: startEdit | moveFocus): Self = this.set("enterKeyAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterKeyAction: Self = this.set("enterKeyAction", js.undefined)
    @scala.inline
    def setEnterKeyDirection(value: none | column | row): Self = this.set("enterKeyDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterKeyDirection: Self = this.set("enterKeyDirection", js.undefined)
  }
  
}

