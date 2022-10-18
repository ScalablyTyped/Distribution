package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisPatternTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var flags: String
  
  var group: integer
  
  var pattern: String
  
  var `type`: pattern
}
object AnalysisPatternTokenizer {
  
  inline def apply(flags: String, group: integer, pattern: String): AnalysisPatternTokenizer = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[AnalysisPatternTokenizer]
  }
  
  extension [Self <: AnalysisPatternTokenizer](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: integer): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
