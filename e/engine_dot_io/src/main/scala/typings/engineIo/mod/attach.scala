package typings.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io", "attach")
@js.native
object attach extends js.Object {
  def apply(http: typings.node.netMod.Server): Server = js.native
  def apply(http: typings.node.netMod.Server, opts: ServerAttachOptions): Server = js.native
}

