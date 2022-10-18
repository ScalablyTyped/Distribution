package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterComponentTemplate extends StObject {
  
  var component_template: ClusterComponentTemplateNode
  
  var name: Name
}
object ClusterComponentTemplate {
  
  inline def apply(component_template: ClusterComponentTemplateNode, name: Name): ClusterComponentTemplate = {
    val __obj = js.Dynamic.literal(component_template = component_template.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterComponentTemplate]
  }
  
  extension [Self <: ClusterComponentTemplate](x: Self) {
    
    inline def setComponent_template(value: ClusterComponentTemplateNode): Self = StObject.set(x, "component_template", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
