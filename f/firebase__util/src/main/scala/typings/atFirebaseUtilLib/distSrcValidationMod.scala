package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/validation", JSImport.Namespace)
@js.native
object distSrcValidationMod extends js.Object {
  def errorPrefix(fnName: java.lang.String, argumentNumber: scala.Double, optional: scala.Boolean): java.lang.String = js.native
  def validateArgCount(fnName: java.lang.String, minCount: scala.Double, maxCount: scala.Double, argCount: scala.Double): scala.Unit = js.native
  def validateCallback(
    fnName: java.lang.String,
    argumentNumber: scala.Double,
    callback: js.Function,
    optional: scala.Boolean
  ): scala.Unit = js.native
  def validateContextObject(fnName: java.lang.String, argumentNumber: scala.Double, context: js.Any, optional: scala.Boolean): scala.Unit = js.native
  def validateNamespace(
    fnName: java.lang.String,
    argumentNumber: scala.Double,
    namespace: java.lang.String,
    optional: scala.Boolean
  ): scala.Unit = js.native
}

