package typings.fsDashExtraDashPromise.fsDashExtraDashPromiseMod

import typings.fsDashExtra.fsDashExtraMod.EnsureOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "ensureDir")
@js.native
object ensureDir extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, options: Double): js.Promise[Unit] = js.native
  def apply(path: String, options: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(path: String, options: EnsureOptions): js.Promise[Unit] = js.native
  def apply(path: String, options: EnsureOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

