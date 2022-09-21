package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpFaultInjection extends StObject {
  
  /**
    * The specification for how client requests are aborted as part of fault injection.
    */
  var abort: js.UndefOr[SchemaHttpFaultAbort] = js.undefined
  
  /**
    * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
    */
  var delay: js.UndefOr[SchemaHttpFaultDelay] = js.undefined
}
object SchemaHttpFaultInjection {
  
  inline def apply(): SchemaHttpFaultInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultInjection]
  }
  
  extension [Self <: SchemaHttpFaultInjection](x: Self) {
    
    inline def setAbort(value: SchemaHttpFaultAbort): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setDelay(value: SchemaHttpFaultDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
