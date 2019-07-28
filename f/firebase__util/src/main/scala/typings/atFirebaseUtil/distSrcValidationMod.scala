package typings.atFirebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/validation", JSImport.Namespace)
@js.native
object distSrcValidationMod extends js.Object {
  def errorPrefix(fnName: String, argumentNumber: Double, optional: Boolean): String = js.native
  def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = js.native
  def validateCallback(fnName: String, argumentNumber: Double, callback: js.Function, optional: Boolean): Unit = js.native
  def validateContextObject(fnName: String, argumentNumber: Double, context: js.Any, optional: Boolean): Unit = js.native
  def validateNamespace(fnName: String, argumentNumber: Double, namespace: String, optional: Boolean): Unit = js.native
}

