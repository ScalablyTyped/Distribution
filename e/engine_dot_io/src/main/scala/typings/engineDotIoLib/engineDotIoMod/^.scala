package typings
package engineDotIoLib.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val protocol: scala.Double = js.native
  def apply(): Server = js.native
  def apply(httpServer: nodeLib.netMod.Server): Server = js.native
  def apply(httpServer: nodeLib.netMod.Server, opts: ServerOptions): Server = js.native
  def attach(http: nodeLib.netMod.Server): Server = js.native
  def attach(http: nodeLib.netMod.Server, opts: ServerAttachOptions): Server = js.native
  def listen(port: scala.Double): Server = js.native
  def listen(port: scala.Double, opts: ServerOptions): Server = js.native
  def listen(port: scala.Double, opts: ServerOptions, fn: js.Function0[scala.Unit]): Server = js.native
}

