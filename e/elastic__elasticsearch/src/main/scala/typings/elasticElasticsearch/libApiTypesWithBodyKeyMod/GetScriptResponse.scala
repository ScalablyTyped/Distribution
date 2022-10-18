package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptResponse extends StObject {
  
  var _id: Id
  
  var found: Boolean
  
  var script: js.UndefOr[StoredScript] = js.undefined
}
object GetScriptResponse {
  
  inline def apply(_id: Id, found: Boolean): GetScriptResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptResponse]
  }
  
  extension [Self <: GetScriptResponse](x: Self) {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setScript(value: StoredScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
