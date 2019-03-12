package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingIndicator extends js.Object {
  /** Insert the processing indicator inside the page */
  def attach(): scala.Unit
  /**
    * Generate the html markup for the processing indicator
    *
    * @return A jQuery object containing the generated html
    */
  def create(): dynatableLib.JQuery
  /** Hide the processing indicator */
  def hide(): scala.Unit
  /** Set up the processing indicator */
  def init(): scala.Unit
  /**
    * Position the processing indicator at the center
    *
    * @return A jQuery object containing the processing indicator
    */
  def position(): dynatableLib.JQuery
  /** Show the processing indicator */
  def show(): scala.Unit
}

object ProcessingIndicator {
  @scala.inline
  def apply(
    attach: () => scala.Unit,
    create: () => dynatableLib.JQuery,
    hide: () => scala.Unit,
    init: () => scala.Unit,
    position: () => dynatableLib.JQuery,
    show: () => scala.Unit
  ): ProcessingIndicator = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), position = js.Any.fromFunction0(position), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[ProcessingIndicator]
  }
}

