package typings.dojo.dojox.mobile

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/TransitionEvent.html
  *
  * A class used to trigger view transitions.
  *
  * @param target The DOM node that initiates the transition (for example a ListItem).
  * @param transitionOptions Contains the transition options.
  * @param triggerEvent       OptionalThe event that triggered the transition (for example a touch event on a ListItem).
  */
@JSGlobal("dojox.mobile.TransitionEvent")
@js.native
class TransitionEvent protected () extends js.Object {
  def this(target: HTMLElement, transitionOptions: js.Object) = this()
  def this(target: HTMLElement, transitionOptions: js.Object, triggerEvent: Event) = this()
  /**
    * Dispatches this transition event. Emits a "startTransition" event on the target.
    *
    */
  def dispatch(): Unit = js.native
}

