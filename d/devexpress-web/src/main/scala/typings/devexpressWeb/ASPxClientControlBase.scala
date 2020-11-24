package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
@js.native
trait ASPxClientControlBase extends js.Object {
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  def GetMainElement(): js.Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  def GetParentControl(): js.Any = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetVisible(): Boolean = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  var Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  var name: String = js.native
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
  implicit class ASPxClientControlBaseOps[Self <: ASPxClientControlBase] (val x: Self) extends AnyVal {
    
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
    def setGetClientVisible(value: () => Boolean): Self = this.set("GetClientVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMainElement(value: () => js.Any): Self = this.set("GetMainElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentControl(value: () => js.Any): Self = this.set("GetParentControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInCallback(value: () => Boolean): Self = this.set("InCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]]): Self = this.set("Init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessageToAssistiveTechnology(value: String => Unit): Self = this.set("SendMessageToAssistiveTechnology", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClientVisible(value: Boolean => Unit): Self = this.set("SetClientVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("SetVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
