package typings.fbjs

import typings.jsdom.mod.DOMWindow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCsscoreMod {
  
  @JSImport("fbjs/lib/CSSCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds the class passed in to the element if it doesn't already have it.
    */
  inline def addClass(element: HTMLElement, className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  /**
    * Helper to add or remove a class from an element based on a condition.
    */
  inline def conditionClass(element: HTMLElement, className: String, condition: Boolean): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("conditionClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def hasClass(element: DOMWindow, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Tests whether the element has the class specified.
    */
  inline def hasClass(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchesSelector(element: DOMWindow, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesSelector")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  /**
    * Tests whether the element matches the selector specified
    */
  inline def matchesSelector(element: HTMLElement, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchesSelector")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Removes the class passed in from the element
    */
  inline def removeClass(element: HTMLElement, className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
