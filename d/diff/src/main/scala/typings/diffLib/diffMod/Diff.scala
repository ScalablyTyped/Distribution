package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "Diff")
@js.native
class Diff () extends js.Object {
  def castInput(value: js.Any): js.Any = js.native
  def diff(oldString: java.lang.String, newString: java.lang.String): js.Array[Change] = js.native
  def diff(
    oldString: java.lang.String,
    newString: java.lang.String,
    options: (ArrayOptions[_, _]) with stdLib.Partial[CallbackOptions]
  ): js.Array[Change] = js.native
  def diff(oldString: java.lang.String, newString: java.lang.String, options: Callback): js.Array[Change] = js.native
  def equals(left: js.Any, right: js.Any): scala.Boolean = js.native
  def extractCommon(
    basePath: BestPath,
    newString: java.lang.String,
    oldString: java.lang.String,
    diagonalPath: scala.Double
  ): scala.Double = js.native
  def join(chars: js.Array[java.lang.String]): java.lang.String = js.native
  def pushComponent(components: js.Array[Change], added: scala.Boolean, removed: scala.Boolean): scala.Unit = js.native
  def removeEmpty(array: js.Array[_]): js.Array[_] = js.native
  def tokenize(value: java.lang.String): js.Any = js.native
}

