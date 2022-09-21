package typings.focusLock

import typings.focusLock.focusLockBooleans.`false`
import typings.focusLock.isMod.VisibilityCache
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentingMod {
  
  @JSImport("focus-lock/dist/es5/utils/parenting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allParentAutofocusables(entries: js.Array[Element], visibilityCache: VisibilityCache): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("allParentAutofocusables")(entries.asInstanceOf[js.Any], visibilityCache.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def getCommonParent(nodeA: Element, nodeB: Element): Element | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("getCommonParent")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Element | `false`]
  
  inline def getTopCommonParent(
    baseActiveElement: js.Array[Element],
    leftEntry: js.Array[Element],
    rightEntries: js.Array[Element]
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopCommonParent")(baseActiveElement.asInstanceOf[js.Any], leftEntry.asInstanceOf[js.Any], rightEntries.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getTopCommonParent(baseActiveElement: js.Array[Element], leftEntry: Element, rightEntries: js.Array[Element]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopCommonParent")(baseActiveElement.asInstanceOf[js.Any], leftEntry.asInstanceOf[js.Any], rightEntries.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getTopCommonParent(baseActiveElement: Element, leftEntry: js.Array[Element], rightEntries: js.Array[Element]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopCommonParent")(baseActiveElement.asInstanceOf[js.Any], leftEntry.asInstanceOf[js.Any], rightEntries.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def getTopCommonParent(baseActiveElement: Element, leftEntry: Element, rightEntries: js.Array[Element]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopCommonParent")(baseActiveElement.asInstanceOf[js.Any], leftEntry.asInstanceOf[js.Any], rightEntries.asInstanceOf[js.Any])).asInstanceOf[Element]
}
