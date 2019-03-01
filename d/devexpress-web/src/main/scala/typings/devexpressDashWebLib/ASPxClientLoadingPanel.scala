package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxLoadingPanel control.
  */
trait ASPxClientLoadingPanel extends ASPxClientControl {
  /**
    * Gets the text displayed within the ASPxLoadingPanel.
    */
  def GetText(): java.lang.String
  /**
    * Hides the loading panel.
    */
  def Hide(): scala.Unit
  /**
    * Sets the text to be displayed within the ASPxLoadingPanel.
    * @param text A string value specifying the text to be displayed within the ASPxLoadingPanel.
    */
  def SetText(text: java.lang.String): scala.Unit
  /**
    * Invokes the loading panel.
    */
  def Show(): scala.Unit
  /**
    * Invokes the loading panel at the specified position.
    * @param x An integer value specifying the x-coordinate of the loading panel's display position.
    * @param y An integer value specifying the y-coordinate of the loaidng panel's display position.
    */
  def ShowAtPos(x: scala.Double, y: scala.Double): scala.Unit
  /**
    * Invokes the loading panel, displaying it over the specified HTML element.
    * @param htmlElement An object that specifies the required HTML element.
    */
  def ShowInElement(htmlElement: js.Object): scala.Unit
  /**
    * Invokes the loading panel, displaying it over the specified element.
    * @param id A string that specifies the required element's identifier.
    */
  def ShowInElementByID(id: java.lang.String): scala.Unit
}

object ASPxClientLoadingPanel {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    Hide: js.Function0[scala.Unit],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Show: js.Function0[scala.Unit],
    ShowAtPos: js.Function2[scala.Double, scala.Double, scala.Unit],
    ShowInElement: js.Function1[js.Object, scala.Unit],
    ShowInElementByID: js.Function1[java.lang.String, scala.Unit],
    name: java.lang.String
  ): ASPxClientLoadingPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("Hide")(Hide)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Show")(Show)
    __obj.updateDynamic("ShowAtPos")(ShowAtPos)
    __obj.updateDynamic("ShowInElement")(ShowInElement)
    __obj.updateDynamic("ShowInElementByID")(ShowInElementByID)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientLoadingPanel]
  }
}

