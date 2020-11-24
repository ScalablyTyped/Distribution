package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/utils/tabUtils", JSImport.Namespace)
@js.native
object tabUtilsMod extends js.Object {
  
  def getFocusables(parents: js.Array[HTMLElement]): js.Array[HTMLInputElement] = js.native
  def getFocusables(parents: js.Array[HTMLElement], withGuards: Boolean): js.Array[HTMLInputElement] = js.native
  
  def getParentAutofocusables(parent: HTMLElement): js.Array[HTMLInputElement] = js.native
}
