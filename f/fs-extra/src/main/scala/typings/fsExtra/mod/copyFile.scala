package typings.fsExtra.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "copyFile")
@js.native
object copyFile extends js.Object {
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, flags: Double): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, flags: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

