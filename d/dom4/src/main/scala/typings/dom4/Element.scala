package typings.dom4

import typings.std.HTMLCollection
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends ParentNode {
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  def closest(selectors: String): Element | Null = js.native
  /**
    * Returns true if matching selectors against element’s root yields element, and false otherwise.
    */
  def matches(selectors: String): Boolean = js.native
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
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), children = children.asInstanceOf[js.Any], closest = js.Any.fromFunction1(closest), matches = js.Any.fromFunction1(matches), prepend = js.Any.fromFunction1(prepend))
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClosest(value: String => Element | Null): Self = this.set("closest", js.Any.fromFunction1(value))
    @scala.inline
    def setMatches(value: String => Boolean): Self = this.set("matches", js.Any.fromFunction1(value))
  }
  
}

