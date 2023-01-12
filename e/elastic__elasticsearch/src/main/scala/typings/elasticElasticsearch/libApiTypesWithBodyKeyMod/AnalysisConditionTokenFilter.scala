package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisConditionTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var filter: js.Array[String]
  
  var script: Script
  
  var `type`: condition
}
object AnalysisConditionTokenFilter {
  
  inline def apply(filter: js.Array[String], script: Script): AnalysisConditionTokenFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("condition")
    __obj.asInstanceOf[AnalysisConditionTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisConditionTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setType(value: condition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
