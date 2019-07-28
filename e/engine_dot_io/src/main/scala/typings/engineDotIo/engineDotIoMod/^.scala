package typings.engineDotIo.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val protocol: Double = js.native
  def apply(): Server = js.native
  def apply(httpServer: typings.node.netMod.Server): Server = js.native
  def apply(httpServer: typings.node.netMod.Server, opts: ServerOptions): Server = js.native
  def attach(http: typings.node.netMod.Server): Server = js.native
  def attach(http: typings.node.netMod.Server, opts: ServerAttachOptions): Server = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, opts: ServerOptions): Server = js.native
  def listen(port: Double, opts: ServerOptions, fn: js.Function0[Unit]): Server = js.native
}

