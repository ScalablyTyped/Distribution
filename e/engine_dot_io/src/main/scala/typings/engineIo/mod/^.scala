package typings.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("engine.io", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): Server = js.native
  def apply(httpServer: js.UndefOr[scala.Nothing], opts: ServerOptions): Server = js.native
  def apply(httpServer: typings.node.netMod.Server): Server = js.native
  def apply(httpServer: typings.node.netMod.Server, opts: ServerOptions): Server = js.native
}
