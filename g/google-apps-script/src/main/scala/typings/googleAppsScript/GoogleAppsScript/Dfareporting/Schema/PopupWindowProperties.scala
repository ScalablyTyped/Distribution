package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupWindowProperties extends js.Object {
  var dimension: js.UndefOr[Size] = js.native
  var offset: js.UndefOr[OffsetPosition] = js.native
  var positionType: js.UndefOr[String] = js.native
  var showAddressBar: js.UndefOr[Boolean] = js.native
  var showMenuBar: js.UndefOr[Boolean] = js.native
  var showScrollBar: js.UndefOr[Boolean] = js.native
  var showStatusBar: js.UndefOr[Boolean] = js.native
  var showToolBar: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object PopupWindowProperties {
  @scala.inline
  def apply(): PopupWindowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupWindowProperties]
  }
  @scala.inline
  implicit class PopupWindowPropertiesOps[Self <: PopupWindowProperties] (val x: Self) extends AnyVal {
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
    def setDimension(value: Size): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    @scala.inline
    def setOffset(value: OffsetPosition): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPositionType(value: String): Self = this.set("positionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionType: Self = this.set("positionType", js.undefined)
    @scala.inline
    def setShowAddressBar(value: Boolean): Self = this.set("showAddressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAddressBar: Self = this.set("showAddressBar", js.undefined)
    @scala.inline
    def setShowMenuBar(value: Boolean): Self = this.set("showMenuBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMenuBar: Self = this.set("showMenuBar", js.undefined)
    @scala.inline
    def setShowScrollBar(value: Boolean): Self = this.set("showScrollBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowScrollBar: Self = this.set("showScrollBar", js.undefined)
    @scala.inline
    def setShowStatusBar(value: Boolean): Self = this.set("showStatusBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowStatusBar: Self = this.set("showStatusBar", js.undefined)
    @scala.inline
    def setShowToolBar(value: Boolean): Self = this.set("showToolBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolBar: Self = this.set("showToolBar", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

