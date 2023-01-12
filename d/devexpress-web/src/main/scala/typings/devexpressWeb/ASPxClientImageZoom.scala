package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxImageZoom object.
  */
trait ASPxClientImageZoom
  extends StObject
     with ASPxClientControl {
  
  /**
    * Sets the properties on an image displayed in the image zoom control.
    * @param imageUrl A string value specifying the path to the preview image displayed in the preview image.
    * @param largeImageUrl A string value specifying the path to the preview image displayed in the zoom window and the expand window.
    * @param zoomWindowText A string value specifying the text displayed in the zoom window.
    * @param expandWindowText A string value specifying the text displayed in the expand window.
    * @param alternateText A string value that specifies the alternate text displayed instead of the image.
    */
  def SetImageProperties(
    imageUrl: String,
    largeImageUrl: String,
    zoomWindowText: String,
    expandWindowText: String,
    alternateText: String
  ): Unit
}
object ASPxClientImageZoom {
  
  inline def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetImageProperties: (String, String, String, String, String) => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientImageZoom = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetImageProperties = js.Any.fromFunction5(SetImageProperties), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageZoom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientImageZoom] (val x: Self) extends AnyVal {
    
    inline def setSetImageProperties(value: (String, String, String, String, String) => Unit): Self = StObject.set(x, "SetImageProperties", js.Any.fromFunction5(value))
  }
}
