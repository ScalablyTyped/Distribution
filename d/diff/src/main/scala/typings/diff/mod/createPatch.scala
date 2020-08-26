package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "createPatch")
@js.native
object createPatch extends js.Object {
  def apply(fileName: String, oldStr: String, newStr: String): String = js.native
  def apply(
    fileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: js.UndefOr[scala.Nothing],
    newHeader: js.UndefOr[scala.Nothing],
    options: PatchOptions
  ): String = js.native
  def apply(
    fileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: js.UndefOr[scala.Nothing],
    newHeader: String
  ): String = js.native
  def apply(
    fileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: js.UndefOr[scala.Nothing],
    newHeader: String,
    options: PatchOptions
  ): String = js.native
  def apply(fileName: String, oldStr: String, newStr: String, oldHeader: String): String = js.native
  def apply(
    fileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: js.UndefOr[scala.Nothing],
    options: PatchOptions
  ): String = js.native
  def apply(fileName: String, oldStr: String, newStr: String, oldHeader: String, newHeader: String): String = js.native
  def apply(
    fileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String,
    options: PatchOptions
  ): String = js.native
}

