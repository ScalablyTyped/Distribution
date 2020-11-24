package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff", "structuredPatch")
@js.native
object structuredPatch extends js.Object {
  
  def apply(oldFileName: String, newFileName: String, oldStr: String, newStr: String): ParsedDiff = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: js.UndefOr[scala.Nothing],
    newHeader: js.UndefOr[scala.Nothing],
    options: PatchOptions
  ): ParsedDiff = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: js.UndefOr[scala.Nothing],
    newHeader: String
  ): ParsedDiff = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: js.UndefOr[scala.Nothing],
    newHeader: String,
    options: PatchOptions
  ): ParsedDiff = js.native
  def apply(oldFileName: String, newFileName: String, oldStr: String, newStr: String, oldHeader: String): ParsedDiff = js.native
  def apply(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: js.UndefOr[scala.Nothing],
    options: PatchOptions
  ): ParsedDiff = js.native
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
