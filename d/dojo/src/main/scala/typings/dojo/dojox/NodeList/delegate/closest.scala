package typings.dojo.dojox.NodeList.delegate

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns closest parent that matches query, including current node in this
  * dojo/NodeList if it matches the query.
  * .end() can be used on the returned dojo/NodeList to get back to the
  * original dojo/NodeList.
  *
  * @param query a CSS selector.
  * @param root               OptionalIf specified, query is relative to "root" rather than document body.
  */
@js.native
trait closest extends js.Object {
  def apply(query: String, root: String): js.Any = js.native
  def apply(query: String, root: HTMLElement): js.Any = js.native
}

