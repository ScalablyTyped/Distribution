package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legacytemplatetodelete extends StObject {
  
  var legacy_template_to_delete: js.UndefOr[String] = js.undefined
  
  var node_attribute: js.UndefOr[String] = js.undefined
}
object Legacytemplatetodelete {
  
  inline def apply(): Legacytemplatetodelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Legacytemplatetodelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Legacytemplatetodelete] (val x: Self) extends AnyVal {
    
    inline def setLegacy_template_to_delete(value: String): Self = StObject.set(x, "legacy_template_to_delete", value.asInstanceOf[js.Any])
    
    inline def setLegacy_template_to_deleteUndefined: Self = StObject.set(x, "legacy_template_to_delete", js.undefined)
    
    inline def setNode_attribute(value: String): Self = StObject.set(x, "node_attribute", value.asInstanceOf[js.Any])
    
    inline def setNode_attributeUndefined: Self = StObject.set(x, "node_attribute", js.undefined)
  }
}
