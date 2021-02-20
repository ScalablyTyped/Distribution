package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setFocusMod {
  
  @JSImport("focus-lock/dist/es5/setFocus", "focusOn")
  @js.native
  def focusOn(target: HTMLFrameElement): Unit = js.native
  @JSImport("focus-lock/dist/es5/setFocus", "focusOn")
  @js.native
  def focusOn(target: HTMLInputElement): Unit = js.native
  
  @JSImport("focus-lock/dist/es5/setFocus", "setFocus")
  @js.native
  def setFocus(topNode: HTMLElement, lastNode: HTMLInputElement): Unit = js.native
}
