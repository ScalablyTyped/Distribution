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
    AdjustControl: js.Function0[scala.Unit],
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
    SetImageProperties: js.Function5[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientImageZoom = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetImageProperties = SetImageProperties, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientImageZoom]
  }
}

