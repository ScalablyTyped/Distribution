package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Set up a listener for popstate event on window */
  def init(): scala.Unit
  /**
    * Check if pushState option is true, and if browser supports it
    *
    * @return A boolean
    */
  def initOnLoad(): scala.Boolean
  /**
    * Handler for the popstate event
    *
    * @param event The native popstate event
    */
  def pop(event: stdLib.Event): scala.Unit
  /**
    * Update the URL data using pushState
    *
    * @param data An object with the parameters we want to push
    */
  def push(data: js.Object): scala.Unit
}

object State {
  @scala.inline
  def apply(
    init: js.Function0[scala.Unit],
    initOnLoad: js.Function0[scala.Boolean],
    pop: js.Function1[stdLib.Event, scala.Unit],
    push: js.Function1[js.Object, scala.Unit]
  ): State = {
    val __obj = js.Dynamic.literal(init = init, initOnLoad = initOnLoad, pop = pop, push = push)
  
    __obj.asInstanceOf[State]
  }
}

