package typings.focusLock

import typings.focusLock.distEs5UtilsIsMod.VisibilityCache
import typings.focusLock.distEs5UtilsTabOrderMod.NodeIndex
import typings.std.Element
import typings.std.HTMLElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsDomutilsMod {
  
  @JSImport("focus-lock/dist/es5/utils/DOMutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains(scope: Element, element: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(scope.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains(scope: ShadowRoot, element: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(scope.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filterAutoFocusable(nodes: js.Array[HTMLElement]): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAutoFocusable")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def filterAutoFocusable(nodes: js.Array[HTMLElement], cache: VisibilityCache): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAutoFocusable")(nodes.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def filterFocusable(nodes: js.Array[HTMLElement], visibilityCache: VisibilityCache): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterFocusable")(nodes.asInstanceOf[js.Any], visibilityCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getAllTabbableNodes(topNodes: js.Array[Element], visibilityCache: VisibilityCache): js.Array[NodeIndex] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllTabbableNodes")(topNodes.asInstanceOf[js.Any], visibilityCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeIndex]]
  
  inline def getTabbableNodes(topNodes: js.Array[Element], visibilityCache: VisibilityCache): js.Array[NodeIndex] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabbableNodes")(topNodes.asInstanceOf[js.Any], visibilityCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeIndex]]
  inline def getTabbableNodes(topNodes: js.Array[Element], visibilityCache: VisibilityCache, withGuards: Boolean): js.Array[NodeIndex] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabbableNodes")(topNodes.asInstanceOf[js.Any], visibilityCache.asInstanceOf[js.Any], withGuards.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeIndex]]
  
  inline def parentAutofocusables(topNode: Element, visibilityCache: VisibilityCache): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("parentAutofocusables")(topNode.asInstanceOf[js.Any], visibilityCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}
