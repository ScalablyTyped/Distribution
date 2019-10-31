package typings.fsDashPromise.fsDashPromiseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "emptyDir")
@js.native
object emptyDir extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

@JSImport("fs-promise", "emptydir")
@js.native
object emptydir extends js.Object {
  def apply(dir: String): js.Promise[Unit] = js.native
}

