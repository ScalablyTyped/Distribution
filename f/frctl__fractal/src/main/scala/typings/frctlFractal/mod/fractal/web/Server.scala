package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.anon.Sync
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal.web.Server")
@js.native
class Server () extends EventEmitter {
  val isSynced: Boolean = js.native
  val port: js.UndefOr[Double] = js.native
  val ports: typings.frctlFractal.anon.Server = js.native
  val url: js.UndefOr[String] = js.native
  val urls: Sync = js.native
  def start(): js.Promise[typings.node.httpMod.Server] = js.native
  def start(sync: Boolean): js.Promise[typings.node.httpMod.Server] = js.native
  def stop(): Unit = js.native
  def use(mount: String, middleware: js.Any): Unit = js.native
}

