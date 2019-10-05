package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "diffWordsWithSpace")
@js.native
object diffWordsWithSpace extends js.Object {
  def apply(oldStr: String, newStr: String): js.Array[Change] = js.native
  def apply(oldStr: String, newStr: String, options: Callback): Unit = js.native
  def apply(oldStr: String, newStr: String, options: WordsOptions): js.Array[Change] = js.native
}

