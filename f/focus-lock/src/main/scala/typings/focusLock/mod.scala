package typings.focusLock

import typings.focusLock.anon.Node
import typings.focusLock.focusablesMod.FocusableIn
import typings.focusLock.siblingMod.FocusNextOptions
import typings.focusLock.tabOrderMod.NodeIndex
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(topNode: HTMLElement, lastNode: HTMLInputElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object constants {
    
    @JSImport("focus-lock", "constants.FOCUS_ALLOW")
    @js.native
    val FOCUS_ALLOW: /* "data-no-focus-lock" */ String = js.native
    
    @JSImport("focus-lock", "constants.FOCUS_AUTO")
    @js.native
    val FOCUS_AUTO: /* "data-autofocus-inside" */ String = js.native
    
    @JSImport("focus-lock", "constants.FOCUS_DISABLED")
    @js.native
    val FOCUS_DISABLED: /* "data-focus-lock-disabled" */ String = js.native
    
    @JSImport("focus-lock", "constants.FOCUS_GROUP")
    @js.native
    val FOCUS_GROUP: /* "data-focus-lock" */ String = js.native
  }
  
  @scala.inline
  def focusInside(topNode: js.Array[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def focusInside(topNode: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def focusIsHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusIsHidden")().asInstanceOf[Boolean]
  
  @scala.inline
  def focusMerge(topNode: js.Array[HTMLElement]): js.UndefOr[NodeIndex | Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NodeIndex | Node]]
  @scala.inline
  def focusMerge(topNode: js.Array[HTMLElement], lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeIndex | Node]]
  @scala.inline
  def focusMerge(topNode: HTMLElement): js.UndefOr[NodeIndex | Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NodeIndex | Node]]
  @scala.inline
  def focusMerge(topNode: HTMLElement, lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeIndex | Node]]
  
  @scala.inline
  def focusNextElement(baseElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusNextElement")(baseElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def focusNextElement(baseElement: Element, options: FocusNextOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusNextElement")(baseElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def focusPrevElement(baseElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusPrevElement")(baseElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def focusPrevElement(baseElement: Element, options: FocusNextOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusPrevElement")(baseElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAllAffectedNodes(node: js.Array[HTMLElement]): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAffectedNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
  @scala.inline
  def getAllAffectedNodes(node: HTMLElement): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAffectedNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
  
  @scala.inline
  def getFocusabledIn(topNode: HTMLElement): js.Array[FocusableIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusabledIn")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[FocusableIn]]
  
  object tabHook {
    
    @JSImport("focus-lock", "tabHook")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")().asInstanceOf[Unit]
    
    @scala.inline
    def detach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")().asInstanceOf[Unit]
  }
}
