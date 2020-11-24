package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/setFocus", JSImport.Namespace)
@js.native
object setFocusMod extends js.Object {
  
  def focusOn(target: HTMLFrameElement): Unit = js.native
  def focusOn(target: HTMLInputElement): Unit = js.native
  
  def setFocus(topNode: HTMLElement, lastNode: HTMLInputElement): Unit = js.native
}
