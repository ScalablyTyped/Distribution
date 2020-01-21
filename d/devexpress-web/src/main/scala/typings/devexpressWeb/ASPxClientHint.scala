package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint control.
  */
@JSGlobal("ASPxClientHint")
@js.native
class ASPxClientHint () extends ASPxClientControl {
  /**
    * Occurs on the client side when a hint is about to be hidden.
    */
  var Hiding: ASPxClientEvent[ASPxClientHintHidingEventHandler] = js.native
  /**
    * Occurs on the client side when a hint is about to be shown.
    */
  var Showing: ASPxClientEvent[ASPxClientHintShowingEventHandler] = js.native
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
  def Register(targetSelector: String, options: String): ASPxClientHint = js.native
  def Register(targetSelector: String, options: ASPxClientEvent[ASPxClientHintShowingEventHandler]): ASPxClientHint = js.native
  /**
    * Registers a hint's functionality with the specified settings. An ASPxClientHint that is the hint.
    * @param targetSelector A string value that is the CSS selector. Specifies to which UI elements the hint is displayed.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Register(targetSelector: String, options: ASPxClientHintOptions): ASPxClientHint = js.native
  /**
    * Invokes a hint.
    * @param targetSelector A string value that is the CSS selector.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(targetSelector: String): Unit = js.native
  def Show(targetSelector: String, options: String): Unit = js.native
  def Show(targetSelector: String, options: ASPxClientHintOptions): Unit = js.native
  def Show(targetSelector: js.Any): Unit = js.native
  def Show(targetSelector: js.Any, options: String): Unit = js.native
  def Show(targetSelector: js.Any, options: ASPxClientHintOptions): Unit = js.native
  def Show(targetSelector: ASPxClientHintOptions): Unit = js.native
  def Show(targetSelector: ASPxClientHintOptions, options: String): Unit = js.native
  def Show(targetSelector: ASPxClientHintOptions, options: ASPxClientHintOptions): Unit = js.native
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

