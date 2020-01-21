package typings.didyoumean

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("didyoumean", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var caseSensitive: Boolean = js.native
  var nullResultValue: js.Any = js.native
  var returnFirstMatch: Boolean = js.native
  var returnWinningObject: Boolean = js.native
  var threshold: Double = js.native
  var thresholdAbsolute: Double = js.native
  def apply(str: String, list: js.Array[String]): String | js.Array[String] = js.native
  def apply(str: String, list: js.Array[String], key: String): String | js.Array[String] = js.native
}

