package typings.firebase.firebaseMod.firestore

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
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FirestoreError]
  }
}

