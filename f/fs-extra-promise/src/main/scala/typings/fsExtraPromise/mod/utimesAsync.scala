package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "utimesAsync")
@js.native
object utimesAsync extends js.Object {
  def apply(path: String, atime: Double, mtime: Double): ^[Unit] = js.native
}

