package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: js.Array[Any]
    
    var success: Boolean
  }
  object Errors {
    
    inline def apply(errors: js.Array[Any], success: Boolean): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait Explicit extends StObject {
    
    var explicit: Boolean
    
    var message: String
  }
  object Explicit {
    
    inline def apply(explicit: Boolean, message: String): Explicit = {
      val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Explicit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Explicit] (val x: Self) extends AnyVal {
      
      inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
