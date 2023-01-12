package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageRuntimeFieldTypes
  extends StObject
     with XpackUsageBase {
  
  var field_types: js.Array[XpackUsageRuntimeFieldsType]
}
object XpackUsageRuntimeFieldTypes {
  
  inline def apply(available: Boolean, enabled: Boolean, field_types: js.Array[XpackUsageRuntimeFieldsType]): XpackUsageRuntimeFieldTypes = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], field_types = field_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageRuntimeFieldTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageRuntimeFieldTypes] (val x: Self) extends AnyVal {
    
    inline def setField_types(value: js.Array[XpackUsageRuntimeFieldsType]): Self = StObject.set(x, "field_types", value.asInstanceOf[js.Any])
    
    inline def setField_typesVarargs(value: XpackUsageRuntimeFieldsType*): Self = StObject.set(x, "field_types", js.Array(value*))
  }
}
