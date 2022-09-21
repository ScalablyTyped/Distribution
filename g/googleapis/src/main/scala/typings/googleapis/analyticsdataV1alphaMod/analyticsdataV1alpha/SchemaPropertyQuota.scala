package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPropertyQuota extends StObject {
  
  /**
    * Standard Analytics Properties can send up to 10 concurrent requests; Analytics 360 Properties can use up to 50 concurrent requests.
    */
  var concurrentRequests: js.UndefOr[SchemaQuotaStatus] = js.undefined
  
  /**
    * Standard Analytics Properties and cloud project pairs can have up to 10 server errors per hour; Analytics 360 Properties and cloud project pairs can have up to 50 server errors per hour.
    */
  var serverErrorsPerProjectPerHour: js.UndefOr[SchemaQuotaStatus] = js.undefined
  
  /**
    * Standard Analytics Properties can use up to 25,000 tokens per day; Analytics 360 Properties can use 250,000 tokens per day. Most requests consume fewer than 10 tokens.
    */
  var tokensPerDay: js.UndefOr[SchemaQuotaStatus] = js.undefined
  
  /**
    * Standard Analytics Properties can use up to 5,000 tokens per hour; Analytics 360 Properties can use 50,000 tokens per hour. An API request consumes a single number of tokens, and that number is deducted from both the hourly and daily quotas.
    */
  var tokensPerHour: js.UndefOr[SchemaQuotaStatus] = js.undefined
}
object SchemaPropertyQuota {
  
  inline def apply(): SchemaPropertyQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyQuota]
  }
  
  extension [Self <: SchemaPropertyQuota](x: Self) {
    
    inline def setConcurrentRequests(value: SchemaQuotaStatus): Self = StObject.set(x, "concurrentRequests", value.asInstanceOf[js.Any])
    
    inline def setConcurrentRequestsUndefined: Self = StObject.set(x, "concurrentRequests", js.undefined)
    
    inline def setServerErrorsPerProjectPerHour(value: SchemaQuotaStatus): Self = StObject.set(x, "serverErrorsPerProjectPerHour", value.asInstanceOf[js.Any])
    
    inline def setServerErrorsPerProjectPerHourUndefined: Self = StObject.set(x, "serverErrorsPerProjectPerHour", js.undefined)
    
    inline def setTokensPerDay(value: SchemaQuotaStatus): Self = StObject.set(x, "tokensPerDay", value.asInstanceOf[js.Any])
    
    inline def setTokensPerDayUndefined: Self = StObject.set(x, "tokensPerDay", js.undefined)
    
    inline def setTokensPerHour(value: SchemaQuotaStatus): Self = StObject.set(x, "tokensPerHour", value.asInstanceOf[js.Any])
    
    inline def setTokensPerHourUndefined: Self = StObject.set(x, "tokensPerHour", js.undefined)
  }
}
