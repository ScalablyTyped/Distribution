package typings
package firebaseLib.firebaseMod.firebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseError extends js.Object {
  var code: java.lang.String
  var message: java.lang.String
  var name: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object FirebaseError {
  @scala.inline
  def apply(
    code: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): FirebaseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FirebaseError]
  }
}

