package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("focus-lock/dist/es5/utils/is", "isDefined")
  @js.native
  def isDefined[T](): /* is T */ Boolean = js.native
  @JSImport("focus-lock/dist/es5/utils/is", "isDefined")
  @js.native
  def isDefined[T](x: T): /* is T */ Boolean = js.native
  
  @JSImport("focus-lock/dist/es5/utils/is", "isGuard")
  @js.native
  def isGuard(node: HTMLElement): Boolean = js.native
  
  @JSImport("focus-lock/dist/es5/utils/is", "isNotAGuard")
  @js.native
  def isNotAGuard(node: HTMLElement): Boolean = js.native
  
  @JSImport("focus-lock/dist/es5/utils/is", "isVisible")
  @js.native
  def isVisible(): Boolean = js.native
  @JSImport("focus-lock/dist/es5/utils/is", "isVisible")
  @js.native
  def isVisible(node: HTMLElement): Boolean = js.native
  
  @JSImport("focus-lock/dist/es5/utils/is", "notHiddenInput")
  @js.native
  def notHiddenInput(node: HTMLInputElement): Boolean = js.native
}
