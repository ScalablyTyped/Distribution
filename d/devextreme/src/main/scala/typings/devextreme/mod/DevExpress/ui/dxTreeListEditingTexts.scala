package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeListEditingTexts extends GridBaseEditingTexts {
  /** @name dxTreeList.Options.editing.texts.addRowToNode */
  var addRowToNode: js.UndefOr[String] = js.native
}

object dxTreeListEditingTexts {
  @scala.inline
  def apply(): dxTreeListEditingTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListEditingTexts]
  }
  @scala.inline
  implicit class dxTreeListEditingTextsOps[Self <: dxTreeListEditingTexts] (val x: Self) extends AnyVal {
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
    def setAddRowToNode(value: String): Self = this.set("addRowToNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddRowToNode: Self = this.set("addRowToNode", js.undefined)
  }
  
}

