package typings.fsDashExtra.fsDashExtraMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "createFile")
@js.native
object createFile extends js.Object {
  def apply(file: String): js.Promise[Unit] = js.native
  def apply(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

