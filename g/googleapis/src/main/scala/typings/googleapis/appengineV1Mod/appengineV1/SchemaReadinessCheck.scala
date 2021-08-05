package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Readiness checking configuration for VM instances. Unhealthy instances are
  * removed from traffic rotation.
  */
trait SchemaReadinessCheck extends StObject {
  
  /**
    * A maximum time limit on application initialization, measured from moment
    * the application successfully replies to a healthcheck until it is ready
    * to serve traffic.
    */
  var appStartTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.undefined
  
  /**
    * Number of consecutive failed checks required before removing traffic.
    */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Host header to send when performing a HTTP Readiness check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * The request path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Number of consecutive successful checks required before receiving
    * traffic.
    */
  var successThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Time before the check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object SchemaReadinessCheck {
  
  inline def apply(): SchemaReadinessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadinessCheck]
  }
  
  extension [Self <: SchemaReadinessCheck](x: Self) {
    
    inline def setAppStartTimeout(value: String): Self = StObject.set(x, "appStartTimeout", value.asInstanceOf[js.Any])
    
    inline def setAppStartTimeoutUndefined: Self = StObject.set(x, "appStartTimeout", js.undefined)
    
    inline def setCheckInterval(value: String): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
    
    inline def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    inline def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
