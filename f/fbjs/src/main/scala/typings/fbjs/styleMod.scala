package typings.fbjs

import typings.jsdom.mod.DOMWindow
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  @JSImport("fbjs/lib/Style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the style property for the supplied node. This will return either the
    * computed style, if available, or the declared style.
    */
  inline def get(node: HTMLElement, name: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  
  /**
    * Determines the nearest ancestor of a node that is scrollable.
    *
    * NOTE: This can be expensive if used repeatedly or on a node nested deeply.
    */
  inline def getScrollParent(node: Node): HTMLElement | DOMWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollParent")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | DOMWindow]
}
