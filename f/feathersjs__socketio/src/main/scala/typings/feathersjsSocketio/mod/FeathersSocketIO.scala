package typings.feathersjsSocketio.mod

import typings.socketIo.mod.Server
import typings.socketIo.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeathersSocketIO extends js.Object {
  val SOCKET_KEY: js.Symbol = js.native
  @JSName("default")
  var default_Original: FeathersSocketIO = js.native
  def apply(): js.Function0[Unit] = js.native
  def apply(callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def apply(options: Double): js.Function0[Unit] = js.native
  def apply(options: Double, callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def apply(options: ServerOptions): js.Function0[Unit] = js.native
  def apply(options: ServerOptions, callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def apply(port: Double, options: js.UndefOr[scala.Nothing], callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def apply(port: Double, options: ServerOptions): js.Function0[Unit] = js.native
  def apply(port: Double, options: ServerOptions, callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def default(): js.Function0[Unit] = js.native
  def default(callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def default(options: Double): js.Function0[Unit] = js.native
  def default(options: Double, callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def default(options: ServerOptions): js.Function0[Unit] = js.native
  def default(options: ServerOptions, callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def default(port: Double, options: js.UndefOr[scala.Nothing], callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
  def default(port: Double, options: ServerOptions): js.Function0[Unit] = js.native
  def default(port: Double, options: ServerOptions, callback: js.Function1[/* io */ Server, Unit]): js.Function0[Unit] = js.native
}

