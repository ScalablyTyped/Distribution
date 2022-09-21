package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHealthCheck extends StObject {
  
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to explicitly disable health checks for this instance.
    */
  var disableHealthCheck: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Number of consecutive successful health checks required before receiving traffic.
    */
  var healthyThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Host header to send when performing an HTTP health check. Example: "myapp.appspot.com"
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of consecutive failed health checks required before an instance is restarted.
    */
  var restartThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time before the health check is considered failed.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of consecutive failed health checks required before removing traffic.
    */
  var unhealthyThreshold: js.UndefOr[Double | Null] = js.undefined
}
object SchemaHealthCheck {
  
  inline def apply(): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheck]
  }
  
  extension [Self <: SchemaHealthCheck](x: Self) {
    
    inline def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckIntervalNull: Self = StObject.set(x, "checkInterval", null)
    
    inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    inline def setDisableHealthCheck(value: Boolean): Self = StObject.set(x, "disableHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setDisableHealthCheckNull: Self = StObject.set(x, "disableHealthCheck", null)
    
    inline def setDisableHealthCheckUndefined: Self = StObject.set(x, "disableHealthCheck", js.undefined)
    
    inline def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setHealthyThresholdNull: Self = StObject.set(x, "healthyThreshold", null)
    
    inline def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setRestartThreshold(value: Double): Self = StObject.set(x, "restartThreshold", value.asInstanceOf[js.Any])
    
    inline def setRestartThresholdNull: Self = StObject.set(x, "restartThreshold", null)
    
    inline def setRestartThresholdUndefined: Self = StObject.set(x, "restartThreshold", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdNull: Self = StObject.set(x, "unhealthyThreshold", null)
    
    inline def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
