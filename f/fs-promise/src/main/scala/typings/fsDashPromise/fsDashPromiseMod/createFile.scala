package typings.fsDashPromise.fsDashPromiseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "createFile")
@js.native
object createFile extends js.Object {
  def apply(file: String): js.Promise[Unit] = js.native
  def apply(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

