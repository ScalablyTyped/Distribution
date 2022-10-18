package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityEnrollNodeResponse extends StObject {
  
  var http_ca_cert: String
  
  var http_ca_key: String
  
  var nodes_addresses: js.Array[String]
  
  var transport_ca_cert: String
  
  var transport_cert: String
  
  var transport_key: String
}
object SecurityEnrollNodeResponse {
  
  inline def apply(
    http_ca_cert: String,
    http_ca_key: String,
    nodes_addresses: js.Array[String],
    transport_ca_cert: String,
    transport_cert: String,
    transport_key: String
  ): SecurityEnrollNodeResponse = {
    val __obj = js.Dynamic.literal(http_ca_cert = http_ca_cert.asInstanceOf[js.Any], http_ca_key = http_ca_key.asInstanceOf[js.Any], nodes_addresses = nodes_addresses.asInstanceOf[js.Any], transport_ca_cert = transport_ca_cert.asInstanceOf[js.Any], transport_cert = transport_cert.asInstanceOf[js.Any], transport_key = transport_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityEnrollNodeResponse]
  }
  
  extension [Self <: SecurityEnrollNodeResponse](x: Self) {
    
    inline def setHttp_ca_cert(value: String): Self = StObject.set(x, "http_ca_cert", value.asInstanceOf[js.Any])
    
    inline def setHttp_ca_key(value: String): Self = StObject.set(x, "http_ca_key", value.asInstanceOf[js.Any])
    
    inline def setNodes_addresses(value: js.Array[String]): Self = StObject.set(x, "nodes_addresses", value.asInstanceOf[js.Any])
    
    inline def setNodes_addressesVarargs(value: String*): Self = StObject.set(x, "nodes_addresses", js.Array(value*))
    
    inline def setTransport_ca_cert(value: String): Self = StObject.set(x, "transport_ca_cert", value.asInstanceOf[js.Any])
    
    inline def setTransport_cert(value: String): Self = StObject.set(x, "transport_cert", value.asInstanceOf[js.Any])
    
    inline def setTransport_key(value: String): Self = StObject.set(x, "transport_key", value.asInstanceOf[js.Any])
  }
}
