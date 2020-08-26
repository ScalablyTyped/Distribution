package typings.devextreme.anon

import typings.devextreme.devextremeStrings.buttonClick
import typings.devextreme.devextremeStrings.rowClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowCollapsing extends js.Object {
  var allowCollapsing: js.UndefOr[Boolean] = js.native
  var autoExpandAll: js.UndefOr[Boolean] = js.native
  var contextMenuEnabled: js.UndefOr[Boolean] = js.native
  var expandMode: js.UndefOr[buttonClick | rowClick] = js.native
  var texts: js.UndefOr[GroupByThisColumn] = js.native
}

object AllowCollapsing {
  @scala.inline
  def apply(): AllowCollapsing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowCollapsing]
  }
  @scala.inline
  implicit class AllowCollapsingOps[Self <: AllowCollapsing] (val x: Self) extends AnyVal {
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
    def setAllowCollapsing(value: Boolean): Self = this.set("allowCollapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCollapsing: Self = this.set("allowCollapsing", js.undefined)
    @scala.inline
    def setAutoExpandAll(value: Boolean): Self = this.set("autoExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoExpandAll: Self = this.set("autoExpandAll", js.undefined)
    @scala.inline
    def setContextMenuEnabled(value: Boolean): Self = this.set("contextMenuEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuEnabled: Self = this.set("contextMenuEnabled", js.undefined)
    @scala.inline
    def setExpandMode(value: buttonClick | rowClick): Self = this.set("expandMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandMode: Self = this.set("expandMode", js.undefined)
    @scala.inline
    def setTexts(value: GroupByThisColumn): Self = this.set("texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
  }
  
}

