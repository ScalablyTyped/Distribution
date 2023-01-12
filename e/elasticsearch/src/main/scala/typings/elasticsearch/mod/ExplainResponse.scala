package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainResponse extends StObject {
  
  var _id: String
  
  var _index: String
  
  var _type: String
  
  var explanation: ExplainResponseDetails
  
  var matched: Boolean
}
object ExplainResponse {
  
  inline def apply(_id: String, _index: String, _type: String, explanation: ExplainResponseDetails, matched: Boolean): ExplainResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplainResponse] (val x: Self) extends AnyVal {
    
    inline def setExplanation(value: ExplainResponseDetails): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setMatched(value: Boolean): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_index(value: String): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
  }
}
