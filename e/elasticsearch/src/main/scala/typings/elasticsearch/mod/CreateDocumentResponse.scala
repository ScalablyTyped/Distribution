package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDocumentResponse extends StObject {
  
  var _id: String = js.native
  
  var _index: String = js.native
  
  var _shards: ShardsResponse = js.native
  
  var _type: String = js.native
  
  var _version: Double = js.native
  
  var created: Boolean = js.native
  
  var result: String = js.native
}
object CreateDocumentResponse {
  
  @scala.inline
  def apply(
    _id: String,
    _index: String,
    _shards: ShardsResponse,
    _type: String,
    _version: Double,
    created: Boolean,
    result: String
  ): CreateDocumentResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _shards = _shards.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentResponse]
  }
  
  @scala.inline
  implicit class CreateDocumentResponseMutableBuilder[Self <: CreateDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
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
