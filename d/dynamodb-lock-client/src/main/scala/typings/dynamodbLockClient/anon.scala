package typings.dynamodbLockClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delete extends StObject {
    
    def delete(args: Any*): Any
    
    def get(args: Any*): Any
    
    def put(args: Any*): Any
  }
  object Delete {
    
    inline def apply(delete: /* repeated */ Any => Any, get: /* repeated */ Any => Any, put: /* repeated */ Any => Any): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), put = js.Any.fromFunction1(put))
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: /* repeated */ Any => Any): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: /* repeated */ Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setPut(value: /* repeated */ Any => Any): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
    }
  }
}
