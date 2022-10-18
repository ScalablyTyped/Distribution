package typings.focusLock

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5SolverMod {
  
  @JSImport("focus-lock/dist/es5/solver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("focus-lock/dist/es5/solver", "NEW_FOCUS")
  @js.native
  val NEW_FOCUS: /* "NEW_FOCUS" */ String = js.native
  
  inline def newFocus(innerNodes: js.Array[HTMLElement], outerNodes: js.Array[HTMLElement]): js.UndefOr[Double | (/* "NEW_FOCUS" */ String)] = (^.asInstanceOf[js.Dynamic].applyDynamic("newFocus")(innerNodes.asInstanceOf[js.Any], outerNodes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | (/* "NEW_FOCUS" */ String)]]
  inline def newFocus(
    innerNodes: js.Array[HTMLElement],
    outerNodes: js.Array[HTMLElement],
    activeElement: Unit,
    lastNode: HTMLElement
  ): js.UndefOr[Double | (/* "NEW_FOCUS" */ String)] = (^.asInstanceOf[js.Dynamic].applyDynamic("newFocus")(innerNodes.asInstanceOf[js.Any], outerNodes.asInstanceOf[js.Any], activeElement.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | (/* "NEW_FOCUS" */ String)]]
  inline def newFocus(innerNodes: js.Array[HTMLElement], outerNodes: js.Array[HTMLElement], activeElement: HTMLElement): js.UndefOr[Double | (/* "NEW_FOCUS" */ String)] = (^.asInstanceOf[js.Dynamic].applyDynamic("newFocus")(innerNodes.asInstanceOf[js.Any], outerNodes.asInstanceOf[js.Any], activeElement.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | (/* "NEW_FOCUS" */ String)]]
  inline def newFocus(
    innerNodes: js.Array[HTMLElement],
    outerNodes: js.Array[HTMLElement],
    activeElement: HTMLElement,
    lastNode: HTMLElement
  ): js.UndefOr[Double | (/* "NEW_FOCUS" */ String)] = (^.asInstanceOf[js.Dynamic].applyDynamic("newFocus")(innerNodes.asInstanceOf[js.Any], outerNodes.asInstanceOf[js.Any], activeElement.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | (/* "NEW_FOCUS" */ String)]]
}
