package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisUppercaseTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var `type`: uppercase
}
object AnalysisUppercaseTokenFilter {
  
  inline def apply(): AnalysisUppercaseTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("uppercase")
    __obj.asInstanceOf[AnalysisUppercaseTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisUppercaseTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setType(value: uppercase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
