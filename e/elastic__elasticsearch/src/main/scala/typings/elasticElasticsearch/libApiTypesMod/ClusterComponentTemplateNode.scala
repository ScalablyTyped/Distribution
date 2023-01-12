package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterComponentTemplateNode extends StObject {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var template: ClusterComponentTemplateSummary
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object ClusterComponentTemplateNode {
  
  inline def apply(template: ClusterComponentTemplateSummary): ClusterComponentTemplateNode = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterComponentTemplateNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterComponentTemplateNode] (val x: Self) extends AnyVal {
    
    inline def setTemplate(value: ClusterComponentTemplateSummary): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
