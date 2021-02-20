package typings.firebase.mod.default.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirestoreError extends StObject {
  
  var code: typings.firebase.mod.firebase.firestore.FirestoreErrorCode = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object FirestoreError {
  
  @scala.inline
  def apply(code: typings.firebase.mod.firebase.firestore.FirestoreErrorCode, message: String, name: String): FirestoreError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirestoreError]
  }
  
  @scala.inline
  implicit class FirestoreErrorMutableBuilder[Self <: FirestoreError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: typings.firebase.mod.firebase.firestore.FirestoreErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
