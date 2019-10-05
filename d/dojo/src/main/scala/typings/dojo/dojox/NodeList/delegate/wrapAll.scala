package typings.dojo.dojox.NodeList.delegate

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insert html where the first node in this NodeList lives, then place all
  * nodes in this NodeList as the child of the html.
  *
  * @param html
  */
@js.native
trait wrapAll extends js.Object {
  def apply(html: String): js.Any = js.native
  def apply(html: HTMLElement): js.Any = js.native
}

