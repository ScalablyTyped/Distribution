package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.keyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKeywordTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var buffer_size: integer
  
  var `type`: keyword
}
object AnalysisKeywordTokenizer {
  
  inline def apply(buffer_size: integer): AnalysisKeywordTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyword")
    __obj.asInstanceOf[AnalysisKeywordTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisKeywordTokenizer] (val x: Self) extends AnyVal {
    
    inline def setBuffer_size(value: integer): Self = StObject.set(x, "buffer_size", value.asInstanceOf[js.Any])
    
    inline def setType(value: keyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
