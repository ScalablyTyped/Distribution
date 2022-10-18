package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrResumeFollowRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: IndexName
  
  var max_outstanding_read_requests: js.UndefOr[long] = js.undefined
  
  var max_outstanding_write_requests: js.UndefOr[long] = js.undefined
  
  var max_read_request_operation_count: js.UndefOr[long] = js.undefined
  
  var max_read_request_size: js.UndefOr[String] = js.undefined
  
  var max_retry_delay: js.UndefOr[Duration] = js.undefined
  
  var max_write_buffer_count: js.UndefOr[long] = js.undefined
  
  var max_write_buffer_size: js.UndefOr[String] = js.undefined
  
  var max_write_request_operation_count: js.UndefOr[long] = js.undefined
  
  var max_write_request_size: js.UndefOr[String] = js.undefined
  
  var read_poll_timeout: js.UndefOr[Duration] = js.undefined
}
object CcrResumeFollowRequest {
  
  inline def apply(index: IndexName): CcrResumeFollowRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrResumeFollowRequest]
  }
  
  extension [Self <: CcrResumeFollowRequest](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_read_requests(value: long): Self = StObject.set(x, "max_outstanding_read_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_read_requestsUndefined: Self = StObject.set(x, "max_outstanding_read_requests", js.undefined)
    
    inline def setMax_outstanding_write_requests(value: long): Self = StObject.set(x, "max_outstanding_write_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_write_requestsUndefined: Self = StObject.set(x, "max_outstanding_write_requests", js.undefined)
    
    inline def setMax_read_request_operation_count(value: long): Self = StObject.set(x, "max_read_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_operation_countUndefined: Self = StObject.set(x, "max_read_request_operation_count", js.undefined)
    
    inline def setMax_read_request_size(value: String): Self = StObject.set(x, "max_read_request_size", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_sizeUndefined: Self = StObject.set(x, "max_read_request_size", js.undefined)
    
    inline def setMax_retry_delay(value: Duration): Self = StObject.set(x, "max_retry_delay", value.asInstanceOf[js.Any])
    
    inline def setMax_retry_delayUndefined: Self = StObject.set(x, "max_retry_delay", js.undefined)
    
    inline def setMax_write_buffer_count(value: long): Self = StObject.set(x, "max_write_buffer_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_countUndefined: Self = StObject.set(x, "max_write_buffer_count", js.undefined)
    
    inline def setMax_write_buffer_size(value: String): Self = StObject.set(x, "max_write_buffer_size", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_sizeUndefined: Self = StObject.set(x, "max_write_buffer_size", js.undefined)
    
    inline def setMax_write_request_operation_count(value: long): Self = StObject.set(x, "max_write_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_operation_countUndefined: Self = StObject.set(x, "max_write_request_operation_count", js.undefined)
    
    inline def setMax_write_request_size(value: String): Self = StObject.set(x, "max_write_request_size", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_sizeUndefined: Self = StObject.set(x, "max_write_request_size", js.undefined)
    
    inline def setRead_poll_timeout(value: Duration): Self = StObject.set(x, "read_poll_timeout", value.asInstanceOf[js.Any])
    
    inline def setRead_poll_timeoutUndefined: Self = StObject.set(x, "read_poll_timeout", js.undefined)
  }
}
