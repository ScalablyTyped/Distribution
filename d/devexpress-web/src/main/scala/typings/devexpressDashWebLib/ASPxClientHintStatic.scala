package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientHintStatic extends ASPxClientControlStatic {
  /**
    * Hides a hint window.
    * @param targetElementOrHintElement An object that is the target element or hint element.
    */
  def Hide(targetElementOrHintElement: js.Object): scala.Unit = js.native
  /**
    * Hides a hint window.
    * @param targetSelector A string value that is the CSS selector.
    */
  def Hide(targetSelector: java.lang.String): scala.Unit = js.native
  /**
    * Hides all hints.
    */
  def HideAll(): scala.Unit = js.native
  /**
    * Registers a hint's functionality with the specified settings.
    * @param targetSelector A string value that is the CSS selector. Specifies to which UI elements the hint is displayed.
    * @param contentAttribute A string value that is the attribute name. Specifies from which target element's attribute a hint obtains its content.
    */
  def Register(targetSelector: java.lang.String, contentAttribute: java.lang.String): ASPxClientHint = js.native
  /**
    * Registers a hint's functionality with the specified settings.
    * @param targetSelector A string value that is the CSS selector. Specifies for which UI elements the hint is displayed.
    * @param onShowing An ASPxClientHintShowingEventHandler object that is a handler for the displayed event.
    */
  def Register(targetSelector: java.lang.String, onShowing: ASPxClientHintShowingEventHandler): ASPxClientHint = js.native
  /**
    * Registers a hint's functionality with the specified settings.
    * @param targetSelector A string value that is the CSS selector. Specifies to which UI elements the hint is displayed.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Register(targetSelector: java.lang.String, options: ASPxClientHintOptions): ASPxClientHint = js.native
  /**
    * Invokes a hint.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(options: ASPxClientHintOptions): scala.Unit = js.native
  /**
    * Invokes a hint.
    * @param targetElement A HTML DOM element near to which the hint is displayed in response to user interaction.
    * @param content A string value that is the hint's content.
    */
  def Show(targetElement: js.Object, content: java.lang.String): scala.Unit = js.native
  /**
    * Invokes a hint.
    * @param targetElement An object that is the target element.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(targetElement: js.Object, options: ASPxClientHintOptions): scala.Unit = js.native
  /**
    * Invokes a hint.
    * @param targetSelector A string value that is the CSS selector used to specify for which UI elements on a web page a hint is displayed.
    * @param content A string value that is the hint's content.
    */
  def Show(targetSelector: java.lang.String, content: java.lang.String): scala.Unit = js.native
  /**
    * Invokes a hint.
    * @param targetSelector A string value that is the CSS selector.
    * @param options An ASPxClientHintOptions object that is the hint's options.
    */
  def Show(targetSelector: java.lang.String, options: ASPxClientHintOptions): scala.Unit = js.native
  /**
    * Forces the hint to reselect target UI elements according to the specified CSS selector.
    */
  def Update(): scala.Unit = js.native
  /**
    * Forces the hint to recalculate its position.
    */
  def UpdatePosition(): scala.Unit = js.native
  /**
    * Forces the hint to recalculate its position.
    * @param hintElementOrTargetElement An object that is the hint element or the target element.
    */
  def UpdatePosition(hintElementOrTargetElement: js.Object): scala.Unit = js.native
}

