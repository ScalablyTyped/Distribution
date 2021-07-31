package typings.focusLock

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allAffectedMod {
  
  @JSImport("focus-lock/dist/es5/utils/all-affected", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAllAffectedNodes(node: js.Array[HTMLElement]): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAffectedNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
  @scala.inline
  def getAllAffectedNodes(node: HTMLElement): js.Array[HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAffectedNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLInputElement]]
}
