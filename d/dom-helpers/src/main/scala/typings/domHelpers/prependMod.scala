package typings.domHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prependMod {
  
  @JSImport("dom-helpers/cjs/prepend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Element | Null]
  inline def default(node: Null, parent: Element): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def default(node: Element): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def default(node: Element, parent: Element): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
}
