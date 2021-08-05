package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryConfig extends StObject {
  
  var maxAttempts: Double
  
  var maxBackoff: String
  
  var maxDoublings: Double
  
  var maxRetryDuration: String
  
  var minBackoff: String
}
object RetryConfig {
  
  inline def apply(
    maxAttempts: Double,
    maxBackoff: String,
    maxDoublings: Double,
    maxRetryDuration: String,
    minBackoff: String
  ): RetryConfig = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], maxBackoff = maxBackoff.asInstanceOf[js.Any], maxDoublings = maxDoublings.asInstanceOf[js.Any], maxRetryDuration = maxRetryDuration.asInstanceOf[js.Any], minBackoff = minBackoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
  
  extension [Self <: RetryConfig](x: Self) {
    
    inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxBackoff(value: String): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
    
    inline def setMaxDoublings(value: Double): Self = StObject.set(x, "maxDoublings", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryDuration(value: String): Self = StObject.set(x, "maxRetryDuration", value.asInstanceOf[js.Any])
    
    inline def setMinBackoff(value: String): Self = StObject.set(x, "minBackoff", value.asInstanceOf[js.Any])
  }
}
