package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("focus-lock/dist/es5/utils/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def isDefined[T](x: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(x.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  @scala.inline
  def isGuard(node: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuard")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNotAGuard(node: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotAGuard")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")().asInstanceOf[Boolean]
  @scala.inline
  def isVisible(node: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def notHiddenInput(node: HTMLInputElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notHiddenInput")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
