package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientHintShowingEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxHint control.
  */
@JSGlobal("ASPxClientHint")
@js.native
class ASPxClientHint ()
  extends typings.devexpressWeb.ASPxClientHint
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
