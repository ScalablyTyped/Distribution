package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityRoleMappingRule extends StObject {
  
  var all: js.UndefOr[js.Array[SecurityRoleMappingRule]] = js.undefined
  
  var any: js.UndefOr[js.Array[SecurityRoleMappingRule]] = js.undefined
  
  var except: js.UndefOr[SecurityRoleMappingRule] = js.undefined
  
  var field: js.UndefOr[SecurityFieldRule] = js.undefined
}
object SecurityRoleMappingRule {
  
  inline def apply(): SecurityRoleMappingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityRoleMappingRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityRoleMappingRule] (val x: Self) extends AnyVal {
    
    inline def setAll(value: js.Array[SecurityRoleMappingRule]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAllVarargs(value: SecurityRoleMappingRule*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setAny(value: js.Array[SecurityRoleMappingRule]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
    
    inline def setAnyVarargs(value: SecurityRoleMappingRule*): Self = StObject.set(x, "any", js.Array(value*))
    
    inline def setExcept(value: SecurityRoleMappingRule): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    inline def setField(value: SecurityFieldRule): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
