package typings.firebasePerformance

import typings.firebasePerformance.firebasePerformanceNumbers.`0`
import typings.firebasePerformance.firebasePerformanceNumbers.`1`
import typings.firebasePerformance.firebasePerformanceNumbers.`2`
import typings.firebasePerformance.firebasePerformanceNumbers.`3`
import typings.firebasePerformance.firebasePerformanceNumbers.`4`
import typings.firebasePerformance.firebasePerformanceNumbers.`5`
import typings.firebasePerformance.firebasePerformanceNumbers.`6`
import typings.firebasePerformance.firebasePerformanceNumbers.`7`
import typings.firebasePerformance.firebasePerformanceNumbers.`8`
import typings.firebasePerformance.firebasePerformanceNumbers.`9`
import typings.std.PerformanceEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkRequestMod {
  
  @JSImport("@firebase/performance/dist/src/resources/network_request", "createNetworkRequestEntry")
  @js.native
  def createNetworkRequestEntry(entry: PerformanceEntry): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebasePerformance.firebasePerformanceNumbers.`0`
    - typings.firebasePerformance.firebasePerformanceNumbers.`1`
    - typings.firebasePerformance.firebasePerformanceNumbers.`2`
    - typings.firebasePerformance.firebasePerformanceNumbers.`3`
    - typings.firebasePerformance.firebasePerformanceNumbers.`4`
    - typings.firebasePerformance.firebasePerformanceNumbers.`5`
    - typings.firebasePerformance.firebasePerformanceNumbers.`6`
    - typings.firebasePerformance.firebasePerformanceNumbers.`7`
    - typings.firebasePerformance.firebasePerformanceNumbers.`8`
    - typings.firebasePerformance.firebasePerformanceNumbers.`9`
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def CONNECT: `9` = 9.asInstanceOf[`9`]
    
    @scala.inline
    def DELETE: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def GET: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def HEAD: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def HTTP_METHOD_UNKNOWN: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def OPTIONS: `7` = 7.asInstanceOf[`7`]
    
    @scala.inline
    def PATCH: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def POST: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def PUT: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def TRACE: `8` = 8.asInstanceOf[`8`]
  }
  
  @js.native
  trait NetworkRequest extends StObject {
    
    var httpMethod: js.UndefOr[HttpMethod] = js.native
    
    var httpResponseCode: js.UndefOr[Double] = js.native
    
    var requestPayloadBytes: js.UndefOr[Double] = js.native
    
    var responseContentType: js.UndefOr[String] = js.native
    
    var responsePayloadBytes: js.UndefOr[Double] = js.native
    
    var startTimeUs: js.UndefOr[Double] = js.native
    
    var timeToRequestCompletedUs: js.UndefOr[Double] = js.native
    
    var timeToResponseCompletedUs: js.UndefOr[Double] = js.native
    
    var timeToResponseInitiatedUs: js.UndefOr[Double] = js.native
    
    var url: String = js.native
  }
  object NetworkRequest {
    
    @scala.inline
    def apply(url: String): NetworkRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkRequest]
    }
    
    @scala.inline
    implicit class NetworkRequestMutableBuilder[Self <: NetworkRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpMethod(value: HttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      @scala.inline
      def setHttpResponseCode(value: Double): Self = StObject.set(x, "httpResponseCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpResponseCodeUndefined: Self = StObject.set(x, "httpResponseCode", js.undefined)
      
      @scala.inline
      def setRequestPayloadBytes(value: Double): Self = StObject.set(x, "requestPayloadBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestPayloadBytesUndefined: Self = StObject.set(x, "requestPayloadBytes", js.undefined)
      
      @scala.inline
      def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
      
      @scala.inline
      def setResponsePayloadBytes(value: Double): Self = StObject.set(x, "responsePayloadBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsePayloadBytesUndefined: Self = StObject.set(x, "responsePayloadBytes", js.undefined)
      
      @scala.inline
      def setStartTimeUs(value: Double): Self = StObject.set(x, "startTimeUs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUsUndefined: Self = StObject.set(x, "startTimeUs", js.undefined)
      
      @scala.inline
      def setTimeToRequestCompletedUs(value: Double): Self = StObject.set(x, "timeToRequestCompletedUs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToRequestCompletedUsUndefined: Self = StObject.set(x, "timeToRequestCompletedUs", js.undefined)
      
      @scala.inline
      def setTimeToResponseCompletedUs(value: Double): Self = StObject.set(x, "timeToResponseCompletedUs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToResponseCompletedUsUndefined: Self = StObject.set(x, "timeToResponseCompletedUs", js.undefined)
      
      @scala.inline
      def setTimeToResponseInitiatedUs(value: Double): Self = StObject.set(x, "timeToResponseInitiatedUs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToResponseInitiatedUsUndefined: Self = StObject.set(x, "timeToResponseInitiatedUs", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
