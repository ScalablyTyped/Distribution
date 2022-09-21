package typings.focusLock

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getActiveElementMod {
  
  @JSImport("focus-lock/dist/es5/utils/getActiveElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveElement(): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[js.UndefOr[HTMLElement]]
}
