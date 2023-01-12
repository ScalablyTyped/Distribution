package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreQueryResponse extends StObject {
  
  var result: js.Array[Any]
}
object DBCoreQueryResponse {
  
  inline def apply(result: js.Array[Any]): DBCoreQueryResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreQueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBCoreQueryResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: js.Array[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
