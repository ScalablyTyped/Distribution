package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpFaultAbort extends StObject {
  
  /**
    * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
    */
  var httpStatus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double | Null] = js.undefined
}
object SchemaHttpFaultAbort {
  
  inline def apply(): SchemaHttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultAbort]
  }
  
  extension [Self <: SchemaHttpFaultAbort](x: Self) {
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusNull: Self = StObject.set(x, "httpStatus", null)
    
    inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageNull: Self = StObject.set(x, "percentage", null)
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
