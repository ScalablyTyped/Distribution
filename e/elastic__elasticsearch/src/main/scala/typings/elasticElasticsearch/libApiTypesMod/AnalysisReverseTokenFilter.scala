package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisReverseTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: reverse
}
object AnalysisReverseTokenFilter {
  
  inline def apply(): AnalysisReverseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reverse")
    __obj.asInstanceOf[AnalysisReverseTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisReverseTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setType(value: reverse): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
