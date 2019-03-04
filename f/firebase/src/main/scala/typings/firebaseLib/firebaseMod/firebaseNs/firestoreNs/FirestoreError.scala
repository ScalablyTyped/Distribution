package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreError extends js.Object {
  var code: FirestoreErrorCode
  var message: java.lang.String
  var name: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object FirestoreError {
  @scala.inline
  def apply(
    code: FirestoreErrorCode,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): FirestoreError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FirestoreError]
  }
}

