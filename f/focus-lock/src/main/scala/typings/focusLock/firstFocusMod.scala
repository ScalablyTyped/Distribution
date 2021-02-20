package typings.focusLock

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firstFocusMod {
  
  @JSImport("focus-lock/dist/es5/utils/firstFocus", "pickFirstFocus")
  @js.native
  def pickFirstFocus(nodes: js.Array[HTMLInputElement]): HTMLInputElement = js.native
  
  @JSImport("focus-lock/dist/es5/utils/firstFocus", "pickFocusable")
  @js.native
  def pickFocusable(nodes: js.Array[HTMLInputElement], index: Double): Double = js.native
}
