package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/utils/is", JSImport.Namespace)
@js.native
object isMod extends js.Object {
  
  def isDefined[T](): /* is T */ Boolean = js.native
  def isDefined[T](x: T): /* is T */ Boolean = js.native
  
  def isGuard(node: HTMLElement): Boolean = js.native
  
  def isNotAGuard(node: HTMLElement): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  def isVisible(node: HTMLElement): Boolean = js.native
  
  def notHiddenInput(node: HTMLInputElement): Boolean = js.native
}
