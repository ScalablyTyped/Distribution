package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientHintStatic extends ASPxClientControlStatic {
  /**
    * Hides a hint window.
    * @param targetElementOrHintElement An object that is the target element or hint element.
    */
  def Hide(targetElementOrHintElement: js.Object): Unit = js.native
  /**
    * Hides a hint window.
    * @param targetSelector A string value that is the CSS selector.
    */
  def Hide(targetSelector: String): Unit = js.native
  /**
    * Hides all hints.
    */
  def HideAll(): Unit = js.native
  /**
    * Registers a hint's functionality with the specified settings.
    * @param targetSelector A string value that is the CSS selector. Specifies to which UI elements the hint is displayed.
    * @param contentAttribute A string value that is the attribute name. Specifies from which target element's attribute a hint obtains its content.
    */
  def Register(targetSelector: String, contentAttribute: String): ASPxClientHint = js.native
  /**
    * Registers a hint's functionality with the specified settings.
    * @param targetSelector A string value that is the CSS selector. Specifies for which UI elements the hint is displayed.
    * @param onShowing An ASPxClientHintShowingEventHandler object that is a handler for the displayed event.
    */
  def Register(targetSelector: String, onShowing: ASPxClientHintShowingEventHandler): ASPxClientHint = js.native
  /**
    * Registers a hint's functionality with the specified settings.
    * @param targetSelector A string value that is the CSS selector. Specifies to which UI elements the hint is displayed.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Register(targetSelector: String, options: ASPxClientHintOptions): ASPxClientHint = js.native
  /**
    * Invokes a hint.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(options: ASPxClientHintOptions): Unit = js.native
  /**
    * Invokes a hint.
    * @param targetElement A HTML DOM element near to which the hint is displayed in response to user interaction.
    * @param content A string value that is the hint's content.
    */
  def Show(targetElement: js.Object, content: String): Unit = js.native
  /**
    * Invokes a hint.
    * @param targetElement An object that is the target element.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(targetElement: js.Object, options: ASPxClientHintOptions): Unit = js.native
  /**
    * Invokes a hint.
    * @param targetSelector A string value that is the CSS selector used to specify for which UI elements on a web page a hint is displayed.
    * @param content A string value that is the hint's content.
    */
  def Show(targetSelector: String, content: String): Unit = js.native
  /**
    * Invokes a hint.
    * @param targetSelector A string value that is the CSS selector.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(targetSelector: String, options: ASPxClientHintOptions): Unit = js.native
  /**
    * Forces the hint to reselect target UI elements according to the specified CSS selector.
    */
  def Update(): Unit = js.native
  /**
    * Forces the hint to recalculate its position.
    */
  def UpdatePosition(): Unit = js.native
  /**
    * Forces the hint to recalculate its position.
    * @param hintElementOrTargetElement An object that is the hint element or the target element.
    */
  def UpdatePosition(hintElementOrTargetElement: js.Object): Unit = js.native
}

