package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "applyPatches")
@js.native
object applyPatches extends js.Object {
  def apply(patch: String, options: ApplyPatchesOptions): Unit = js.native
  def apply(patch: js.Array[ParsedDiff], options: ApplyPatchesOptions): Unit = js.native
}

