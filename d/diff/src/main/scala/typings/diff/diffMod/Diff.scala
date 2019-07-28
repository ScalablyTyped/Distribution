package typings.diff.diffMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "Diff")
@js.native
class Diff () extends js.Object {
  def castInput(value: js.Any): js.Any = js.native
  def diff(oldString: String, newString: String): js.Array[Change] = js.native
  def diff(oldString: String, newString: String, options: (ArrayOptions[_, _]) with Partial[CallbackOptions]): js.Array[Change] = js.native
  def diff(oldString: String, newString: String, options: Callback): js.Array[Change] = js.native
  def equals(left: js.Any, right: js.Any): Boolean = js.native
  def extractCommon(basePath: BestPath, newString: String, oldString: String, diagonalPath: Double): Double = js.native
  def join(chars: js.Array[String]): String = js.native
  def pushComponent(components: js.Array[Change], added: Boolean, removed: Boolean): Unit = js.native
  def removeEmpty(array: js.Array[_]): js.Array[_] = js.native
  def tokenize(value: String): js.Any = js.native
}

