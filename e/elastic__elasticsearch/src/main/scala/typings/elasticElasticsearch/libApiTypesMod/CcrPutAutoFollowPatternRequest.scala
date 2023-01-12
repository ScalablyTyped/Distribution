package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrPutAutoFollowPatternRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var follow_index_pattern: js.UndefOr[IndexPattern] = js.undefined
  
  var leader_index_exclusion_patterns: js.UndefOr[IndexPatterns] = js.undefined
  
  var leader_index_patterns: js.UndefOr[IndexPatterns] = js.undefined
  
  var max_outstanding_read_requests: js.UndefOr[integer] = js.undefined
  
  var max_outstanding_write_requests: js.UndefOr[integer] = js.undefined
  
  var max_read_request_operation_count: js.UndefOr[integer] = js.undefined
  
  var max_read_request_size: js.UndefOr[ByteSize] = js.undefined
  
  var max_retry_delay: js.UndefOr[Duration] = js.undefined
  
  var max_write_buffer_count: js.UndefOr[integer] = js.undefined
  
  var max_write_buffer_size: js.UndefOr[ByteSize] = js.undefined
  
  var max_write_request_operation_count: js.UndefOr[integer] = js.undefined
  
  var max_write_request_size: js.UndefOr[ByteSize] = js.undefined
  
  var name: Name
  
  var read_poll_timeout: js.UndefOr[Duration] = js.undefined
  
  var remote_cluster: String
  
  var settings: js.UndefOr[Record[String, Any]] = js.undefined
}
object CcrPutAutoFollowPatternRequest {
  
  inline def apply(name: Name, remote_cluster: String): CcrPutAutoFollowPatternRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], remote_cluster = remote_cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrPutAutoFollowPatternRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrPutAutoFollowPatternRequest] (val x: Self) extends AnyVal {
    
    inline def setFollow_index_pattern(value: IndexPattern): Self = StObject.set(x, "follow_index_pattern", value.asInstanceOf[js.Any])
    
    inline def setFollow_index_patternUndefined: Self = StObject.set(x, "follow_index_pattern", js.undefined)
    
    inline def setLeader_index_exclusion_patterns(value: IndexPatterns): Self = StObject.set(x, "leader_index_exclusion_patterns", value.asInstanceOf[js.Any])
    
    inline def setLeader_index_exclusion_patternsUndefined: Self = StObject.set(x, "leader_index_exclusion_patterns", js.undefined)
    
    inline def setLeader_index_exclusion_patternsVarargs(value: IndexPattern*): Self = StObject.set(x, "leader_index_exclusion_patterns", js.Array(value*))
    
    inline def setLeader_index_patterns(value: IndexPatterns): Self = StObject.set(x, "leader_index_patterns", value.asInstanceOf[js.Any])
    
    inline def setLeader_index_patternsUndefined: Self = StObject.set(x, "leader_index_patterns", js.undefined)
    
    inline def setLeader_index_patternsVarargs(value: IndexPattern*): Self = StObject.set(x, "leader_index_patterns", js.Array(value*))
    
    inline def setMax_outstanding_read_requests(value: integer): Self = StObject.set(x, "max_outstanding_read_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_read_requestsUndefined: Self = StObject.set(x, "max_outstanding_read_requests", js.undefined)
    
    inline def setMax_outstanding_write_requests(value: integer): Self = StObject.set(x, "max_outstanding_write_requests", value.asInstanceOf[js.Any])
    
    inline def setMax_outstanding_write_requestsUndefined: Self = StObject.set(x, "max_outstanding_write_requests", js.undefined)
    
    inline def setMax_read_request_operation_count(value: integer): Self = StObject.set(x, "max_read_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_operation_countUndefined: Self = StObject.set(x, "max_read_request_operation_count", js.undefined)
    
    inline def setMax_read_request_size(value: ByteSize): Self = StObject.set(x, "max_read_request_size", value.asInstanceOf[js.Any])
    
    inline def setMax_read_request_sizeUndefined: Self = StObject.set(x, "max_read_request_size", js.undefined)
    
    inline def setMax_retry_delay(value: Duration): Self = StObject.set(x, "max_retry_delay", value.asInstanceOf[js.Any])
    
    inline def setMax_retry_delayUndefined: Self = StObject.set(x, "max_retry_delay", js.undefined)
    
    inline def setMax_write_buffer_count(value: integer): Self = StObject.set(x, "max_write_buffer_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_countUndefined: Self = StObject.set(x, "max_write_buffer_count", js.undefined)
    
    inline def setMax_write_buffer_size(value: ByteSize): Self = StObject.set(x, "max_write_buffer_size", value.asInstanceOf[js.Any])
    
    inline def setMax_write_buffer_sizeUndefined: Self = StObject.set(x, "max_write_buffer_size", js.undefined)
    
    inline def setMax_write_request_operation_count(value: integer): Self = StObject.set(x, "max_write_request_operation_count", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_operation_countUndefined: Self = StObject.set(x, "max_write_request_operation_count", js.undefined)
    
    inline def setMax_write_request_size(value: ByteSize): Self = StObject.set(x, "max_write_request_size", value.asInstanceOf[js.Any])
    
    inline def setMax_write_request_sizeUndefined: Self = StObject.set(x, "max_write_request_size", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRead_poll_timeout(value: Duration): Self = StObject.set(x, "read_poll_timeout", value.asInstanceOf[js.Any])
    
    inline def setRead_poll_timeoutUndefined: Self = StObject.set(x, "read_poll_timeout", js.undefined)
    
    inline def setRemote_cluster(value: String): Self = StObject.set(x, "remote_cluster", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Record[String, Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
