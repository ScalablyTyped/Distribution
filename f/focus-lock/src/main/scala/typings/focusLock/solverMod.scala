package typings.focusLock

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solverMod {
  
  @JSImport("focus-lock/dist/es5/solver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("focus-lock/dist/es5/solver", "NEW_FOCUS")
  @js.native
  val NEW_FOCUS: /* "NEW_FOCUS" */ String = js.native
  
  inline def newFocus(
    innerNodes: js.Array[HTMLInputElement],
    outerNodes: js.Array[HTMLInputElement],
    activeElement: HTMLInputElement
  ): js.UndefOr[Double | typings.focusLock.focusLockStrings.NEW_FOCUS] = (^.asInstanceOf[js.Dynamic].applyDynamic("newFocus")(innerNodes.asInstanceOf[js.Any], outerNodes.asInstanceOf[js.Any], activeElement.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | typings.focusLock.focusLockStrings.NEW_FOCUS]]
  inline def newFocus(
    innerNodes: js.Array[HTMLInputElement],
    outerNodes: js.Array[HTMLInputElement],
    activeElement: HTMLInputElement,
    lastNode: HTMLInputElement
  ): js.UndefOr[Double | typings.focusLock.focusLockStrings.NEW_FOCUS] = (^.asInstanceOf[js.Dynamic].applyDynamic("newFocus")(innerNodes.asInstanceOf[js.Any], outerNodes.asInstanceOf[js.Any], activeElement.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | typings.focusLock.focusLockStrings.NEW_FOCUS]]
}
