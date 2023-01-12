package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.keep_types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisKeepTypesTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var mode: js.UndefOr[AnalysisKeepTypesMode] = js.undefined
  
  var `type`: keep_types
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object AnalysisKeepTypesTokenFilter {
  
  inline def apply(): AnalysisKeepTypesTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keep_types")
    __obj.asInstanceOf[AnalysisKeepTypesTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisKeepTypesTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setMode(value: AnalysisKeepTypesMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setType(value: keep_types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
