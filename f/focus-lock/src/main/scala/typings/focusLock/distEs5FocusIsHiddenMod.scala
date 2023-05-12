package typings.focusLock

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5FocusIsHiddenMod {
  
  @JSImport("focus-lock/dist/es5/focusIsHidden", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def focusIsHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusIsHidden")().asInstanceOf[Boolean]
  inline def focusIsHidden(inDocument: Document): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusIsHidden")(inDocument.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
