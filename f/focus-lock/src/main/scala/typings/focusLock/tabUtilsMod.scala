package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabUtilsMod {
  
  @JSImport("focus-lock/dist/es5/utils/tabUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFocusables(parents: js.Array[HTMLElement]): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusables")(parents.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
  inline def getFocusables(parents: js.Array[HTMLElement], withGuards: Boolean): js.Array[HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusables")(parents.asInstanceOf[js.Any], withGuards.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLInputElement]]
  
  inline def getParentAutofocusables(parent: HTMLElement): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentAutofocusables")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
}
