package typings.dom4

import typings.std.HTMLCollection
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends ParentNode {
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  def closest(selectors: String): Element | Null
  /**
    * Returns true if matching selectors against element’s root yields element, and false otherwise.
    */
  def matches(selectors: String): Boolean
}

object Element {
  @scala.inline
  def apply(
    append: /* repeated */ Node | String => Unit,
    children: HTMLCollection,
    closest: String => Element | Null,
    matches: String => Boolean,
    prepend: /* repeated */ Node | String => Unit
  ): Element = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), children = children, closest = js.Any.fromFunction1(closest), matches = js.Any.fromFunction1(matches), prepend = js.Any.fromFunction1(prepend))
  
    __obj.asInstanceOf[Element]
  }
}

