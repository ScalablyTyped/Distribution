package typings.dojo.dojox.dtl.ext_dojo.NodeList

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For each node in the NodeList, wrap all its children with the passed in html.
  * html will be cloned if the NodeList has more than one
  * element. Only DOM nodes are cloned, not any attached
  * event handlers.
  *
  * @param html
  */
@js.native
trait wrapInner extends js.Object {
  def apply(html: String): js.Any = js.native
  def apply(html: HTMLElement): js.Any = js.native
}

