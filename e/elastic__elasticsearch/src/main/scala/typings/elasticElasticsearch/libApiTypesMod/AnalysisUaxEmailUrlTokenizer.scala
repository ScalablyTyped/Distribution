package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.uax_url_email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisUaxEmailUrlTokenizer
  extends StObject
     with AnalysisTokenizerBase
     with AnalysisTokenizerDefinition {
  
  var max_token_length: js.UndefOr[integer] = js.undefined
  
  var `type`: uax_url_email
}
object AnalysisUaxEmailUrlTokenizer {
  
  inline def apply(): AnalysisUaxEmailUrlTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("uax_url_email")
    __obj.asInstanceOf[AnalysisUaxEmailUrlTokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisUaxEmailUrlTokenizer] (val x: Self) extends AnyVal {
    
    inline def setMax_token_length(value: integer): Self = StObject.set(x, "max_token_length", value.asInstanceOf[js.Any])
    
    inline def setMax_token_lengthUndefined: Self = StObject.set(x, "max_token_length", js.undefined)
    
    inline def setType(value: uax_url_email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
