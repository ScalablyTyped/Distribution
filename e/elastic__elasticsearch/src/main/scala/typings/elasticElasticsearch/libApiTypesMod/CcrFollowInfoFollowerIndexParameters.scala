package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrFollowInfoFollowerIndexParameters extends StObject {
  
  var max_outstanding_read_requests: integer
  
  var max_outstanding_write_requests: integer
  
  var max_read_request_operation_count: integer
  
  var max_read_request_size: String
  
  var max_retry_delay: Duration
  
  var max_write_buffer_count: integer
  
  var max_write_buffer_size: String
  
  var max_write_request_operation_count: integer
  
  var max_write_request_size: String
  
  var read_poll_timeout: Duration
}
object CcrFollowInfoFollowerIndexParameters {
  
  inline def apply(
    max_outstanding_read_requests: integer,
    max_outstanding_write_requests: integer,
    max_read_request_operation_count: integer,
    max_read_request_size: String,
    max_retry_delay: Duration,
    max_write_buffer_count: integer,
    max_write_buffer_size: String,
    max_write_request_operation_count: integer,
    max_write_request_size: String,
    read_poll_timeout: Duration
  ): CcrFollowInfoFollowerIndexParameters = {
    val __obj = js.Dynamic.literal(max_outstanding_read_requests = max_outstanding_read_requests.asInstanceOf[js.Any], max_outstanding_write_requests = max_outstanding_write_requests.asInstanceOf[js.Any], max_read_request_operation_count = max_read_request_operation_count.asInstanceOf[js.Any], max_read_request_size = max_read_request_size.asInstanceOf[js.Any], max_retry_delay = max_retry_delay.asInstanceOf[js.Any], max_write_buffer_count = max_write_buffer_count.asInstanceOf[js.Any], max_write_buffer_size = max_write_buffer_size.asInstanceOf[js.Any], max_write_request_operation_count = max_write_request_operation_count.asInstanceOf[js.Any], max_write_request_size = max_write_request_size.asInstanceOf[js.Any], read_poll_timeout = read_poll_timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrFollowInfoFollowerIndexParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrFollowInfoFollowerIndexParameters] (val x: Self) extends AnyVal {
    
    inline def setMax_outstanding_read_requests(value: integer): Self = StObject.set(x, "max_outstanding_read_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_write_requests(value: integer): Self = StObject.set(x, "max_outstanding_write_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_operation_count(value: integer): Self = StObject.set(x, "max_read_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_size(value: String): Self = StObject.set(x, "max_read_request_size", value.asInstanceOf[js.Any])
    
    inline def setMax_retry_delay(value: Duration): Self = StObject.set(x, "max_retry_delay", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_count(value: integer): Self = StObject.set(x, "max_write_buffer_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_size(value: String): Self = StObject.set(x, "max_write_buffer_size", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_operation_count(value: integer): Self = StObject.set(x, "max_write_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_size(value: String): Self = StObject.set(x, "max_write_request_size", value.asInstanceOf[js.Any])
    
    inline def setRead_poll_timeout(value: Duration): Self = StObject.set(x, "read_poll_timeout", value.asInstanceOf[js.Any])
  }
}
