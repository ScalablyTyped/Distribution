package typings.firebase.mod.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `FirebaseError` is a subclass of the standard JavaScript `Error` object. In
  * addition to a message string and stack trace, it contains a string code.
  */
@js.native
trait FirebaseError extends js.Object {
  
  /**
    * Error codes are strings using the following format: `"service/string-code"`.
    * Some examples include `"app/no-app"` and `"auth/user-not-found"`.
    *
    * While the message for a given error can change, the code will remain the same
    * between backward-compatible versions of the Firebase SDK.
    */
  var code: String = js.native
  
  /**
    * An explanatory message for the error that just occurred.
    *
    * This message is designed to be helpful to you, the developer. Because
    * it generally does not convey meaningful information to end users,
    * this message should not be displayed in your application.
    */
  var message: String = js.native
  
  /**
    * The name of the class of errors, which is `"FirebaseError"`.
    */
  var name: String = js.native
  
  /**
    * A string value containing the execution backtrace when the error originally
    * occurred. This may not always be available.
    *
    * When it is available, this information can be sent to
    * {@link https://firebase.google.com/support/ Firebase Support} to help
    * explain the cause of an error.
    */
  var stack: js.UndefOr[String] = js.native
}
object FirebaseError {
  
  @scala.inline
  def apply(code: String, message: String, name: String): FirebaseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseError]
  }
  
  @scala.inline
  implicit class FirebaseErrorOps[Self <: FirebaseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
