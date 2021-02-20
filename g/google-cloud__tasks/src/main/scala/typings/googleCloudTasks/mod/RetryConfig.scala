package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryConfig extends StObject {
  
  var maxAttempts: Double = js.native
  
  var maxBackoff: String = js.native
  
  var maxDoublings: Double = js.native
  
  var maxRetryDuration: String = js.native
  
  var minBackoff: String = js.native
}
object RetryConfig {
  
  @scala.inline
  def apply(
    maxAttempts: Double,
    maxBackoff: String,
    maxDoublings: Double,
    maxRetryDuration: String,
    minBackoff: String
  ): RetryConfig = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], maxBackoff = maxBackoff.asInstanceOf[js.Any], maxDoublings = maxDoublings.asInstanceOf[js.Any], maxRetryDuration = maxRetryDuration.asInstanceOf[js.Any], minBackoff = minBackoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
  
  @scala.inline
  implicit class RetryConfigMutableBuilder[Self <: RetryConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBackoff(value: String): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDoublings(value: Double): Self = StObject.set(x, "maxDoublings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetryDuration(value: String): Self = StObject.set(x, "maxRetryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBackoff(value: String): Self = StObject.set(x, "minBackoff", value.asInstanceOf[js.Any])
  }
}
