package typings.devexpressDashWeb

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
  def GetContentHtml(): String
  /**
    * Returns a value specifying whether a panel is enabled.
    */
  def GetEnabled(): Boolean
  /**
    * Sets the HTML content for the panel.
    * @param html A string value that is the HTML code defining the content of the panel.
    */
  def SetContentHtml(html: String): Unit
  /**
    * Sets a value specifying whether the panel is enabled.
    * @param enabled true to enable the panel; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit
}

object ASPxClientPanelBase {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetContentHtml: () => String,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetContentHtml: String => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientPanelBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetContentHtml = js.Any.fromFunction0(GetContentHtml), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContentHtml = js.Any.fromFunction1(SetContentHtml), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientPanelBase]
  }
}

