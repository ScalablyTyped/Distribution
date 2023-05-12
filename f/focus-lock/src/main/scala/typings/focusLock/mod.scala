package typings.focusLock

import typings.focusLock.anon.Node
import typings.focusLock.distEs5FocusablesMod.FocusableIn
import typings.focusLock.distEs5SetFocusMod.FocusLockFocusOptions
import typings.focusLock.distEs5SiblingMod.FocusNextOptions
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("focus-lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(topNode: HTMLElement, lastNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(topNode: HTMLElement, lastNode: Element, options: FocusLockFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    
    @JSImport("focus-lock", "constants.FOCUS_NO_AUTOFOCUS")
    @js.native
    val FOCUS_NO_AUTOFOCUS: /* "data-no-autofocus" */ String = js.native
  }
  
  inline def focusInside(topNode: js.Array[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def focusInside(topNode: js.Array[HTMLElement], activeElement: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any], activeElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def focusInside(topNode: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def focusInside(topNode: HTMLElement, activeElement: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any], activeElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def focusIsHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusIsHidden")().asInstanceOf[Boolean]
  inline def focusIsHidden(inDocument: Document): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusIsHidden")(inDocument.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def focusMerge(topNode: js.Array[Element]): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def focusMerge(topNode: js.Array[Element], lastNode: Element): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def focusMerge(topNode: Element): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def focusMerge(topNode: Element, lastNode: Element): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("focusMerge")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def focusNextElement(baseElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusNextElement")(baseElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusNextElement(baseElement: Element, options: FocusNextOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusNextElement")(baseElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def focusPrevElement(baseElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusPrevElement")(baseElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusPrevElement(baseElement: Element, options: FocusNextOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focusPrevElement")(baseElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getActiveElement(): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[js.UndefOr[HTMLElement]]
  inline def getActiveElement(inDocument: Document): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(inDocument.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
  inline def getActiveElement(inDocument: ShadowRoot): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(inDocument.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
  
  inline def getAllAffectedNodes(node: js.Array[Element]): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAffectedNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  inline def getAllAffectedNodes(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAffectedNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def getFocusableIn(topNode: HTMLElement): js.Array[FocusableIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableIn")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[FocusableIn]]
  
  inline def getFocusabledIn(topNode: HTMLElement): js.Array[FocusableIn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusabledIn")(topNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[FocusableIn]]
  
  object tabHook {
    
    @JSImport("focus-lock", "tabHook")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")().asInstanceOf[Unit]
    
    inline def detach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")().asInstanceOf[Unit]
  }
}
