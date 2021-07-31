package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification for fault injection introduced into traffic to test the
  * resiliency of clients to backend service failure. As part of fault
  * injection, when clients send requests to a backend service, delays can be
  * introduced by Loadbalancer on a percentage of requests before sending those
  * request to the backend service. Similarly requests from clients can be
  * aborted by the Loadbalancer for a percentage of requests.
  */
trait SchemaHttpFaultInjection extends StObject {
  
  /**
    * The specification for how client requests are aborted as part of fault
    * injection.
    */
  var abort: js.UndefOr[SchemaHttpFaultAbort] = js.undefined
  
  /**
    * The specification for how client requests are delayed as part of fault
    * injection, before being sent to a backend service.
    */
  var delay: js.UndefOr[SchemaHttpFaultDelay] = js.undefined
}
object SchemaHttpFaultInjection {
  
  @scala.inline
  def apply(): SchemaHttpFaultInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultInjection]
  }
  
  @scala.inline
  implicit class SchemaHttpFaultInjectionMutableBuilder[Self <: SchemaHttpFaultInjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: SchemaHttpFaultAbort): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setDelay(value: SchemaHttpFaultDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
