package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxPivotCustomizationControl control.
  */
trait ASPxClientPivotCustomization extends ASPxClientControl {
  /**
    * Returns an HTML element that represents the root of the control's hierarchy.
    */
  def GetMainContainer(): js.Object
  /**
    * Returns a client-side equivalent of the owner Pivot Grid Control.
    */
  def GetPivotGrid(): ASPxClientPivotGrid
  /**
    * Specifies the Customization Control's layout.
    * @param layout A string that specifies the Customization Control's layout.
    */
  def SetLayout(layout: java.lang.String): scala.Unit
  /**
    * Recalculates the Customization Control height.
    */
  def UpdateHeight(): scala.Unit
}

object ASPxClientPivotCustomization {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainContainer: js.Function0[js.Object],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetPivotGrid: js.Function0[ASPxClientPivotGrid],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetLayout: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    UpdateHeight: js.Function0[scala.Unit],
    name: java.lang.String
  ): ASPxClientPivotCustomization = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainContainer = GetMainContainer, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetPivotGrid = GetPivotGrid, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetLayout = SetLayout, SetVisible = SetVisible, SetWidth = SetWidth, UpdateHeight = UpdateHeight, name = name)
  
    __obj.asInstanceOf[ASPxClientPivotCustomization]
  }
}

