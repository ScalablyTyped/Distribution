package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "mkdirsAsync")
@js.native
object mkdirsAsync extends js.Object {
  def apply(dir: String): ^[Unit] = js.native
  def apply(dir: String, options: MkdirOptions): ^[Unit] = js.native
}

