package typings
package didyoumeanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("didyoumean", JSImport.Namespace)
@js.native
object didyoumeanMod extends js.Object {
  var caseSensitive: scala.Boolean = js.native
  var nullResultValue: js.Any = js.native
  var returnFirstMatch: scala.Boolean = js.native
  var returnWinningObject: scala.Boolean = js.native
  var threshold: scala.Double = js.native
  var thresholdAbsolute: scala.Double = js.native
  def apply(str: java.lang.String, list: js.Array[java.lang.String]): java.lang.String | js.Array[java.lang.String] = js.native
  def apply(str: java.lang.String, list: js.Array[java.lang.String], key: java.lang.String): java.lang.String | js.Array[java.lang.String] = js.native
}

