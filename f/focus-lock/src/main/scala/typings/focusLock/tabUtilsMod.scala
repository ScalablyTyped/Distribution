package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabUtilsMod {
  
  @JSImport("focus-lock/dist/es5/utils/tabUtils", "getFocusables")
  @js.native
  def getFocusables(parents: js.Array[HTMLElement]): js.Array[HTMLInputElement] = js.native
  @JSImport("focus-lock/dist/es5/utils/tabUtils", "getFocusables")
  @js.native
  def getFocusables(parents: js.Array[HTMLElement], withGuards: Boolean): js.Array[HTMLInputElement] = js.native
  
  @JSImport("focus-lock/dist/es5/utils/tabUtils", "getParentAutofocusables")
  @js.native
  def getParentAutofocusables(parent: HTMLElement): js.Array[HTMLInputElement] = js.native
}
