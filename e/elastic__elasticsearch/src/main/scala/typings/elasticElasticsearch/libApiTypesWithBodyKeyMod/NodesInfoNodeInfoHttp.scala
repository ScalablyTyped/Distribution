package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoHttp extends StObject {
  
  var bound_address: js.Array[String]
  
  var max_content_length: js.UndefOr[ByteSize] = js.undefined
  
  var max_content_length_in_bytes: long
  
  var publish_address: String
}
object NodesInfoNodeInfoHttp {
  
  inline def apply(bound_address: js.Array[String], max_content_length_in_bytes: long, publish_address: String): NodesInfoNodeInfoHttp = {
    val __obj = js.Dynamic.literal(bound_address = bound_address.asInstanceOf[js.Any], max_content_length_in_bytes = max_content_length_in_bytes.asInstanceOf[js.Any], publish_address = publish_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoHttp]
  }
  
  extension [Self <: NodesInfoNodeInfoHttp](x: Self) {
    
    inline def setBound_address(value: js.Array[String]): Self = StObject.set(x, "bound_address", value.asInstanceOf[js.Any])
    
    inline def setBound_addressVarargs(value: String*): Self = StObject.set(x, "bound_address", js.Array(value*))
    
    inline def setMax_content_length(value: ByteSize): Self = StObject.set(x, "max_content_length", value.asInstanceOf[js.Any])
    
    inline def setMax_content_lengthUndefined: Self = StObject.set(x, "max_content_length", js.undefined)
    
    inline def setMax_content_length_in_bytes(value: long): Self = StObject.set(x, "max_content_length_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setPublish_address(value: String): Self = StObject.set(x, "publish_address", value.asInstanceOf[js.Any])
  }
}
