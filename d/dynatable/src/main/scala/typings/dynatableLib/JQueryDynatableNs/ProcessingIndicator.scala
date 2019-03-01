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
    attach: js.Function0[scala.Unit],
    create: js.Function0[dynatableLib.JQuery],
    hide: js.Function0[scala.Unit],
    init: js.Function0[scala.Unit],
    position: js.Function0[dynatableLib.JQuery],
    show: js.Function0[scala.Unit]
  ): ProcessingIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[ProcessingIndicator]
  }
}

