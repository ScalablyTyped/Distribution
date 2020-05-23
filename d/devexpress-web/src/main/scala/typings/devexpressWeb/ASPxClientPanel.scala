package typings.devexpressWeb

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
  def Collapse(): Unit
  /**
    * Expands the collapsed panel.
    */
  def Expand(): Unit
  /**
    * Returns a value specifying whether the panel can be expanded.
    */
  def IsExpandable(): Boolean
  /**
    * Returns a value specifying whether the panel is expanded.
    */
  def IsExpanded(): Boolean
  /**
    * Expands or collapses the client panel.
    */
  def Toggle(): Unit
}

object ASPxClientPanel {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Collapse: () => Unit,
    Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    Expand: () => Unit,
    Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    GetClientVisible: () => Boolean,
    GetContentHtml: () => String,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsExpandable: () => Boolean,
    IsExpanded: () => Boolean,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetContentHtml: String => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Toggle: () => Unit,
    name: String
  ): ASPxClientPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Collapse = js.Any.fromFunction0(Collapse), Collapsed = Collapsed.asInstanceOf[js.Any], Expand = js.Any.fromFunction0(Expand), Expanded = Expanded.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetContentHtml = js.Any.fromFunction0(GetContentHtml), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsExpandable = js.Any.fromFunction0(IsExpandable), IsExpanded = js.Any.fromFunction0(IsExpanded), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContentHtml = js.Any.fromFunction1(SetContentHtml), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Toggle = js.Any.fromFunction0(Toggle), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPanel]
  }
}

