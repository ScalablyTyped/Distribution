package typings.focusLock

import typings.focusLock.anon.Node
import typings.focusLock.tabOrderMod.NodeIndex
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusMergeMod {
  
  @JSImport("focus-lock/dist/es5/focusMerge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFocusMerge(topNode: js.Array[HTMLElement]): js.UndefOr[NodeIndex | Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NodeIndex | Node]]
  @scala.inline
  def getFocusMerge(topNode: js.Array[HTMLElement], lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeIndex | Node]]
  @scala.inline
  def getFocusMerge(topNode: HTMLElement): js.UndefOr[NodeIndex | Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NodeIndex | Node]]
  @scala.inline
  def getFocusMerge(topNode: HTMLElement, lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeIndex | Node]]
}
