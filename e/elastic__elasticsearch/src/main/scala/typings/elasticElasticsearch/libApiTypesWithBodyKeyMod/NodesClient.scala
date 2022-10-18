package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesClient extends StObject {
  
  var agent: js.UndefOr[String] = js.undefined
  
  var closed_time_millis: js.UndefOr[long] = js.undefined
  
  var id: js.UndefOr[long] = js.undefined
  
  var last_request_time_millis: js.UndefOr[long] = js.undefined
  
  var last_uri: js.UndefOr[String] = js.undefined
  
  var local_address: js.UndefOr[String] = js.undefined
  
  var opened_time_millis: js.UndefOr[long] = js.undefined
  
  var remote_address: js.UndefOr[String] = js.undefined
  
  var request_count: js.UndefOr[long] = js.undefined
  
  var request_size_bytes: js.UndefOr[long] = js.undefined
  
  var x_opaque_id: js.UndefOr[String] = js.undefined
}
object NodesClient {
  
  inline def apply(): NodesClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesClient]
  }
  
  extension [Self <: NodesClient](x: Self) {
    
    inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setClosed_time_millis(value: long): Self = StObject.set(x, "closed_time_millis", value.asInstanceOf[js.Any])
    
    inline def setClosed_time_millisUndefined: Self = StObject.set(x, "closed_time_millis", js.undefined)
    
    inline def setId(value: long): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast_request_time_millis(value: long): Self = StObject.set(x, "last_request_time_millis", value.asInstanceOf[js.Any])
    
    inline def setLast_request_time_millisUndefined: Self = StObject.set(x, "last_request_time_millis", js.undefined)
    
    inline def setLast_uri(value: String): Self = StObject.set(x, "last_uri", value.asInstanceOf[js.Any])
    
    inline def setLast_uriUndefined: Self = StObject.set(x, "last_uri", js.undefined)
    
    inline def setLocal_address(value: String): Self = StObject.set(x, "local_address", value.asInstanceOf[js.Any])
    
    inline def setLocal_addressUndefined: Self = StObject.set(x, "local_address", js.undefined)
    
    inline def setOpened_time_millis(value: long): Self = StObject.set(x, "opened_time_millis", value.asInstanceOf[js.Any])
    
    inline def setOpened_time_millisUndefined: Self = StObject.set(x, "opened_time_millis", js.undefined)
    
    inline def setRemote_address(value: String): Self = StObject.set(x, "remote_address", value.asInstanceOf[js.Any])
    
    inline def setRemote_addressUndefined: Self = StObject.set(x, "remote_address", js.undefined)
    
    inline def setRequest_count(value: long): Self = StObject.set(x, "request_count", value.asInstanceOf[js.Any])
    
    inline def setRequest_countUndefined: Self = StObject.set(x, "request_count", js.undefined)
    
    inline def setRequest_size_bytes(value: long): Self = StObject.set(x, "request_size_bytes", value.asInstanceOf[js.Any])
    
    inline def setRequest_size_bytesUndefined: Self = StObject.set(x, "request_size_bytes", js.undefined)
    
    inline def setX_opaque_id(value: String): Self = StObject.set(x, "x_opaque_id", value.asInstanceOf[js.Any])
    
    inline def setX_opaque_idUndefined: Self = StObject.set(x, "x_opaque_id", js.undefined)
  }
}
