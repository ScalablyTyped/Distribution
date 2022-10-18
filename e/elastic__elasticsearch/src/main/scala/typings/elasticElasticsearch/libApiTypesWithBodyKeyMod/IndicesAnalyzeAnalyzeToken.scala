package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeAnalyzeToken extends StObject {
  
  var end_offset: long
  
  var position: long
  
  var position_length: js.UndefOr[long] = js.undefined
  
  var start_offset: long
  
  var token: String
  
  var `type`: String
}
object IndicesAnalyzeAnalyzeToken {
  
  inline def apply(end_offset: long, position: long, start_offset: long, token: String, `type`: String): IndicesAnalyzeAnalyzeToken = {
    val __obj = js.Dynamic.literal(end_offset = end_offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], start_offset = start_offset.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAnalyzeAnalyzeToken]
  }
  
  extension [Self <: IndicesAnalyzeAnalyzeToken](x: Self) {
    
    inline def setEnd_offset(value: long): Self = StObject.set(x, "end_offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: long): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPosition_length(value: long): Self = StObject.set(x, "position_length", value.asInstanceOf[js.Any])
    
    inline def setPosition_lengthUndefined: Self = StObject.set(x, "position_length", js.undefined)
    
    inline def setStart_offset(value: long): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
