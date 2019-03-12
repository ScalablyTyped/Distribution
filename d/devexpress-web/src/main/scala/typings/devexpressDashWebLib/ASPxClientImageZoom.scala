package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxImageZoom object.
  */
trait ASPxClientImageZoom extends ASPxClientControl {
  /**
    * Sets the properties on an image displayed in the image zoom control.
    * @param imageUrl A string value specifying the path to the preview image displayed in the preview image.
    * @param largeImageUrl A string value specifying the path to the preview image displayed in the zoom window and the expand window.
    * @param zoomWindowText A string value specifying the text displayed in the zoom window.
    * @param expandWindowText A string value specifying the text displayed in the expand window.
    * @param alternateText A string value that specifies the alternate text displayed instead of the image.
    */
  def SetImageProperties(
    imageUrl: java.lang.String,
    largeImageUrl: java.lang.String,
    zoomWindowText: java.lang.String,
    expandWindowText: java.lang.String,
    alternateText: java.lang.String
  ): scala.Unit
}

object ASPxClientImageZoom {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetImageProperties: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientImageZoom = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetImageProperties = js.Any.fromFunction5(SetImageProperties), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientImageZoom]
  }
}

