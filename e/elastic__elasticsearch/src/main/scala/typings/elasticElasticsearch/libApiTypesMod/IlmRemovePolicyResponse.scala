package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmRemovePolicyResponse extends StObject {
  
  var failed_indexes: js.Array[IndexName]
  
  var has_failures: Boolean
}
object IlmRemovePolicyResponse {
  
  inline def apply(failed_indexes: js.Array[IndexName], has_failures: Boolean): IlmRemovePolicyResponse = {
    val __obj = js.Dynamic.literal(failed_indexes = failed_indexes.asInstanceOf[js.Any], has_failures = has_failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmRemovePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmRemovePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setFailed_indexes(value: js.Array[IndexName]): Self = StObject.set(x, "failed_indexes", value.asInstanceOf[js.Any])
    
    inline def setFailed_indexesVarargs(value: IndexName*): Self = StObject.set(x, "failed_indexes", js.Array(value*))
    
    inline def setHas_failures(value: Boolean): Self = StObject.set(x, "has_failures", value.asInstanceOf[js.Any])
  }
}
