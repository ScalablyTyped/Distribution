package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the area that is used within the Html Editor's media dialogs.
  */
trait ASPxClientMediaFileSelector
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns a URL text from the URL text box in Html Editor's media dialogs.
    */
  def GetUrl(): String
  
  /**
    * Sets a URL text in the Html Editor's media dialogs.
    * @param url A string value that is the Url text.
    */
  def SetUrl(url: String): Unit
}
object ASPxClientMediaFileSelector {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetUrl: () => String,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetUrl: String => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientMediaFileSelector = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetUrl = js.Any.fromFunction0(GetUrl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetUrl = js.Any.fromFunction1(SetUrl), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMediaFileSelector]
  }
  
  @scala.inline
  implicit class ASPxClientMediaFileSelectorMutableBuilder[Self <: ASPxClientMediaFileSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUrl(value: () => String): Self = StObject.set(x, "GetUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetUrl(value: String => Unit): Self = StObject.set(x, "SetUrl", js.Any.fromFunction1(value))
  }
}
