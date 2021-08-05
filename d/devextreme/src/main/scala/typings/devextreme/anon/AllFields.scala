package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllFields extends StObject {
  
  var allFields: js.UndefOr[String] = js.undefined
  
  var columnFields: js.UndefOr[String] = js.undefined
  
  var dataFields: js.UndefOr[String] = js.undefined
  
  var filterFields: js.UndefOr[String] = js.undefined
  
  var rowFields: js.UndefOr[String] = js.undefined
}
object AllFields {
  
  inline def apply(): AllFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllFields]
  }
  
  extension [Self <: AllFields](x: Self) {
    
    inline def setAllFields(value: String): Self = StObject.set(x, "allFields", value.asInstanceOf[js.Any])
    
    inline def setAllFieldsUndefined: Self = StObject.set(x, "allFields", js.undefined)
    
    inline def setColumnFields(value: String): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    inline def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
    
    inline def setDataFields(value: String): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
    
    inline def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
    
    inline def setFilterFields(value: String): Self = StObject.set(x, "filterFields", value.asInstanceOf[js.Any])
    
    inline def setFilterFieldsUndefined: Self = StObject.set(x, "filterFields", js.undefined)
    
    inline def setRowFields(value: String): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
    
    inline def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
  }
}
