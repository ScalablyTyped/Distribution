package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisUniqueTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var only_on_same_position: js.UndefOr[Boolean] = js.undefined
  
  var `type`: unique
}
object AnalysisUniqueTokenFilter {
  
  inline def apply(): AnalysisUniqueTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unique")
    __obj.asInstanceOf[AnalysisUniqueTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisUniqueTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setOnly_on_same_position(value: Boolean): Self = StObject.set(x, "only_on_same_position", value.asInstanceOf[js.Any])
    
    inline def setOnly_on_same_positionUndefined: Self = StObject.set(x, "only_on_same_position", js.undefined)
    
    inline def setType(value: unique): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
