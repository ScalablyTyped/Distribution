package typings.dom4

import typings.std.HTMLCollection
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element
  extends StObject
     with ParentNode {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setClosest(value: String => Element | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
    
    inline def setMatches(value: String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
  }
}
