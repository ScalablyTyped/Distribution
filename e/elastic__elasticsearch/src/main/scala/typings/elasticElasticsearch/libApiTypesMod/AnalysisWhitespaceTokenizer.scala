package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.whitespace_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisWhitespaceTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var max_token_length: js.UndefOr[integer] = js.undefined
  
  var `type`: whitespace_
}
object AnalysisWhitespaceTokenizer {
  
  inline def apply(): AnalysisWhitespaceTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[AnalysisWhitespaceTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisWhitespaceTokenizer] (val x: Self) extends AnyVal {
    
    inline def setMax_token_length(value: integer): Self = StObject.set(x, "max_token_length", value.asInstanceOf[js.Any])
    
    inline def setMax_token_lengthUndefined: Self = StObject.set(x, "max_token_length", js.undefined)
    
    inline def setType(value: whitespace_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
