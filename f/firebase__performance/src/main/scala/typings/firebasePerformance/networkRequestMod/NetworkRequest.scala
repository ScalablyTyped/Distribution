package typings.firebasePerformance.networkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkRequest extends js.Object {
  
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
  implicit class NetworkRequestOps[Self <: NetworkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethod(value: HttpMethod): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    
    @scala.inline
    def setHttpResponseCode(value: Double): Self = this.set("httpResponseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpResponseCode: Self = this.set("httpResponseCode", js.undefined)
    
    @scala.inline
    def setRequestPayloadBytes(value: Double): Self = this.set("requestPayloadBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPayloadBytes: Self = this.set("requestPayloadBytes", js.undefined)
    
    @scala.inline
    def setResponseContentType(value: String): Self = this.set("responseContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseContentType: Self = this.set("responseContentType", js.undefined)
    
    @scala.inline
    def setResponsePayloadBytes(value: Double): Self = this.set("responsePayloadBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsePayloadBytes: Self = this.set("responsePayloadBytes", js.undefined)
    
    @scala.inline
    def setStartTimeUs(value: Double): Self = this.set("startTimeUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeUs: Self = this.set("startTimeUs", js.undefined)
    
    @scala.inline
    def setTimeToRequestCompletedUs(value: Double): Self = this.set("timeToRequestCompletedUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToRequestCompletedUs: Self = this.set("timeToRequestCompletedUs", js.undefined)
    
    @scala.inline
    def setTimeToResponseCompletedUs(value: Double): Self = this.set("timeToResponseCompletedUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToResponseCompletedUs: Self = this.set("timeToResponseCompletedUs", js.undefined)
    
    @scala.inline
    def setTimeToResponseInitiatedUs(value: Double): Self = this.set("timeToResponseInitiatedUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToResponseInitiatedUs: Self = this.set("timeToResponseInitiatedUs", js.undefined)
  }
}
