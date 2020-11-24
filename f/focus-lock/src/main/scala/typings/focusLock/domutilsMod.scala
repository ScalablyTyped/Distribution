package typings.focusLock

import typings.focusLock.tabOrderMod.NodeIndex
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/utils/DOMutils", JSImport.Namespace)
@js.native
object domutilsMod extends js.Object {
  
  def filterFocusable(nodes: js.Array[HTMLInputElement]): js.Array[HTMLInputElement] = js.native
  
  def getAllTabbableNodes(topNodes: js.Array[HTMLElement]): js.Array[NodeIndex] = js.native
  
  def getTabbableNodes(topNodes: js.Array[HTMLElement]): js.Array[NodeIndex] = js.native
  def getTabbableNodes(topNodes: js.Array[HTMLElement], withGuards: Boolean): js.Array[NodeIndex] = js.native
  
  def parentAutofocusables(topNode: HTMLElement): js.Array[HTMLInputElement] = js.native
}
