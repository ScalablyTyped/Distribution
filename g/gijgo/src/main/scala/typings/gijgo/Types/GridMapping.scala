package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridMapping extends StObject {
  
  var dataField: js.UndefOr[String] = js.undefined
  
  var totalRecordsField: js.UndefOr[String] = js.undefined
}
object GridMapping {
  
  inline def apply(): GridMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMapping]
  }
  
  extension [Self <: GridMapping](x: Self) {
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setTotalRecordsField(value: String): Self = StObject.set(x, "totalRecordsField", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordsFieldUndefined: Self = StObject.set(x, "totalRecordsField", js.undefined)
  }
}
