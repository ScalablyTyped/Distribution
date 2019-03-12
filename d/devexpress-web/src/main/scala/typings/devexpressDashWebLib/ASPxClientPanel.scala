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
    AdjustControl: () => scala.Unit,
    Collapse: () => scala.Unit,
    Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    Expand: () => scala.Unit,
    Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    GetClientVisible: () => scala.Boolean,
    GetContentHtml: () => java.lang.String,
    GetEnabled: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsExpandable: () => scala.Boolean,
    IsExpanded: () => scala.Boolean,
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetContentHtml: java.lang.String => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    Toggle: () => scala.Unit,
    name: java.lang.String
  ): ASPxClientPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Collapse = js.Any.fromFunction0(Collapse), Collapsed = Collapsed, Expand = js.Any.fromFunction0(Expand), Expanded = Expanded, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetContentHtml = js.Any.fromFunction0(GetContentHtml), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, IsExpandable = js.Any.fromFunction0(IsExpandable), IsExpanded = js.Any.fromFunction0(IsExpanded), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContentHtml = js.Any.fromFunction1(SetContentHtml), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Toggle = js.Any.fromFunction0(Toggle), name = name)
  
    __obj.asInstanceOf[ASPxClientPanel]
  }
}

