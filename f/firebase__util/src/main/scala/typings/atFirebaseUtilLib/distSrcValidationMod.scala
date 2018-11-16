package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/validation", JSImport.Namespace)
@js.native
object distSrcValidationMod extends js.Object {
  val validateArgCount: js.Function4[
    /* fnName */ js.Any, 
    /* minCount */ js.Any, 
    /* maxCount */ js.Any, 
    /* argCount */ js.Any, 
    scala.Unit
  ] = js.native
  def errorPrefix(fnName: js.Any, argumentNumber: js.Any, optional: js.Any): java.lang.String = js.native
  def validateCallback(fnName: js.Any, argumentNumber: js.Any, callback: js.Any, optional: js.Any): scala.Unit = js.native
  def validateContextObject(fnName: js.Any, argumentNumber: js.Any, context: js.Any, optional: js.Any): scala.Unit = js.native
  def validateNamespace(fnName: js.Any, argumentNumber: js.Any, namespace: js.Any, optional: js.Any): scala.Unit = js.native
}

