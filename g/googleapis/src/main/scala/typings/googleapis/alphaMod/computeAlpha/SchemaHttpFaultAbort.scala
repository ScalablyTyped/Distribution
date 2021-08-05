package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification for how requests are aborted as part of fault injection.
  */
trait SchemaHttpFaultAbort extends StObject {
  
  /**
    * The HTTP status code used to abort the request. The value must be between
    * 200 and 599 inclusive.
    */
  var httpStatus: js.UndefOr[Double] = js.undefined
  
  /**
    * The percentage of traffic (connections/operations/requests) which will be
    * aborted as part of fault injection. The value must be between 0.0 and
    * 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.undefined
}
object SchemaHttpFaultAbort {
  
  inline def apply(): SchemaHttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultAbort]
  }
  
  extension [Self <: SchemaHttpFaultAbort](x: Self) {
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
  }
}
