package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dialog
@js.native
trait DialogSettings extends js.Object {
  var autoOpen: js.UndefOr[Boolean] = js.native
  var closeButtonInHeader: js.UndefOr[Boolean] = js.native
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  //Events
  var closed: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var closing: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dragStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dragStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var locale: js.UndefOr[String] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var opened: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var opening: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var resizeStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var resizeStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var scrollable: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object DialogSettings {
  @scala.inline
  def apply(): DialogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogSettings]
  }
  @scala.inline
  implicit class DialogSettingsOps[Self <: DialogSettings] (val x: Self) extends AnyVal {
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setCloseButtonInHeader(value: Boolean): Self = this.set("closeButtonInHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonInHeader: Self = this.set("closeButtonInHeader", js.undefined)
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    @scala.inline
    def setClosed(value: /* e */ js.Any => _): Self = this.set("closed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setClosing(value: /* e */ js.Any => _): Self = this.set("closing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClosing: Self = this.set("closing", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ js.Any => _): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragStart(value: /* e */ js.Any => _): Self = this.set("dragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setDragStop(value: /* e */ js.Any => _): Self = this.set("dragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInitialized(value: /* e */ js.Any => _): Self = this.set("initialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialized: Self = this.set("initialized", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setOpened(value: /* e */ js.Any => _): Self = this.set("opened", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    @scala.inline
    def setOpening(value: /* e */ js.Any => _): Self = this.set("opening", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpening: Self = this.set("opening", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setResize(value: /* e */ js.Any => _): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizeStart(value: /* e */ js.Any => _): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    @scala.inline
    def setResizeStop(value: /* e */ js.Any => _): Self = this.set("resizeStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeStop: Self = this.set("resizeStop", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

