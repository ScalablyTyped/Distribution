package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's Document Map.
  */
trait ASPxClientReportDocumentMap extends ASPxClientControl {
  /**
    * Occurs after the content of the Document Viewer's document map is updated.
    */
  var ContentChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientReportDocumentMap]]
}

object ASPxClientReportDocumentMap {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    ContentChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientReportDocumentMap]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientReportDocumentMap = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, ContentChanged = ContentChanged, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientReportDocumentMap]
  }
}

