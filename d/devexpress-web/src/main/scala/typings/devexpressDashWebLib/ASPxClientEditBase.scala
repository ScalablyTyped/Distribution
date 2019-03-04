package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base object for all the editors included in the client-side object model.
  */
trait ASPxClientEditBase extends ASPxClientControl {
  /**
    * Returns the text displayed in the editor caption.
    */
  def GetCaption(): java.lang.String
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the editor's value.
    */
  def GetValue(): js.Object
  /**
    * Specifies the text displayed in the editor caption.
    * @param caption A string value specifying the editor caption.
    */
  def SetCaption(caption: java.lang.String): scala.Unit
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; otherwise, false.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  def SetValue(value: js.Object): scala.Unit
}

object ASPxClientEditBase {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientEditBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetHeight = SetHeight, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientEditBase]
  }
}

