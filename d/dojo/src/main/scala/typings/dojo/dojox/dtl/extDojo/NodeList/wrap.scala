package typings.dojo.dojox.dtl.extDojo.NodeList

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Wrap each node in the NodeList with html passed to wrap.
  * html will be cloned if the NodeList has more than one
  * element. Only DOM nodes are cloned, not any attached
  * event handlers.
  *
  * @param html
  */
@js.native
trait wrap extends js.Object {
  def apply(html: String): js.Any = js.native
  def apply(html: HTMLElement): js.Any = js.native
}

