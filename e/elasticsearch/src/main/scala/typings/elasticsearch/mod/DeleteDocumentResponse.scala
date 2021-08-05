package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentResponse extends StObject {
  
  var _id: String
  
  var _index: String
  
  var _shards: ShardsResponse
  
  var _type: String
  
  var _version: Double
  
  var found: Boolean
  
  var result: String
}
object DeleteDocumentResponse {
  
  inline def apply(
    _id: String,
    _index: String,
    _shards: ShardsResponse,
    _type: String,
    _version: Double,
    found: Boolean,
    result: String
  ): DeleteDocumentResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _shards = _shards.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentResponse]
  }
  
  extension [Self <: DeleteDocumentResponse](x: Self) {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardsResponse): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_version(value: Double): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
  }
}
