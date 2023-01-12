package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.alias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingFieldAliasProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var path: js.UndefOr[Field] = js.undefined
  
  var `type`: alias
}
object MappingFieldAliasProperty {
  
  inline def apply(): MappingFieldAliasProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("alias")
    __obj.asInstanceOf[MappingFieldAliasProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingFieldAliasProperty] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: alias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
