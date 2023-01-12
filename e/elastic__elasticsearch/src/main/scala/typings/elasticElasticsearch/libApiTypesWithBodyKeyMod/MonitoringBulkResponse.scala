package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringBulkResponse extends StObject {
  
  var error: js.UndefOr[ErrorCause] = js.undefined
  
  var errors: Boolean
  
  var ignored: Boolean
  
  var took: long
}
object MonitoringBulkResponse {
  
  inline def apply(errors: Boolean, ignored: Boolean, took: long): MonitoringBulkResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringBulkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringBulkResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorCause): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
  }
}
