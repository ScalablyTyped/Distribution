package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingRuntimeField extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var `type`: MappingRuntimeFieldType
}
object MappingRuntimeField {
  
  inline def apply(`type`: MappingRuntimeFieldType): MappingRuntimeField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingRuntimeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingRuntimeField] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setType(value: MappingRuntimeFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
