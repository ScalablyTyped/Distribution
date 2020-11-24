package typings.esm.mod

import typings.esm.anon.PartialOptions
import typings.node.NodeModule
import typings.node.NodeRequire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(mod: NodeModule): NodeRequire = js.native
  def apply(mod: NodeModule, options: PartialOptions): NodeRequire = js.native
}
