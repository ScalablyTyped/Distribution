package typings.firebase.mod.firebase.storage

import typings.firebase.mod.firebase.FirebaseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error returned by the Firebase Storage SDK.
  */
@js.native
trait FirebaseStorageError extends FirebaseError {
  
  var serverResponse: String | Null = js.native
}
object FirebaseStorageError {
  
  @scala.inline
  def apply(code: String, message: String, name: String): FirebaseStorageError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseStorageError]
  }
  
  @scala.inline
  implicit class FirebaseStorageErrorOps[Self <: FirebaseStorageError] (val x: Self) extends AnyVal {
    
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
    def setServerResponse(value: String): Self = this.set("serverResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerResponseNull: Self = this.set("serverResponse", null)
  }
}
