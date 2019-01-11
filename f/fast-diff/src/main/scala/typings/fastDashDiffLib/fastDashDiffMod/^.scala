package typings
package fastDashDiffLib.fastDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DELETE: fastDashDiffLib.fastDashDiffLibNumbers.`-1` = js.native
  val EQUAL: fastDashDiffLib.fastDashDiffLibNumbers.`0` = js.native
  val INSERT: fastDashDiffLib.fastDashDiffLibNumbers.`1` = js.native
  def apply(text1: java.lang.String, text2: java.lang.String): js.Array[fastDashDiffLib.fastDashDiffMod.diffNs.Diff] = js.native
  def apply(
    text1: java.lang.String,
    text2: java.lang.String,
    cursorPos: scala.Double | fastDashDiffLib.fastDashDiffMod.diffNs.CursorInfo
  ): js.Array[fastDashDiffLib.fastDashDiffMod.diffNs.Diff] = js.native
}

