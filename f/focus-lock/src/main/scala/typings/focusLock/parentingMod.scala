package typings.focusLock

import typings.focusLock.focusLockBooleans.`false`
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentingMod {
  
  @JSImport("focus-lock/dist/es5/utils/parenting", "allParentAutofocusables")
  @js.native
  def allParentAutofocusables(entries: js.Array[HTMLElement]): js.Array[HTMLInputElement] = js.native
  
  @JSImport("focus-lock/dist/es5/utils/parenting", "getCommonParent")
  @js.native
  def getCommonParent(nodeA: HTMLElement, nodeB: HTMLElement): `false` | HTMLElement = js.native
  
  @JSImport("focus-lock/dist/es5/utils/parenting", "getTopCommonParent")
  @js.native
  def getTopCommonParent(
    baseActiveElement: HTMLElement,
    leftEntry: js.Array[HTMLElement],
    rightEntries: js.Array[HTMLElement]
  ): HTMLElement = js.native
  @JSImport("focus-lock/dist/es5/utils/parenting", "getTopCommonParent")
  @js.native
  def getTopCommonParent(baseActiveElement: HTMLElement, leftEntry: HTMLElement, rightEntries: js.Array[HTMLElement]): HTMLElement = js.native
}
