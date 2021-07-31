package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
trait ASPxClientControlBase extends StObject {
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetClientVisible(): Boolean
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  def GetMainElement(): js.Any
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  def GetParentControl(): js.Any
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  def InCallback(): Boolean
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  var Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]]
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: String): Unit
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  def SetClientVisible(visible: Boolean): Unit
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  def SetVisible(visible: Boolean): Unit
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  var name: String
}
object ASPxClientControlBase {
  
  @scala.inline
  def apply(
    GetClientVisible: () => Boolean,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetVisible: Boolean => Unit,
    name: String
  ): ASPxClientControlBase = {
    val __obj = js.Dynamic.literal(GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetVisible = js.Any.fromFunction1(SetVisible), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlBase]
  }
  
  @scala.inline
  implicit class ASPxClientControlBaseMutableBuilder[Self <: ASPxClientControlBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClientVisible(value: () => Boolean): Self = StObject.set(x, "GetClientVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMainElement(value: () => js.Any): Self = StObject.set(x, "GetMainElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentControl(value: () => js.Any): Self = StObject.set(x, "GetParentControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInCallback(value: () => Boolean): Self = StObject.set(x, "InCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]]): Self = StObject.set(x, "Init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessageToAssistiveTechnology(value: String => Unit): Self = StObject.set(x, "SendMessageToAssistiveTechnology", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClientVisible(value: Boolean => Unit): Self = StObject.set(x, "SetClientVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1(value))
  }
}
