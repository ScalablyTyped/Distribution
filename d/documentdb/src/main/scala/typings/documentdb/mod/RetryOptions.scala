package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryOptions extends StObject {
  
  /** Fixed retry interval in milliseconds to wait between each retry ignoring the retryAfter returned as part of the response. */
  var FixedRetryIntervalInMilliseconds: js.UndefOr[Double] = js.undefined
  
  /** Max number of retries to be performed for a request. Default value 9. */
  var MaxRetryAttemptCount: js.UndefOr[Double] = js.undefined
  
  /** Max wait time in seconds to wait for a request while the retries are happening. Default value 30 seconds. */
  var MaxWaitTimeInSeconds: js.UndefOr[Double] = js.undefined
}
object RetryOptions {
  
  inline def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  extension [Self <: RetryOptions](x: Self) {
    
    inline def setFixedRetryIntervalInMilliseconds(value: Double): Self = StObject.set(x, "FixedRetryIntervalInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setFixedRetryIntervalInMillisecondsUndefined: Self = StObject.set(x, "FixedRetryIntervalInMilliseconds", js.undefined)
    
    inline def setMaxRetryAttemptCount(value: Double): Self = StObject.set(x, "MaxRetryAttemptCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryAttemptCountUndefined: Self = StObject.set(x, "MaxRetryAttemptCount", js.undefined)
    
    inline def setMaxWaitTimeInSeconds(value: Double): Self = StObject.set(x, "MaxWaitTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitTimeInSecondsUndefined: Self = StObject.set(x, "MaxWaitTimeInSeconds", js.undefined)
  }
}
