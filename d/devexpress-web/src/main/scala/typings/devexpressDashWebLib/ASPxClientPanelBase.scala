package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base class for controls that implement panel functionality.
  */
trait ASPxClientPanelBase extends ASPxClientControl {
  /**
    * Returns the HTML code that is the content of the panel.
    */
  def GetContentHtml(): java.lang.String
  /**
    * Returns a value specifying whether a panel is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Sets the HTML content for the panel.
    * @param html A string value that is the HTML code defining the content of the panel.
    */
  def SetContentHtml(html: java.lang.String): scala.Unit
  /**
    * Sets a value specifying whether the panel is enabled.
    * @param enabled true to enable the panel; false to disable it.
    */
  def SetEnabled(enabled: scala.Boolean): scala.Unit
}

object ASPxClientPanelBase {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetContentHtml: js.Function0[java.lang.String],
    GetEnabled: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetContentHtml: js.Function1[java.lang.String, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientPanelBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetContentHtml")(GetContentHtml)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetContentHtml")(SetContentHtml)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientPanelBase]
  }
}

