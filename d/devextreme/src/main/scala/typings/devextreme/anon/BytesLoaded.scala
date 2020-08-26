package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import typings.devextreme.mod.global.JQueryEventObject
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BytesLoaded extends js.Object {
  var bytesLoaded: js.UndefOr[Double] = js.native
  var bytesTotal: js.UndefOr[Double] = js.native
  var component: js.UndefOr[dxFileUploader] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  var file: js.UndefOr[typings.std.File] = js.native
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var request: js.UndefOr[XMLHttpRequest] = js.native
  var segmentSize: js.UndefOr[Double] = js.native
}

object BytesLoaded {
  @scala.inline
  def apply(): BytesLoaded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesLoaded]
  }
  @scala.inline
  implicit class BytesLoadedOps[Self <: BytesLoaded] (val x: Self) extends AnyVal {
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
    def setBytesLoaded(value: Double): Self = this.set("bytesLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesLoaded: Self = this.set("bytesLoaded", js.undefined)
    @scala.inline
    def setBytesTotal(value: Double): Self = this.set("bytesTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesTotal: Self = this.set("bytesTotal", js.undefined)
    @scala.inline
    def setComponent(value: dxFileUploader): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setEvent(value: event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setFile(value: typings.std.File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setJQueryEvent(value: JQueryEventObject): Self = this.set("jQueryEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJQueryEvent: Self = this.set("jQueryEvent", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRequest(value: XMLHttpRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setSegmentSize(value: Double): Self = this.set("segmentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentSize: Self = this.set("segmentSize", js.undefined)
  }
  
}

