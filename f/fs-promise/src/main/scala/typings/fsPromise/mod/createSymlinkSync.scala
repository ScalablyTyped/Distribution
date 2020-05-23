package typings.fsPromise.mod

import typings.fsExtra.mod.SymlinkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "createSymlinkSync")
@js.native
object createSymlinkSync extends js.Object {
  def apply(src: String, dest: String, `type`: SymlinkType): Unit = js.native
}

