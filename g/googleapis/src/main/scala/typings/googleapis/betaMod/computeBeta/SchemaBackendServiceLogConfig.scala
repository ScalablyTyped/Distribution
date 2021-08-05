package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The available logging options for the load balancer traffic served by this
  * backend service.
  */
trait SchemaBackendServiceLogConfig extends StObject {
  
  /**
    * This field denotes whether to enable logging for the load balancer
    * traffic served by this backend service.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field can only be specified if logging is enabled for this backend
    * service. The value of the field must be in [0, 1]. This configures the
    * sampling rate of requests to the load balancer where 1.0 means all logged
    * requests are reported and 0.0 means no logged requests are reported. The
    * default value is 1.0.
    */
  var sampleRate: js.UndefOr[Double] = js.undefined
}
object SchemaBackendServiceLogConfig {
  
  inline def apply(): SchemaBackendServiceLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceLogConfig]
  }
  
  extension [Self <: SchemaBackendServiceLogConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
