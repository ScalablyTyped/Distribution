package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxCallbackPanel control.
  */
@JSGlobal("ASPxClientCallbackPanel")
@js.native
class ASPxClientCallbackPanel ()
  extends typings.devexpressWeb.ASPxClientCallbackPanel {
  /**
    * Occurs when the expanded panel is closed.
    */
  /* CompleteClass */
  override var Collapsed: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientPanel]] = js.native
  /**
    * Occurs when an end-user opens the expand panel.
    */
  /* CompleteClass */
  override var Expanded: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientPanel]] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Collapses the expanded panel.
    */
  /* CompleteClass */
  override def Collapse(): Unit = js.native
  /**
    * Expands the collapsed panel.
    */
  /* CompleteClass */
  override def Expand(): Unit = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Returns the HTML code that is the content of the panel.
    */
  /* CompleteClass */
  override def GetContentHtml(): String = js.native
  /**
    * Returns a value specifying whether a panel is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  /**
    * Returns a value specifying whether the panel can be expanded.
    */
  /* CompleteClass */
  override def IsExpandable(): Boolean = js.native
  /**
    * Returns a value specifying whether the panel is expanded.
    */
  /* CompleteClass */
  override def IsExpanded(): Boolean = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Sets the HTML content for the panel.
    * @param html A string value that is the HTML code defining the content of the panel.
    */
  /* CompleteClass */
  override def SetContentHtml(html: String): Unit = js.native
  /**
    * Sets a value specifying whether the panel is enabled.
    * @param enabled true to enable the panel; false to disable it.
    */
  /* CompleteClass */
  override def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  /**
    * Expands or collapses the client panel.
    */
  /* CompleteClass */
  override def Toggle(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientCallbackPanel")
@js.native
object ASPxClientCallbackPanel extends js.Object {
  /**
    * Converts the specified object to the ASPxClientCallbackPanel type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientCallbackPanel = js.native
}

