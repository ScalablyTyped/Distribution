package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetIndexTemplateIndexTemplateItem extends StObject {
  
  var index_template: IndicesIndexTemplate
  
  var name: Name
}
object IndicesGetIndexTemplateIndexTemplateItem {
  
  inline def apply(index_template: IndicesIndexTemplate, name: Name): IndicesGetIndexTemplateIndexTemplateItem = {
    val __obj = js.Dynamic.literal(index_template = index_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesGetIndexTemplateIndexTemplateItem]
  }
  
  extension [Self <: IndicesGetIndexTemplateIndexTemplateItem](x: Self) {
    
    inline def setIndex_template(value: IndicesIndexTemplate): Self = StObject.set(x, "index_template", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
