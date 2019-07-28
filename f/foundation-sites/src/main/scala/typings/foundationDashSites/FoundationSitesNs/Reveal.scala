package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/reveal.html#javascript-reference
trait Reveal extends js.Object {
  def close(): Unit
  def destroy(): Unit
  def open(): Unit
  def toggle(): Unit
}

object Reveal {
  @scala.inline
  def apply(close: () => Unit, destroy: () => Unit, open: () => Unit, toggle: () => Unit): Reveal = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Reveal]
  }
}

