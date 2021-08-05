package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue extends StObject {
  
  var appEngineHttpQueue: AppEngineHttpQueue
  
  var name: String
  
  var purgeTime: String
  
  var rateLimits: RateLimits
  
  var retryConfig: RetryConfig
  
  var state: String
}
object Queue {
  
  inline def apply(
    appEngineHttpQueue: AppEngineHttpQueue,
    name: String,
    purgeTime: String,
    rateLimits: RateLimits,
    retryConfig: RetryConfig,
    state: String
  ): Queue = {
    val __obj = js.Dynamic.literal(appEngineHttpQueue = appEngineHttpQueue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], purgeTime = purgeTime.asInstanceOf[js.Any], rateLimits = rateLimits.asInstanceOf[js.Any], retryConfig = retryConfig.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  
  extension [Self <: Queue](x: Self) {
    
    inline def setAppEngineHttpQueue(value: AppEngineHttpQueue): Self = StObject.set(x, "appEngineHttpQueue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPurgeTime(value: String): Self = StObject.set(x, "purgeTime", value.asInstanceOf[js.Any])
    
    inline def setRateLimits(value: RateLimits): Self = StObject.set(x, "rateLimits", value.asInstanceOf[js.Any])
    
    inline def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
