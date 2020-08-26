package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's Document Map.
  */
@js.native
trait ASPxClientReportDocumentMap extends ASPxClientControl {
  /**
    * Occurs after the content of the Document Viewer's document map is updated.
    */
  var ContentChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientReportDocumentMap]] = js.native
}

object ASPxClientReportDocumentMap {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    ContentChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientReportDocumentMap]],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientReportDocumentMap = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), ContentChanged = ContentChanged.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDocumentMap]
  }
  @scala.inline
  implicit class ASPxClientReportDocumentMapOps[Self <: ASPxClientReportDocumentMap] (val x: Self) extends AnyVal {
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
    def setContentChanged(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientReportDocumentMap]]): Self = this.set("ContentChanged", value.asInstanceOf[js.Any])
  }
  
}

