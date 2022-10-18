package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxoutstandingreadrequests extends StObject {
  
  var max_outstanding_read_requests: js.UndefOr[long] = js.undefined
  
  var max_outstanding_write_requests: js.UndefOr[long] = js.undefined
  
  var max_read_request_operation_count: js.UndefOr[long] = js.undefined
  
  var max_read_request_size: js.UndefOr[String] = js.undefined
  
  var max_retry_delay: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var max_write_buffer_count: js.UndefOr[long] = js.undefined
  
  var max_write_buffer_size: js.UndefOr[String] = js.undefined
  
  var max_write_request_operation_count: js.UndefOr[long] = js.undefined
  
  var max_write_request_size: js.UndefOr[String] = js.undefined
  
  var read_poll_timeout: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
}
object Maxoutstandingreadrequests {
  
  inline def apply(): Maxoutstandingreadrequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxoutstandingreadrequests]
  }
  
  extension [Self <: Maxoutstandingreadrequests](x: Self) {
    
    inline def setMax_outstanding_read_requests(value: long): Self = StObject.set(x, "max_outstanding_read_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_read_requestsUndefined: Self = StObject.set(x, "max_outstanding_read_requests", js.undefined)
    
    inline def setMax_outstanding_write_requests(value: long): Self = StObject.set(x, "max_outstanding_write_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_write_requestsUndefined: Self = StObject.set(x, "max_outstanding_write_requests", js.undefined)
    
    inline def setMax_read_request_operation_count(value: long): Self = StObject.set(x, "max_read_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_operation_countUndefined: Self = StObject.set(x, "max_read_request_operation_count", js.undefined)
    
    inline def setMax_read_request_size(value: String): Self = StObject.set(x, "max_read_request_size", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_sizeUndefined: Self = StObject.set(x, "max_read_request_size", js.undefined)
    
    inline def setMax_retry_delay(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "max_retry_delay", value.asInstanceOf[js.Any])
    
    inline def setMax_retry_delayUndefined: Self = StObject.set(x, "max_retry_delay", js.undefined)
    
    inline def setMax_write_buffer_count(value: long): Self = StObject.set(x, "max_write_buffer_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_countUndefined: Self = StObject.set(x, "max_write_buffer_count", js.undefined)
    
    inline def setMax_write_buffer_size(value: String): Self = StObject.set(x, "max_write_buffer_size", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_sizeUndefined: Self = StObject.set(x, "max_write_buffer_size", js.undefined)
    
    inline def setMax_write_request_operation_count(value: long): Self = StObject.set(x, "max_write_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_operation_countUndefined: Self = StObject.set(x, "max_write_request_operation_count", js.undefined)
    
    inline def setMax_write_request_size(value: String): Self = StObject.set(x, "max_write_request_size", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_sizeUndefined: Self = StObject.set(x, "max_write_request_size", js.undefined)
    
    inline def setRead_poll_timeout(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "read_poll_timeout", value.asInstanceOf[js.Any])
    
    inline def setRead_poll_timeoutUndefined: Self = StObject.set(x, "read_poll_timeout", js.undefined)
  }
}
