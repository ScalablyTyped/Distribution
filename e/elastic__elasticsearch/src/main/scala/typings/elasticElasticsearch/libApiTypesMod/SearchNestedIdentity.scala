package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchNestedIdentity extends StObject {
  
  var _nested: js.UndefOr[SearchNestedIdentity] = js.undefined
  
  var field: Field
  
  var offset: integer
}
object SearchNestedIdentity {
  
  inline def apply(field: Field, offset: integer): SearchNestedIdentity = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchNestedIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchNestedIdentity] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def set_nested(value: SearchNestedIdentity): Self = StObject.set(x, "_nested", value.asInstanceOf[js.Any])
    
    inline def set_nestedUndefined: Self = StObject.set(x, "_nested", js.undefined)
  }
}
