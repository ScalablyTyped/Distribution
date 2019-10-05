package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "createTwoFilesPatch")
@js.native
object createTwoFilesPatch extends js.Object {
  def apply(oldFileName: String, newFileName: String, oldStr: String, newStr: String): String = js.native
  def apply(oldFileName: String, newFileName: String, oldStr: String, newStr: String, oldHeader: String): String = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String
  ): String = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String,
    options: PatchOptions
  ): String = js.native
}

