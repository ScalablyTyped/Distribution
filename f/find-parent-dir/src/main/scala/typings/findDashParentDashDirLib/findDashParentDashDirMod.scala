package typings
package findDashParentDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-parent-dir", JSImport.Namespace)
@js.native
object findDashParentDashDirMod extends js.Object {
  def apply(
    currentFullPath: java.lang.String,
    clue: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* dir */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def sync(currentFullPath: java.lang.String, clue: java.lang.String): java.lang.String | scala.Null = js.native
}

