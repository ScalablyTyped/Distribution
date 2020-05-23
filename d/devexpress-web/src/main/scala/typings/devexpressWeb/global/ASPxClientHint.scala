package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientHintHidingEventHandler
import typings.devexpressWeb.ASPxClientHintShowingEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint control.
  */
@JSGlobal("ASPxClientHint")
@js.native
class ASPxClientHint ()
  extends typings.devexpressWeb.ASPxClientHint {
  /**
    * Occurs on the client side when a hint is about to be hidden.
    */
  /* CompleteClass */
  override var Hiding: typings.devexpressWeb.ASPxClientEvent[ASPxClientHintHidingEventHandler] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Occurs on the client side when a hint is about to be shown.
    */
  /* CompleteClass */
  override var Showing: typings.devexpressWeb.ASPxClientEvent[ASPxClientHintShowingEventHandler] = js.native
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
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
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
}

/* static members */
@JSGlobal("ASPxClientHint")
@js.native
object ASPxClientHint extends js.Object {
  /**
    * Hides a hint window.
    */
  def Hide(targetSelector: String): Unit = js.native
  def Hide(targetSelector: js.Any): Unit = js.native
  /**
    * Hides all hints.
    */
  def HideAll(): Unit = js.native
  def Register(targetSelector: String, options: String): typings.devexpressWeb.ASPxClientHint = js.native
  def Register(
    targetSelector: String,
    options: typings.devexpressWeb.ASPxClientEvent[ASPxClientHintShowingEventHandler]
  ): typings.devexpressWeb.ASPxClientHint = js.native
  /**
    * Registers a hint's functionality with the specified settings. An ASPxClientHint that is the hint.
    * @param targetSelector A string value that is the CSS selector. Specifies to which UI elements the hint is displayed.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Register(targetSelector: String, options: typings.devexpressWeb.ASPxClientHintOptions): typings.devexpressWeb.ASPxClientHint = js.native
  /**
    * Invokes a hint.
    * @param targetSelector A string value that is the CSS selector.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(targetSelector: String): Unit = js.native
  def Show(targetSelector: String, options: String): Unit = js.native
  def Show(targetSelector: String, options: typings.devexpressWeb.ASPxClientHintOptions): Unit = js.native
  def Show(targetSelector: js.Any): Unit = js.native
  def Show(targetSelector: js.Any, options: String): Unit = js.native
  def Show(targetSelector: js.Any, options: typings.devexpressWeb.ASPxClientHintOptions): Unit = js.native
  def Show(targetSelector: typings.devexpressWeb.ASPxClientHintOptions): Unit = js.native
  def Show(targetSelector: typings.devexpressWeb.ASPxClientHintOptions, options: String): Unit = js.native
  def Show(
    targetSelector: typings.devexpressWeb.ASPxClientHintOptions,
    options: typings.devexpressWeb.ASPxClientHintOptions
  ): Unit = js.native
  /**
    * Forces the hint to reselect target UI elements according to the specified CSS selector.
    */
  def Update(): Unit = js.native
  /**
    * Forces the hint to recalculate its position.
    * @param hintElementOrTargetElement An object that is the hint element or the target element.
    */
  def UpdatePosition(): Unit = js.native
  def UpdatePosition(hintElementOrTargetElement: js.Any): Unit = js.native
}

