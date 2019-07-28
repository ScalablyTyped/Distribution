package typings.findDashParentDashDir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-parent-dir", JSImport.Namespace)
@js.native
object findDashParentDashDirMod extends js.Object {
  def apply(
    currentFullPath: String,
    clue: String,
    cb: js.Function2[/* err */ js.Any, /* dir */ String | Null, Unit]
  ): Unit = js.native
  def sync(currentFullPath: String, clue: String): String | Null = js.native
}

