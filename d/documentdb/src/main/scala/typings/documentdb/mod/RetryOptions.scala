package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryOptions extends StObject {
  
  /** Fixed retry interval in milliseconds to wait between each retry ignoring the retryAfter returned as part of the response. */
  var FixedRetryIntervalInMilliseconds: js.UndefOr[Double] = js.native
  
  /** Max number of retries to be performed for a request. Default value 9. */
  var MaxRetryAttemptCount: js.UndefOr[Double] = js.native
  
  /** Max wait time in seconds to wait for a request while the retries are happening. Default value 30 seconds. */
  var MaxWaitTimeInSeconds: js.UndefOr[Double] = js.native
}
object RetryOptions {
  
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  @scala.inline
  implicit class RetryOptionsMutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedRetryIntervalInMilliseconds(value: Double): Self = StObject.set(x, "FixedRetryIntervalInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRetryIntervalInMillisecondsUndefined: Self = StObject.set(x, "FixedRetryIntervalInMilliseconds", js.undefined)
    
    @scala.inline
    def setMaxRetryAttemptCount(value: Double): Self = StObject.set(x, "MaxRetryAttemptCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetryAttemptCountUndefined: Self = StObject.set(x, "MaxRetryAttemptCount", js.undefined)
    
    @scala.inline
    def setMaxWaitTimeInSeconds(value: Double): Self = StObject.set(x, "MaxWaitTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWaitTimeInSecondsUndefined: Self = StObject.set(x, "MaxWaitTimeInSeconds", js.undefined)
  }
}
