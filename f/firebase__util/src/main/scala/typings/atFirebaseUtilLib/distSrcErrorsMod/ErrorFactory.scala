package typings
package atFirebaseUtilLib.distSrcErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/errors", "ErrorFactory")
@js.native
class ErrorFactory[T /* <: java.lang.String */] protected () extends js.Object {
  def this(service: java.lang.String, serviceName: java.lang.String, errors: ErrorList[T]) = this()
  var errors: js.Any = js.native
  var pattern: stdLib.RegExp = js.native
  var service: js.Any = js.native
  var serviceName: js.Any = js.native
  def create(code: T): FirebaseError = js.native
  def create(code: T, data: ScalablyTyped.runtime.StringDictionary[StringLike]): FirebaseError = js.native
}

