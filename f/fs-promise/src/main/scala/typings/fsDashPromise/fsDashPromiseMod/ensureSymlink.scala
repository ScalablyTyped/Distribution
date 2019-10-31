package typings.fsDashPromise.fsDashPromiseMod

import typings.fsDashExtra.fsDashExtraMod.SymlinkType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "ensureSymlink")
@js.native
object ensureSymlink extends js.Object {
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

