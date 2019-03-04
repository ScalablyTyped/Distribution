package typings
package dom4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends ParentNode {
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  def closest(selectors: java.lang.String): Element | scala.Null
  /**
    * Returns true if matching selectors against element’s root yields element, and false otherwise.
    */
  def matches(selectors: java.lang.String): scala.Boolean
}

object Element {
  @scala.inline
  def apply(
    append: js.Function1[/* repeated */ stdLib.Node | java.lang.String, scala.Unit],
    children: stdLib.HTMLCollection,
    closest: js.Function1[java.lang.String, Element | scala.Null],
    matches: js.Function1[java.lang.String, scala.Boolean],
    prepend: js.Function1[/* repeated */ stdLib.Node | java.lang.String, scala.Unit]
  ): Element = {
    val __obj = js.Dynamic.literal(append = append, children = children, closest = closest, matches = matches, prepend = prepend)
  
    __obj.asInstanceOf[Element]
  }
}

