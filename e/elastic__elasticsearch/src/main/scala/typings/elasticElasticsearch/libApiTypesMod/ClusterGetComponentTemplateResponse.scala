package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterGetComponentTemplateResponse extends StObject {
  
  var component_templates: js.Array[ClusterComponentTemplate]
}
object ClusterGetComponentTemplateResponse {
  
  inline def apply(component_templates: js.Array[ClusterComponentTemplate]): ClusterGetComponentTemplateResponse = {
    val __obj = js.Dynamic.literal(component_templates = component_templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterGetComponentTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterGetComponentTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setComponent_templates(value: js.Array[ClusterComponentTemplate]): Self = StObject.set(x, "component_templates", value.asInstanceOf[js.Any])
    
    inline def setComponent_templatesVarargs(value: ClusterComponentTemplate*): Self = StObject.set(x, "component_templates", js.Array(value*))
  }
}
