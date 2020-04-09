package typings.foundationSites.FoundationSites

import typings.foundationSites.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://get.foundation/sites/docs/accordion.html#javascript-reference
trait Accordion extends js.Object {
  def destroy(): Unit
  def down($target: JQuery, firstTime: Boolean): Unit
  def toggle($target: JQuery): Unit
  def up($target: JQuery): Unit
}

object Accordion {
  @scala.inline
  def apply(destroy: () => Unit, down: (JQuery, Boolean) => Unit, toggle: JQuery => Unit, up: JQuery => Unit): Accordion = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), down = js.Any.fromFunction2(down), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
  
    __obj.asInstanceOf[Accordion]
  }
}

