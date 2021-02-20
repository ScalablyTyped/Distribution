package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Health checking configuration for VM instances. Unhealthy instances are
  * killed and replaced with new instances.
  */
@js.native
trait SchemaLivenessCheck extends StObject {
  
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  
  /**
    * Number of consecutive failed checks required before considering the VM
    * unhealthy.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Host header to send when performing a HTTP Liveness check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * The initial delay before starting to execute the checks.
    */
  var initialDelay: js.UndefOr[String] = js.native
  
  /**
    * The request path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Number of consecutive successful checks required before considering the
    * VM healthy.
    */
  var successThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Time before the check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
}
object SchemaLivenessCheck {
  
  @scala.inline
  def apply(): SchemaLivenessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivenessCheck]
  }
  
  @scala.inline
  implicit class SchemaLivenessCheckMutableBuilder[Self <: SchemaLivenessCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInitialDelay(value: String): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
