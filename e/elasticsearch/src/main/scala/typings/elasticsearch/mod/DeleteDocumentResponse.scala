package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDocumentResponse extends StObject {
  
  var _id: String = js.native
  
  var _index: String = js.native
  
  var _shards: ShardsResponse = js.native
  
  var _type: String = js.native
  
  var _version: Double = js.native
  
  var found: Boolean = js.native
  
  var result: String = js.native
}
object DeleteDocumentResponse {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DeleteDocumentResponseMutableBuilder[Self <: DeleteDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shards(value: ShardsResponse): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_version(value: Double): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
  }
}
