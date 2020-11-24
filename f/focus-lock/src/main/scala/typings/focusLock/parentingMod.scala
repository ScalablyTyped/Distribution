package typings.focusLock

import typings.focusLock.focusLockBooleans.`false`
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/utils/parenting", JSImport.Namespace)
@js.native
object parentingMod extends js.Object {
  
  def allParentAutofocusables(entries: js.Array[HTMLElement]): js.Array[HTMLInputElement] = js.native
  
  def getCommonParent(nodeA: HTMLElement, nodeB: HTMLElement): `false` | HTMLElement = js.native
  
  def getTopCommonParent(
    baseActiveElement: HTMLElement,
    leftEntry: js.Array[HTMLElement],
    rightEntries: js.Array[HTMLElement]
  ): HTMLElement = js.native
  def getTopCommonParent(baseActiveElement: HTMLElement, leftEntry: HTMLElement, rightEntries: js.Array[HTMLElement]): HTMLElement = js.native
}
