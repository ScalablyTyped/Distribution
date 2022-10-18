package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeyboardMod {
  
  @JSImport("@fluentui/utilities/lib/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDirectionalKeyCode(which: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDirectionalKeyCode")(which.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isDirectionalKeyCode(which: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectionalKeyCode")(which.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeDirectionalKeyCode(which: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDirectionalKeyCode")(which.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
