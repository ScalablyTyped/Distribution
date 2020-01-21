package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirestoreError extends js.Object {
  var code: FirestoreErrorCode
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
}

object FirestoreError {
  @scala.inline
  def apply(code: FirestoreErrorCode, message: String, name: String, stack: String = null): FirestoreError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirestoreError]
  }
}

