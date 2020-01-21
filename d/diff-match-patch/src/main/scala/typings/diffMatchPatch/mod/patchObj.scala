package typings.diffMatchPatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff-match-patch", "patch_obj")
@js.native
class patchObj () extends js.Object {
  var diffs: js.Array[Diff] = js.native
  var length1: Double = js.native
  var length2: Double = js.native
  var start1: Double | Null = js.native
  var start2: Double | Null = js.native
}

