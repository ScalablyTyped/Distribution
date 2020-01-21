package typings.fsExtraPromise.mod

import typings.bluebird.mod.^
import typings.fsExtra.mod.MoveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "moveAsync")
@js.native
object moveAsync extends js.Object {
  def apply(src: String, dest: String): ^[Unit] = js.native
  def apply(src: String, dest: String, options: MoveOptions): ^[Unit] = js.native
}

