package typings.fsExtraPromise.mod

import typings.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "opendirSync")
@js.native
object opendirSync extends js.Object {
  def apply(path: String): typings.node.fsMod.Dir = js.native
  def apply(path: String, options: OpenDirOptions): typings.node.fsMod.Dir = js.native
}

