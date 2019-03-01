package typings
package devexpressDashWebLib

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
  var name: java.lang.String
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetClientVisible(): scala.Boolean
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
  def GetVisible(): scala.Boolean
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  def InCallback(): scala.Boolean
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: java.lang.String): scala.Unit
  /**
    * Specifies whether a control is displayed.
    * @param visible 
    */
  def SetClientVisible(visible: scala.Boolean): scala.Unit
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  def SetVisible(visible: scala.Boolean): scala.Unit
}

object ASPxClientControlBase {
  @scala.inline
  def apply(
    GetClientVisible: js.Function0[scala.Boolean],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    name: java.lang.String
  ): ASPxClientControlBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientControlBase]
  }
}

