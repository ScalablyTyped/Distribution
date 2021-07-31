package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLFrameElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setFocusMod {
  
  @JSImport("focus-lock/dist/es5/setFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def focusOn(target: HTMLFrameElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def focusOn(target: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusOn")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setFocus(topNode: HTMLElement, lastNode: HTMLInputElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setFocus")(topNode.asInstanceOf[js.Any], lastNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
