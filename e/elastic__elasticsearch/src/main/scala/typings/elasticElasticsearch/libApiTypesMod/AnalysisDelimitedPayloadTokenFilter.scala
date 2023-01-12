package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.delimited_payload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisDelimitedPayloadTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[AnalysisDelimitedPayloadEncoding] = js.undefined
  
  var `type`: delimited_payload
}
object AnalysisDelimitedPayloadTokenFilter {
  
  inline def apply(): AnalysisDelimitedPayloadTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("delimited_payload")
    __obj.asInstanceOf[AnalysisDelimitedPayloadTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisDelimitedPayloadTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setEncoding(value: AnalysisDelimitedPayloadEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setType(value: delimited_payload): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
