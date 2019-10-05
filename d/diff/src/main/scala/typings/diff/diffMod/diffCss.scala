package typings.diff.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "diffCss")
@js.native
object diffCss extends js.Object {
  def apply(oldStr: String, newStr: String): js.Array[Change] = js.native
  def apply(oldStr: String, newStr: String, options: BaseOptions): js.Array[Change] = js.native
  def apply(oldStr: String, newStr: String, options: Callback): Unit = js.native
}

