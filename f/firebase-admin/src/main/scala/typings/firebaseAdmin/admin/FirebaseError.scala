package typings.firebaseAdmin.admin

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
    * Some examples include `"auth/invalid-uid"` and
    * `"messaging/invalid-recipient"`.
    *
    * While the message for a given error can change, the code will remain the same
    * between backward-compatible versions of the Firebase SDK.
    */
  var code: String
  /**
    * An explanatory message for the error that just occurred.
    *
    * This message is designed to be helpful to you, the developer. Because
    * it generally does not convey meaningful information to end users,
    * this message should not be displayed in your application.
    */
  var message: String
  /**
    * A string value containing the execution backtrace when the error originally
    * occurred.
    *
    * This information can be useful to you and can be sent to
    * {@link https://firebase.google.com/support/ Firebase Support} to help
    * explain the cause of an error.
    */
  var stack: String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object FirebaseError {
  @scala.inline
  def apply(code: String, message: String, stack: String, toJSON: () => js.Object): FirebaseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[FirebaseError]
  }
}

