package typings.firebasePerformance

import typings.firebasePerformance.distSrcControllersPerfMod.PerformanceController
import typings.firebasePerformance.firebasePerformanceInts.`0`
import typings.firebasePerformance.firebasePerformanceInts.`1`
import typings.firebasePerformance.firebasePerformanceInts.`2`
import typings.firebasePerformance.firebasePerformanceInts.`3`
import typings.firebasePerformance.firebasePerformanceInts.`4`
import typings.firebasePerformance.firebasePerformanceInts.`5`
import typings.firebasePerformance.firebasePerformanceInts.`6`
import typings.firebasePerformance.firebasePerformanceInts.`7`
import typings.firebasePerformance.firebasePerformanceInts.`8`
import typings.firebasePerformance.firebasePerformanceInts.`9`
import typings.std.PerformanceEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResourcesNetworkRequestMod {
  
  @JSImport("@firebase/performance/dist/src/resources/network_request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNetworkRequestEntry(performanceController: PerformanceController, entry: PerformanceEntry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createNetworkRequestEntry")(performanceController.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebasePerformance.firebasePerformanceInts.`0`
    - typings.firebasePerformance.firebasePerformanceInts.`1`
    - typings.firebasePerformance.firebasePerformanceInts.`2`
    - typings.firebasePerformance.firebasePerformanceInts.`3`
    - typings.firebasePerformance.firebasePerformanceInts.`4`
    - typings.firebasePerformance.firebasePerformanceInts.`5`
    - typings.firebasePerformance.firebasePerformanceInts.`6`
    - typings.firebasePerformance.firebasePerformanceInts.`7`
    - typings.firebasePerformance.firebasePerformanceInts.`8`
    - typings.firebasePerformance.firebasePerformanceInts.`9`
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def CONNECT: `9` = 9.asInstanceOf[`9`]
    
    inline def DELETE: `4` = 4.asInstanceOf[`4`]
    
    inline def GET: `1` = 1.asInstanceOf[`1`]
    
    inline def HEAD: `5` = 5.asInstanceOf[`5`]
    
    inline def HTTP_METHOD_UNKNOWN: `0` = 0.asInstanceOf[`0`]
    
    inline def OPTIONS: `7` = 7.asInstanceOf[`7`]
    
    inline def PATCH: `6` = 6.asInstanceOf[`6`]
    
    inline def POST: `3` = 3.asInstanceOf[`3`]
    
    inline def PUT: `2` = 2.asInstanceOf[`2`]
    
    inline def TRACE: `8` = 8.asInstanceOf[`8`]
  }
  
  trait NetworkRequest extends StObject {
    
    var httpMethod: js.UndefOr[HttpMethod] = js.undefined
    
    var httpResponseCode: js.UndefOr[Double] = js.undefined
    
    var performanceController: PerformanceController
    
    var requestPayloadBytes: js.UndefOr[Double] = js.undefined
    
    var responseContentType: js.UndefOr[String] = js.undefined
    
    var responsePayloadBytes: js.UndefOr[Double] = js.undefined
    
    var startTimeUs: js.UndefOr[Double] = js.undefined
    
    var timeToRequestCompletedUs: js.UndefOr[Double] = js.undefined
    
    var timeToResponseCompletedUs: js.UndefOr[Double] = js.undefined
    
    var timeToResponseInitiatedUs: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object NetworkRequest {
    
    inline def apply(performanceController: PerformanceController, url: String): NetworkRequest = {
      val __obj = js.Dynamic.literal(performanceController = performanceController.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkRequest] (val x: Self) extends AnyVal {
      
      inline def setHttpMethod(value: HttpMethod): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      inline def setHttpResponseCode(value: Double): Self = StObject.set(x, "httpResponseCode", value.asInstanceOf[js.Any])
      
      inline def setHttpResponseCodeUndefined: Self = StObject.set(x, "httpResponseCode", js.undefined)
      
      inline def setPerformanceController(value: PerformanceController): Self = StObject.set(x, "performanceController", value.asInstanceOf[js.Any])
      
      inline def setRequestPayloadBytes(value: Double): Self = StObject.set(x, "requestPayloadBytes", value.asInstanceOf[js.Any])
      
      inline def setRequestPayloadBytesUndefined: Self = StObject.set(x, "requestPayloadBytes", js.undefined)
      
      inline def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
      
      inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
      
      inline def setResponsePayloadBytes(value: Double): Self = StObject.set(x, "responsePayloadBytes", value.asInstanceOf[js.Any])
      
      inline def setResponsePayloadBytesUndefined: Self = StObject.set(x, "responsePayloadBytes", js.undefined)
      
      inline def setStartTimeUs(value: Double): Self = StObject.set(x, "startTimeUs", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUsUndefined: Self = StObject.set(x, "startTimeUs", js.undefined)
      
      inline def setTimeToRequestCompletedUs(value: Double): Self = StObject.set(x, "timeToRequestCompletedUs", value.asInstanceOf[js.Any])
      
      inline def setTimeToRequestCompletedUsUndefined: Self = StObject.set(x, "timeToRequestCompletedUs", js.undefined)
      
      inline def setTimeToResponseCompletedUs(value: Double): Self = StObject.set(x, "timeToResponseCompletedUs", value.asInstanceOf[js.Any])
      
      inline def setTimeToResponseCompletedUsUndefined: Self = StObject.set(x, "timeToResponseCompletedUs", js.undefined)
      
      inline def setTimeToResponseInitiatedUs(value: Double): Self = StObject.set(x, "timeToResponseInitiatedUs", value.asInstanceOf[js.Any])
      
      inline def setTimeToResponseInitiatedUsUndefined: Self = StObject.set(x, "timeToResponseInitiatedUs", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
