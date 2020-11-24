package typings.focusLock

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/utils/firstFocus", JSImport.Namespace)
@js.native
object firstFocusMod extends js.Object {
  
  def pickFirstFocus(nodes: js.Array[HTMLInputElement]): HTMLInputElement = js.native
  
  def pickFocusable(nodes: js.Array[HTMLInputElement], index: Double): Double = js.native
}
