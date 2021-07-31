package typings.focusLock

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firstFocusMod {
  
  @JSImport("focus-lock/dist/es5/utils/firstFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pickFirstFocus(nodes: js.Array[HTMLInputElement]): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("pickFirstFocus")(nodes.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  @scala.inline
  def pickFocusable(nodes: js.Array[HTMLInputElement], index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pickFocusable")(nodes.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
}
