package typings.fbjs

import typings.fbjs.anon.X
import typings.jsdom.mod.DOMWindow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getScrollPositionMod {
  
  inline def apply(scrollable: DOMWindow): X = ^.asInstanceOf[js.Dynamic].apply(scrollable.asInstanceOf[js.Any]).asInstanceOf[X]
  /**
    * Gets the scroll position of the supplied element or window.
    *
    * The return values are bounded. This means that if the scroll position is
    * negative or exceeds the element boundaries (which is possible using inertial
    * scrolling), you will get zero or the maximum scroll position, respectively.
    *
    * If you need the unbound scroll position, use `getUnboundedScrollPosition`.
    */
  inline def apply(scrollable: HTMLElement): X = ^.asInstanceOf[js.Dynamic].apply(scrollable.asInstanceOf[js.Any]).asInstanceOf[X]
  
  @JSImport("fbjs/lib/getScrollPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
