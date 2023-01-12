package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataDescription extends StObject {
  
  var field_delimiter: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var time_field: js.UndefOr[Field] = js.undefined
  
  var time_format: js.UndefOr[String] = js.undefined
}
object MlDataDescription {
  
  inline def apply(): MlDataDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataDescription] (val x: Self) extends AnyVal {
    
    inline def setField_delimiter(value: String): Self = StObject.set(x, "field_delimiter", value.asInstanceOf[js.Any])
    
    inline def setField_delimiterUndefined: Self = StObject.set(x, "field_delimiter", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setTime_field(value: Field): Self = StObject.set(x, "time_field", value.asInstanceOf[js.Any])
    
    inline def setTime_fieldUndefined: Self = StObject.set(x, "time_field", js.undefined)
    
    inline def setTime_format(value: String): Self = StObject.set(x, "time_format", value.asInstanceOf[js.Any])
    
    inline def setTime_formatUndefined: Self = StObject.set(x, "time_format", js.undefined)
  }
}
