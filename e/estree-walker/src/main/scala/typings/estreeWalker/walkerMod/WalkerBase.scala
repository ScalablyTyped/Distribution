package typings.estreeWalker.walkerMod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("estree-walker/types/walker", "WalkerBase")
@js.native
class WalkerBase () extends js.Object {
  
  var context: WalkerContext = js.native
  
  def remove(parent: js.Any, prop: String, index: Double): Unit = js.native
  
  def replace(parent: js.Any, prop: String, index: Double, node: BaseNode): Unit = js.native
  
  var replacement: BaseNode = js.native
  
  var should_remove: Boolean = js.native
  
  var should_skip: Boolean = js.native
}
