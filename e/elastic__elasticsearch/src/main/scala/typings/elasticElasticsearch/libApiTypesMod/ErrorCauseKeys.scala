package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCauseKeys extends StObject {
  
  var caused_by: js.UndefOr[ErrorCause] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var root_cause: js.UndefOr[js.Array[ErrorCause]] = js.undefined
  
  var stack_trace: js.UndefOr[String] = js.undefined
  
  var suppressed: js.UndefOr[js.Array[ErrorCause]] = js.undefined
  
  var `type`: String
}
object ErrorCauseKeys {
  
  inline def apply(`type`: String): ErrorCauseKeys = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCauseKeys]
  }
  
  extension [Self <: ErrorCauseKeys](x: Self) {
    
    inline def setCaused_by(value: ErrorCause): Self = StObject.set(x, "caused_by", value.asInstanceOf[js.Any])
    
    inline def setCaused_byUndefined: Self = StObject.set(x, "caused_by", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRoot_cause(value: js.Array[ErrorCause]): Self = StObject.set(x, "root_cause", value.asInstanceOf[js.Any])
    
    inline def setRoot_causeUndefined: Self = StObject.set(x, "root_cause", js.undefined)
    
    inline def setRoot_causeVarargs(value: ErrorCause*): Self = StObject.set(x, "root_cause", js.Array(value*))
    
    inline def setStack_trace(value: String): Self = StObject.set(x, "stack_trace", value.asInstanceOf[js.Any])
    
    inline def setStack_traceUndefined: Self = StObject.set(x, "stack_trace", js.undefined)
    
    inline def setSuppressed(value: js.Array[ErrorCause]): Self = StObject.set(x, "suppressed", value.asInstanceOf[js.Any])
    
    inline def setSuppressedUndefined: Self = StObject.set(x, "suppressed", js.undefined)
    
    inline def setSuppressedVarargs(value: ErrorCause*): Self = StObject.set(x, "suppressed", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
