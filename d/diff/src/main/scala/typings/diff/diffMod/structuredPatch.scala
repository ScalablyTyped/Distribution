package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "structuredPatch")
@js.native
object structuredPatch extends js.Object {
  def apply(oldFileName: String, newFileName: String, oldStr: String, newStr: String): ParsedDiff = js.native
  def apply(oldFileName: String, newFileName: String, oldStr: String, newStr: String, oldHeader: String): ParsedDiff = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String
  ): ParsedDiff = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String,
    options: PatchOptions
  ): ParsedDiff = js.native
}

