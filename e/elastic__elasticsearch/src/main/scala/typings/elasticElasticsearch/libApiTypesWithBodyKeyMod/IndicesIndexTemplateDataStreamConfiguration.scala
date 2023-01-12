package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexTemplateDataStreamConfiguration extends StObject {
  
  var allow_custom_routing: js.UndefOr[Boolean] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object IndicesIndexTemplateDataStreamConfiguration {
  
  inline def apply(): IndicesIndexTemplateDataStreamConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexTemplateDataStreamConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexTemplateDataStreamConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllow_custom_routing(value: Boolean): Self = StObject.set(x, "allow_custom_routing", value.asInstanceOf[js.Any])
    
    inline def setAllow_custom_routingUndefined: Self = StObject.set(x, "allow_custom_routing", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
