package typings.fluentuiUtilities

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementContainsMod {
  
  @JSImport("@fluentui/utilities/lib/dom/elementContains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elementContains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")().asInstanceOf[Boolean]
  inline def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: Null, child: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
