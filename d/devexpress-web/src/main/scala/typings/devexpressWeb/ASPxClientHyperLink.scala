package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxHyperLink control.
  */
trait ASPxClientHyperLink
  extends StObject
     with ASPxClientStaticEdit {
  
  /**
    * Gets an URL which defines the navigation location for the editor's hyperlink.
    */
  def GetNavigateUrl(): String
  
  /**
    * Gets the text caption displayed for the hyperlink in the hyperlink editor.
    */
  def GetText(): String
  
  /**
    * Specifies an URL which defines the navigation location for the editor's hyperlink.
    * @param url A string value which specifies an URL to where the client web browser will navigate when a hyperlink in the editor is clicked.
    */
  def SetNavigateUrl(url: String): Unit
  
  /**
    * Specifies the text caption displayed for the hyperlink in the hyperlink editor.
    * @param text A string value specifying the text caption for the hyperlink in the editor.
    */
  def SetText(text: String): Unit
}
object ASPxClientHyperLink {
  
  inline def apply(
    AdjustControl: () => Unit,
    Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientStaticEdit]],
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetNavigateUrl: () => String,
    GetParentControl: () => Any,
    GetText: () => String,
    GetValue: () => Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetValue: Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientHyperLink = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Click = Click.asInstanceOf[js.Any], GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetParentControl = js.Any.fromFunction0(GetParentControl), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHyperLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHyperLink] (val x: Self) extends AnyVal {
    
    inline def setGetNavigateUrl(value: () => String): Self = StObject.set(x, "GetNavigateUrl", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    inline def setSetNavigateUrl(value: String => Unit): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "SetText", js.Any.fromFunction1(value))
  }
}
