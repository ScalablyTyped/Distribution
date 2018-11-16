package typings
package diffLib.diffMod.JsDiffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diff extends js.Object {
  def castInput(value: js.Any): js.Any = js.native
  def diff(oldString: java.lang.String, newString: java.lang.String): js.Array[IDiffResult] = js.native
  def diff(oldString: java.lang.String, newString: java.lang.String, options: IOptions): js.Array[IDiffResult] = js.native
  def equals(left: java.lang.String, right: java.lang.String): scala.Boolean = js.native
  def extractCommon(
    basePath: IBestPath,
    newString: java.lang.String,
    oldString: java.lang.String,
    diagonalPath: scala.Double
  ): scala.Double = js.native
  def join(chars: js.Array[java.lang.String]): java.lang.String = js.native
  def pushComponent(components: js.Array[IDiffResult], added: scala.Boolean, removed: scala.Boolean): scala.Unit = js.native
  def removeEmpty(array: js.Array[_]): js.Array[_] = js.native
  def tokenize(value: java.lang.String): js.Any = js.native
}

