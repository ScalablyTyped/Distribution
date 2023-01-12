package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.trim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisTrimTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: trim
}
object AnalysisTrimTokenFilter {
  
  inline def apply(): AnalysisTrimTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("trim")
    __obj.asInstanceOf[AnalysisTrimTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisTrimTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setType(value: trim): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
