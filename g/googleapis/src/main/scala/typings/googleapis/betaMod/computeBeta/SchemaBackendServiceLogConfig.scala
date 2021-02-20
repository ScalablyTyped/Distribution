package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The available logging options for the load balancer traffic served by this
  * backend service.
  */
@js.native
trait SchemaBackendServiceLogConfig extends StObject {
  
  /**
    * This field denotes whether to enable logging for the load balancer
    * traffic served by this backend service.
    */
  var enable: js.UndefOr[Boolean] = js.native
  
  /**
    * This field can only be specified if logging is enabled for this backend
    * service. The value of the field must be in [0, 1]. This configures the
    * sampling rate of requests to the load balancer where 1.0 means all logged
    * requests are reported and 0.0 means no logged requests are reported. The
    * default value is 1.0.
    */
  var sampleRate: js.UndefOr[Double] = js.native
}
object SchemaBackendServiceLogConfig {
  
  @scala.inline
  def apply(): SchemaBackendServiceLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceLogConfig]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceLogConfigMutableBuilder[Self <: SchemaBackendServiceLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
