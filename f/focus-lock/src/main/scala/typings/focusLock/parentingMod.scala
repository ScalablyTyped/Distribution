package typings.focusLock

import typings.focusLock.focusLockBooleans.`false`
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentingMod {
  
  @JSImport("focus-lock/dist/es5/utils/parenting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allParentAutofocusables(entries: js.Array[HTMLElement]): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("allParentAutofocusables")(entries.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
  
  inline def getCommonParent(nodeA: HTMLElement, nodeB: HTMLElement): `false` | HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommonParent")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[`false` | HTMLElement]
  
  inline def getTopCommonParent(
    baseActiveElement: HTMLElement,
    leftEntry: js.Array[HTMLElement],
    rightEntries: js.Array[HTMLElement]
  ): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopCommonParent")(baseActiveElement.asInstanceOf[js.Any], leftEntry.asInstanceOf[js.Any], rightEntries.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def getTopCommonParent(baseActiveElement: HTMLElement, leftEntry: HTMLElement, rightEntries: js.Array[HTMLElement]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopCommonParent")(baseActiveElement.asInstanceOf[js.Any], leftEntry.asInstanceOf[js.Any], rightEntries.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
