package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeExplainAnalyzeTokenKeys extends StObject {
  
  var bytes: String
  
  var end_offset: long
  
  var keyword: js.UndefOr[Boolean] = js.undefined
  
  var position: long
  
  var positionLength: long
  
  var start_offset: long
  
  var termFrequency: long
  
  var token: String
  
  var `type`: String
}
object IndicesAnalyzeExplainAnalyzeTokenKeys {
  
  inline def apply(
    bytes: String,
    end_offset: long,
    position: long,
    positionLength: long,
    start_offset: long,
    termFrequency: long,
    token: String,
    `type`: String
  ): IndicesAnalyzeExplainAnalyzeTokenKeys = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], end_offset = end_offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionLength = positionLength.asInstanceOf[js.Any], start_offset = start_offset.asInstanceOf[js.Any], termFrequency = termFrequency.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAnalyzeExplainAnalyzeTokenKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesAnalyzeExplainAnalyzeTokenKeys] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: String): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setEnd_offset(value: long): Self = StObject.set(x, "end_offset", value.asInstanceOf[js.Any])
    
    inline def setKeyword(value: Boolean): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setPosition(value: long): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionLength(value: long): Self = StObject.set(x, "positionLength", value.asInstanceOf[js.Any])
    
    inline def setStart_offset(value: long): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    inline def setTermFrequency(value: long): Self = StObject.set(x, "termFrequency", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
