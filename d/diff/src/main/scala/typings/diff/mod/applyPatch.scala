package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff", "applyPatch")
@js.native
object applyPatch extends js.Object {
  
  def apply(source: String, patch: String): String = js.native
  def apply(source: String, patch: String, options: ApplyPatchOptions): String = js.native
  def apply(source: String, patch: js.Array[ParsedDiff]): String = js.native
  def apply(source: String, patch: js.Array[ParsedDiff], options: ApplyPatchOptions): String = js.native
  def apply(source: String, patch: ParsedDiff): String = js.native
  def apply(source: String, patch: ParsedDiff, options: ApplyPatchOptions): String = js.native
}
