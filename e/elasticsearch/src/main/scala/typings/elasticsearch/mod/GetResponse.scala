package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponse[T] extends StObject {
  
  var _id: String
  
  var _index: String
  
  var _routing: js.UndefOr[String] = js.undefined
  
  var _source: T
  
  var _type: String
  
  var _version: Double
  
  var found: Boolean
}
object GetResponse {
  
  @scala.inline
  def apply[T](_id: String, _index: String, _source: T, _type: String, _version: Double, found: Boolean): GetResponse[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponse[T]]
  }
  
  @scala.inline
  implicit class GetResponseMutableBuilder[Self <: GetResponse[?], T] (val x: Self & GetResponse[T]) extends AnyVal {
    
    @scala.inline
    def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_routing(value: String): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    @scala.inline
    def set_source(value: T): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_version(value: Double): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
  }
}
