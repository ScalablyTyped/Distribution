package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDocumentResponse extends js.Object {
  
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
  implicit class DeleteDocumentResponseOps[Self <: DeleteDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: String): Self = this.set("_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shards(value: ShardsResponse): Self = this.set("_shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: String): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_version(value: Double): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFound(value: Boolean): Self = this.set("found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
