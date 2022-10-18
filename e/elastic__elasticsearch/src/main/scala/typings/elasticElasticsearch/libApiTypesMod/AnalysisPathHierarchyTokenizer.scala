package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.path_hierarchy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPathHierarchyTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var buffer_size: integer
  
  var delimiter: String
  
  var replacement: String
  
  var reverse: Boolean
  
  var skip: integer
  
  var `type`: path_hierarchy
}
object AnalysisPathHierarchyTokenizer {
  
  inline def apply(buffer_size: integer, delimiter: String, replacement: String, reverse: Boolean, skip: integer): AnalysisPathHierarchyTokenizer = {
    val __obj = js.Dynamic.literal(buffer_size = buffer_size.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path_hierarchy")
    __obj.asInstanceOf[AnalysisPathHierarchyTokenizer]
  }
  
  extension [Self <: AnalysisPathHierarchyTokenizer](x: Self) {
    
    inline def setBuffer_size(value: integer): Self = StObject.set(x, "buffer_size", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setSkip(value: integer): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setType(value: path_hierarchy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
