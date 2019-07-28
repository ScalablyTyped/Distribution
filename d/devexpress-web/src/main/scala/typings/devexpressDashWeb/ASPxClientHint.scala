package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint control.
  */
@js.native
trait ASPxClientHint extends ASPxClientControl {
  /**
    * Occurs on the client side when a hint is about to be hidden.
    */
  var Hiding: ASPxClientEvent[ASPxClientHintHidingEventHandler] = js.native
  /**
    * Occurs on the client side when a hint is about to be shown.
    */
  var Showing: ASPxClientEvent[ASPxClientHintShowingEventHandler] = js.native
  /**
    * Invokes a hint.
    * @param targetElement A HTML DOM element near to which the hint is displayed in response to user interaction.
    */
  def Show(targetElement: js.Object): ASPxClientHintWindow = js.native
  /**
    * Invokes a hint.
    * @param targetSelector A string value that is the CSS selector used to specify for which UI elements on a web page a hint is displayed.
    */
  def Show(targetSelector: String): ASPxClientHintWindow = js.native
}

