package typings.focusLock.tabOrderMod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-lock/dist/es5/utils/tabOrder", "orderByTabIndex")
@js.native
object orderByTabIndex extends js.Object {
  
  def apply(nodes: js.Array[HTMLInputElement], filterNegative: Boolean): js.Array[NodeIndex] = js.native
  def apply(nodes: js.Array[HTMLInputElement], filterNegative: Boolean, keepGuards: Boolean): js.Array[NodeIndex] = js.native
}
