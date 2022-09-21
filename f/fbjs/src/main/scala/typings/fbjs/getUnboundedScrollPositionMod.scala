package typings.fbjs

import typings.fbjs.anon.X
import typings.jsdom.mod.DOMWindow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getUnboundedScrollPositionMod {
  
  inline def apply(scrollable: DOMWindow): X = ^.asInstanceOf[js.Dynamic].apply(scrollable.asInstanceOf[js.Any]).asInstanceOf[X]
  /**
    * Gets the scroll position of the supplied element or window.
    *
    * The return values are unbounded, unlike `getScrollPosition`. This means they
    * may be negative or exceed the element boundaries (which is possible using
    * inertial scrolling).
    */
  inline def apply(scrollable: HTMLElement): X = ^.asInstanceOf[js.Dynamic].apply(scrollable.asInstanceOf[js.Any]).asInstanceOf[X]
  
  @JSImport("fbjs/lib/getUnboundedScrollPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
