package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeStatistics extends StObject {
  
  var failed: integer
  
  var failures: js.UndefOr[js.Array[ErrorCause]] = js.undefined
  
  var successful: integer
  
  var total: integer
}
object NodeStatistics {
  
  inline def apply(failed: integer, successful: integer, total: integer): NodeStatistics = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeStatistics] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: integer): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailures(value: js.Array[ErrorCause]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: ErrorCause*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setSuccessful(value: integer): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
