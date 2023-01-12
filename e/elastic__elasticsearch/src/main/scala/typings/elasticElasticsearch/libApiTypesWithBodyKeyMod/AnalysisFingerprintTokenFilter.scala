package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.fingerprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisFingerprintTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var max_output_size: js.UndefOr[integer] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var `type`: fingerprint
}
object AnalysisFingerprintTokenFilter {
  
  inline def apply(): AnalysisFingerprintTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[AnalysisFingerprintTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisFingerprintTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setMax_output_size(value: integer): Self = StObject.set(x, "max_output_size", value.asInstanceOf[js.Any])
    
    inline def setMax_output_sizeUndefined: Self = StObject.set(x, "max_output_size", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setType(value: fingerprint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
