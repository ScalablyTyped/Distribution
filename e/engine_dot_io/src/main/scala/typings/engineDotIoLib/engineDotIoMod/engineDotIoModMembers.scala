package typings
package engineDotIoLib.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io", JSImport.Namespace)
@js.native
object engineDotIoModMembers extends js.Object {
  val protocol: scala.Double = js.native
  def apply(): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
  def apply(httpServer: nodeLib.netMod.Server): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
  def apply(httpServer: nodeLib.netMod.Server, opts: engineDotIoLib.engineDotIoMod.engineNs.ServerOptions): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
  def attach(http: nodeLib.netMod.Server): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
  def attach(http: nodeLib.netMod.Server, opts: engineDotIoLib.engineDotIoMod.engineNs.ServerAttachOptions): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
  def listen(port: scala.Double): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
  def listen(port: scala.Double, opts: engineDotIoLib.engineDotIoMod.engineNs.ServerOptions): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
  def listen(
    port: scala.Double,
    opts: engineDotIoLib.engineDotIoMod.engineNs.ServerOptions,
    fn: js.Function0[scala.Unit]
  ): engineDotIoLib.engineDotIoMod.engineNs.Server = js.native
}

