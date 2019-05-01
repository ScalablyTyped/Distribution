package typings
package atFirebaseUtilLib.distSrcErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/errors", "ErrorFactory")
@js.native
class ErrorFactory[ErrorCode /* <: java.lang.String */] protected () extends js.Object {
  def this(service: java.lang.String, serviceName: java.lang.String, errors: ErrorMap[ErrorCode]) = this()
  val errors: js.Any = js.native
  val service: js.Any = js.native
  val serviceName: js.Any = js.native
  def create(code: ErrorCode): FirebaseError = js.native
  def create(code: ErrorCode, data: ErrorData): FirebaseError = js.native
}

