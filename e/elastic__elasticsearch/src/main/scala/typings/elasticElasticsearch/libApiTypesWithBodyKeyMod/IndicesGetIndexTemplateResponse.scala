package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetIndexTemplateResponse extends StObject {
  
  var index_templates: js.Array[IndicesGetIndexTemplateIndexTemplateItem]
}
object IndicesGetIndexTemplateResponse {
  
  inline def apply(index_templates: js.Array[IndicesGetIndexTemplateIndexTemplateItem]): IndicesGetIndexTemplateResponse = {
    val __obj = js.Dynamic.literal(index_templates = index_templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesGetIndexTemplateResponse]
  }
  
  extension [Self <: IndicesGetIndexTemplateResponse](x: Self) {
    
    inline def setIndex_templates(value: js.Array[IndicesGetIndexTemplateIndexTemplateItem]): Self = StObject.set(x, "index_templates", value.asInstanceOf[js.Any])
    
    inline def setIndex_templatesVarargs(value: IndicesGetIndexTemplateIndexTemplateItem*): Self = StObject.set(x, "index_templates", js.Array(value*))
  }
}
