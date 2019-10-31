package typings.fsDashPromise.fsDashPromiseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "ensureFile")
@js.native
object ensureFile extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

