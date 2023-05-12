package typings.focusLock

import typings.std.Document
import typings.std.HTMLElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsGetActiveElementMod {
  
  @JSImport("focus-lock/dist/es5/utils/getActiveElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveElement(): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[js.UndefOr[HTMLElement]]
  inline def getActiveElement(inDocument: Document): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(inDocument.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
  inline def getActiveElement(inDocument: ShadowRoot): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(inDocument.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
}
