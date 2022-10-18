package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.nested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingNestedProperty
  extends StObject
     with MappingCorePropertyBase
     with MappingProperty {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var include_in_parent: js.UndefOr[Boolean] = js.undefined
  
  var include_in_root: js.UndefOr[Boolean] = js.undefined
  
  var `type`: nested
}
object MappingNestedProperty {
  
  inline def apply(): MappingNestedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nested")
    __obj.asInstanceOf[MappingNestedProperty]
  }
  
  extension [Self <: MappingNestedProperty](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setInclude_in_parent(value: Boolean): Self = StObject.set(x, "include_in_parent", value.asInstanceOf[js.Any])
    
    inline def setInclude_in_parentUndefined: Self = StObject.set(x, "include_in_parent", js.undefined)
    
    inline def setInclude_in_root(value: Boolean): Self = StObject.set(x, "include_in_root", value.asInstanceOf[js.Any])
    
    inline def setInclude_in_rootUndefined: Self = StObject.set(x, "include_in_root", js.undefined)
    
    inline def setType(value: nested): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
