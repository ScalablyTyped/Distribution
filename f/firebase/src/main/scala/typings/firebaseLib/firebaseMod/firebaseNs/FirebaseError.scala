package typings
package firebaseLib.firebaseMod.firebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `FirebaseError` is a subclass of the standard JavaScript `Error` object. In
  * addition to a message string and stack trace, it contains a string code.
  */
trait FirebaseError extends js.Object {
  /**
    * Error codes are strings using the following format: `"service/string-code"`.
    * Some examples include `"app/no-app"` and `"auth/user-not-found"`.
    *
    * While the message for a given error can change, the code will remain the same
    * between backward-compatible versions of the Firebase SDK.
    */
  var code: java.lang.String
  /**
    * An explanatory message for the error that just occurred.
    *
    * This message is designed to be helpful to you, the developer. It is not
    * intended to be displayed to the end user of your application (as it will
    * generally not convey meaningful information to them).
    */
  var message: java.lang.String
  /**
    * The name of the class of errors, namely `"FirebaseError"`.
    */
  var name: java.lang.String
  /**
    * A string value containing the execution backtrace when the error originally
    * occurred. This may not always be available.
    *
    * This information can be useful to you and can be sent to
    * {@link https://firebase.google.com/support/ Firebase Support} to help
    * explain the cause of an error.
    */
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
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FirebaseError]
  }
}

