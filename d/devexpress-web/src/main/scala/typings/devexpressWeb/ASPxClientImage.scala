package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxImage control.
  */
trait ASPxClientImage
  extends StObject
     with ASPxClientImageBase {
  
  /**
    * Returns the URL pointing to the image displayed within the image editor.
    */
  def GetImageUrl(): String
  
  /**
    * Sets the URL which points to the image displayed within the image editor.
    * @param url A string value specifying the URL to the image displayed within the editor.
    */
  def SetImageUrl(url: String): Unit
}
object ASPxClientImage {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientStaticEdit]],
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetImageUrl: () => String,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetImageUrl: String => Unit,
    SetSize: (Double, Double) => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientImage = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Click = Click.asInstanceOf[js.Any], GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetSize = js.Any.fromFunction2(SetSize), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImage]
  }
  
  @scala.inline
  implicit class ASPxClientImageMutableBuilder[Self <: ASPxClientImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetImageUrl(value: () => String): Self = StObject.set(x, "GetImageUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1(value))
  }
}
