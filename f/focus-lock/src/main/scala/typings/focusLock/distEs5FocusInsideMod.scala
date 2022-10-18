package typings.focusLock

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5FocusInsideMod {
  
  @JSImport("focus-lock/dist/es5/focusInside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def focusInside(topNode: js.Array[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def focusInside(topNode: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusInside")(topNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
