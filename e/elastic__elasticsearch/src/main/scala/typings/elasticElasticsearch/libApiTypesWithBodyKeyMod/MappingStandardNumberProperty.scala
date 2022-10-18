package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingStandardNumberProperty
  extends StObject
     with MappingNumberPropertyBase {
  
  var coerce: js.UndefOr[Boolean] = js.undefined
  
  var on_script_error: js.UndefOr[MappingOnScriptError] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
}
object MappingStandardNumberProperty {
  
  inline def apply(): MappingStandardNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingStandardNumberProperty]
  }
  
  extension [Self <: MappingStandardNumberProperty](x: Self) {
    
    inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setOn_script_error(value: MappingOnScriptError): Self = StObject.set(x, "on_script_error", value.asInstanceOf[js.Any])
    
    inline def setOn_script_errorUndefined: Self = StObject.set(x, "on_script_error", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
