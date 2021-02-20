package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Health checking configuration for VM instances. Unhealthy instances are
  * killed and replaced with new instances. Only applicable for instances in
  * App Engine flexible environment.
  */
@js.native
trait SchemaHealthCheck extends StObject {
  
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  
  /**
    * Whether to explicitly disable health checks for this instance.
    */
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of consecutive successful health checks required before receiving
    * traffic.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Host header to send when performing an HTTP health check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Number of consecutive failed health checks required before an instance is
    * restarted.
    */
  var restartThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Time before the health check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
  
  /**
    * Number of consecutive failed health checks required before removing
    * traffic.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}
object SchemaHealthCheck {
  
  @scala.inline
  def apply(): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheck]
  }
  
  @scala.inline
  implicit class SchemaHealthCheckMutableBuilder[Self <: SchemaHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    @scala.inline
    def setDisableHealthCheck(value: Boolean): Self = StObject.set(x, "disableHealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableHealthCheckUndefined: Self = StObject.set(x, "disableHealthCheck", js.undefined)
    
    @scala.inline
    def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setRestartThreshold(value: Double): Self = StObject.set(x, "restartThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartThresholdUndefined: Self = StObject.set(x, "restartThreshold", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
