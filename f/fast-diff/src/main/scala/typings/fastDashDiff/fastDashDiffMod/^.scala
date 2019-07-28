package typings.fastDashDiff.fastDashDiffMod

import typings.fastDashDiff.fastDashDiffNumbers.`-1`
import typings.fastDashDiff.fastDashDiffNumbers.`0`
import typings.fastDashDiff.fastDashDiffNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DELETE: `-1` = js.native
  val EQUAL: `0` = js.native
  val INSERT: `1` = js.native
  def apply(text1: String, text2: String): js.Array[Diff] = js.native
  def apply(text1: String, text2: String, cursorPos: Double | CursorInfo): js.Array[Diff] = js.native
}

