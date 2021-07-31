package typings.focusLock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusIsHiddenMod {
  
  @JSImport("focus-lock/dist/es5/focusIsHidden", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def focusIsHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusIsHidden")().asInstanceOf[Boolean]
}
