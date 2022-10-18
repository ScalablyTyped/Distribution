package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSimulateTemplateResponse extends StObject {
  
  var overlapping: js.UndefOr[js.Array[IndicesSimulateTemplateOverlapping]] = js.undefined
  
  var template: IndicesSimulateTemplateTemplate
}
object IndicesSimulateTemplateResponse {
  
  inline def apply(template: IndicesSimulateTemplateTemplate): IndicesSimulateTemplateResponse = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSimulateTemplateResponse]
  }
  
  extension [Self <: IndicesSimulateTemplateResponse](x: Self) {
    
    inline def setOverlapping(value: js.Array[IndicesSimulateTemplateOverlapping]): Self = StObject.set(x, "overlapping", value.asInstanceOf[js.Any])
    
    inline def setOverlappingUndefined: Self = StObject.set(x, "overlapping", js.undefined)
    
    inline def setOverlappingVarargs(value: IndicesSimulateTemplateOverlapping*): Self = StObject.set(x, "overlapping", js.Array(value*))
    
    inline def setTemplate(value: IndicesSimulateTemplateTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
