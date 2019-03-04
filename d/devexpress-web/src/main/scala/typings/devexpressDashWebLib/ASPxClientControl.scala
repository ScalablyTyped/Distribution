package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
trait ASPxClientControl extends ASPxClientControlBase {
  /**
    * Modifies the control's size against the control's container.
    */
  def AdjustControl(): scala.Unit
  /**
    * Returns the control's height.
    */
  def GetHeight(): scala.Double
  /**
    * Returns the control's width.
    */
  def GetWidth(): scala.Double
  /**
    * Specifies the control's height.   Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  def SetHeight(height: scala.Double): scala.Unit
  /**
    * Specifies the control's width.
    * @param width An integer value that specifies the control's width.
    */
  def SetWidth(width: scala.Double): scala.Unit
}

object ASPxClientControl {
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
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientControl]
  }
}

