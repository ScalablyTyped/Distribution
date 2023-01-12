package typings.firebase.compatMod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirestoreError extends StObject {
  
  var code: FirestoreErrorCode
  
  var message: String
  
  var name: String
  
  var stack: js.UndefOr[String] = js.undefined
}
object FirestoreError {
  
  inline def apply(code: FirestoreErrorCode, message: String, name: String): FirestoreError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirestoreError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirestoreError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: FirestoreErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
