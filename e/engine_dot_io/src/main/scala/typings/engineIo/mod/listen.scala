package typings.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("engine.io", "listen")
@js.native
object listen extends js.Object {
  def apply(port: Double): Server = js.native
  def apply(port: Double, opts: ServerOptions): Server = js.native
  def apply(port: Double, opts: ServerOptions, fn: js.Function0[Unit]): Server = js.native
}

