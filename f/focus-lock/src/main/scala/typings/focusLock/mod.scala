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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-lock", JSImport.Default)
  @js.native
  def default(topNode: HTMLElement, lastNode: HTMLInputElement): Unit = js.native
  
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
  
  @JSImport("focus-lock", "focusInside")
  @js.native
  def focusInside(topNode: js.Array[HTMLElement]): Boolean = js.native
  @JSImport("focus-lock", "focusInside")
  @js.native
  def focusInside(topNode: HTMLElement): Boolean = js.native
  
  @JSImport("focus-lock", "focusIsHidden")
  @js.native
  def focusIsHidden(): Boolean = js.native
  
  @JSImport("focus-lock", "focusMerge")
  @js.native
  def focusMerge(topNode: js.Array[HTMLElement]): js.UndefOr[NodeIndex | Node] = js.native
  @JSImport("focus-lock", "focusMerge")
  @js.native
  def focusMerge(topNode: js.Array[HTMLElement], lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = js.native
  @JSImport("focus-lock", "focusMerge")
  @js.native
  def focusMerge(topNode: HTMLElement): js.UndefOr[NodeIndex | Node] = js.native
  @JSImport("focus-lock", "focusMerge")
  @js.native
  def focusMerge(topNode: HTMLElement, lastNode: HTMLInputElement): js.UndefOr[NodeIndex | Node] = js.native
  
  @JSImport("focus-lock", "focusNextElement")
  @js.native
  def focusNextElement(baseElement: Element): Unit = js.native
  @JSImport("focus-lock", "focusNextElement")
  @js.native
  def focusNextElement(baseElement: Element, options: FocusNextOptions): Unit = js.native
  
  @JSImport("focus-lock", "focusPrevElement")
  @js.native
  def focusPrevElement(baseElement: Element): Unit = js.native
  @JSImport("focus-lock", "focusPrevElement")
  @js.native
  def focusPrevElement(baseElement: Element, options: FocusNextOptions): Unit = js.native
  
  @JSImport("focus-lock", "getAllAffectedNodes")
  @js.native
  def getAllAffectedNodes(node: js.Array[HTMLElement]): js.Array[HTMLInputElement] = js.native
  @JSImport("focus-lock", "getAllAffectedNodes")
  @js.native
  def getAllAffectedNodes(node: HTMLElement): js.Array[HTMLInputElement] = js.native
  
  @JSImport("focus-lock", "getFocusabledIn")
  @js.native
  def getFocusabledIn(topNode: HTMLElement): js.Array[FocusableIn] = js.native
  
  object tabHook {
    
    @JSImport("focus-lock", "tabHook.attach")
    @js.native
    def attach(): Unit = js.native
    
    @JSImport("focus-lock", "tabHook.detach")
    @js.native
    def detach(): Unit = js.native
  }
}
