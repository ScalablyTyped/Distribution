package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxPanel control.
  */
trait ASPxClientPanel extends ASPxClientPanelBase {
  /**
    * Occurs when the expanded panel is closed.
    */
  var Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]
  /**
    * Occurs when an end-user opens the expand panel.
    */
  var Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]
  /**
    * Collapses the expanded panel.
    */
  def Collapse(): scala.Unit
  /**
    * Expands the collapsed panel.
    */
  def Expand(): scala.Unit
  /**
    * Returns a value specifying whether the panel can be expanded.
    */
  def IsExpandable(): scala.Boolean
  /**
    * Returns a value specifying whether the panel is expanded.
    */
  def IsExpanded(): scala.Boolean
  /**
    * Expands or collapses the client panel.
    */
  def Toggle(): scala.Unit
}

object ASPxClientPanel {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    Collapse: js.Function0[scala.Unit],
    Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    Expand: js.Function0[scala.Unit],
    Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
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
    IsExpandable: js.Function0[scala.Boolean],
    IsExpanded: js.Function0[scala.Boolean],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetContentHtml: js.Function1[java.lang.String, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Toggle: js.Function0[scala.Unit],
    name: java.lang.String
  ): ASPxClientPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("Collapse")(Collapse)
    __obj.updateDynamic("Collapsed")(Collapsed)
    __obj.updateDynamic("Expand")(Expand)
    __obj.updateDynamic("Expanded")(Expanded)
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
    __obj.updateDynamic("IsExpandable")(IsExpandable)
    __obj.updateDynamic("IsExpanded")(IsExpanded)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetContentHtml")(SetContentHtml)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Toggle")(Toggle)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientPanel]
  }
}

