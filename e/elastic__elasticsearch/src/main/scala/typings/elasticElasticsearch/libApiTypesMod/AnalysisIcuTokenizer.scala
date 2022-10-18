package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.icu_tokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisIcuTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenFilterDefinition
     with AnalysisTokenizerDefinition {
  
  var rule_files: String
  
  var `type`: icu_tokenizer
}
object AnalysisIcuTokenizer {
  
  inline def apply(rule_files: String): AnalysisIcuTokenizer = {
    val __obj = js.Dynamic.literal(rule_files = rule_files.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("icu_tokenizer")
    __obj.asInstanceOf[AnalysisIcuTokenizer]
  }
  
  extension [Self <: AnalysisIcuTokenizer](x: Self) {
    
    inline def setRule_files(value: String): Self = StObject.set(x, "rule_files", value.asInstanceOf[js.Any])
    
    inline def setType(value: icu_tokenizer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
