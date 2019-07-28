package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
trait ASPxClientControlBase extends js.Object {
  /**
    * Occurs on the client side after the control has been initialized.
    */
  var Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]]
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    * Value: The fully-qualified identifier for the control.
    */
  var name: String
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetClientVisible(): Boolean
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  def GetMainElement(): js.Object
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  def GetParentControl(): js.Object
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetVisible(): Boolean
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  def InCallback(): Boolean
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: String): Unit
  /**
    * Specifies whether a control is displayed.
    * @param visible 
    */
  def SetClientVisible(visible: Boolean): Unit
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  def SetVisible(visible: Boolean): Unit
}

object ASPxClientControlBase {
  @scala.inline
  def apply(
    GetClientVisible: () => Boolean,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => Boolean,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetVisible: Boolean => Unit,
    name: String
  ): ASPxClientControlBase = {
    val __obj = js.Dynamic.literal(GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetVisible = js.Any.fromFunction1(SetVisible), name = name)
  
    __obj.asInstanceOf[ASPxClientControlBase]
  }
}

