package typings.focusLock

import typings.focusLock.tabOrderMod.NodeIndex
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domutilsMod {
  
  @JSImport("focus-lock/dist/es5/utils/DOMutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterFocusable(nodes: js.Array[HTMLInputElement]): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFocusable")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
  
  @scala.inline
  def getAllTabbableNodes(topNodes: js.Array[HTMLElement]): js.Array[NodeIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTabbableNodes")(topNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[NodeIndex]]
  
  @scala.inline
  def getTabbableNodes(topNodes: js.Array[HTMLElement]): js.Array[NodeIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabbableNodes")(topNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[NodeIndex]]
  @scala.inline
  def getTabbableNodes(topNodes: js.Array[HTMLElement], withGuards: Boolean): js.Array[NodeIndex] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabbableNodes")(topNodes.asInstanceOf[js.Any], withGuards.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeIndex]]
  
  @scala.inline
  def parentAutofocusables(topNode: HTMLElement): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("parentAutofocusables")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
}
