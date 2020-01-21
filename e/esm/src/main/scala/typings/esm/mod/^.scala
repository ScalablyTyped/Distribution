package typings.esm.mod

import typings.node.NodeModule
import typings.node.NodeRequire
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(mod: NodeModule): NodeRequire = js.native
  def apply(mod: NodeModule, options: Partial[typings.esm.mod.Options.Options]): NodeRequire = js.native
}

