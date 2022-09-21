package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFieldArea extends StObject {
  
  /**
    * Specifies the placeholder of the column field area.
    */
  var columnFieldArea: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the placeholder of the data field area.
    */
  var dataFieldArea: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the placeholder of the filter field area.
    */
  var filterFieldArea: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the placeholder of the row field area.
    */
  var rowFieldArea: js.UndefOr[String] = js.undefined
}
object ColumnFieldArea {
  
  inline def apply(): ColumnFieldArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFieldArea]
  }
  
  extension [Self <: ColumnFieldArea](x: Self) {
    
    inline def setColumnFieldArea(value: String): Self = StObject.set(x, "columnFieldArea", value.asInstanceOf[js.Any])
    
    inline def setColumnFieldAreaUndefined: Self = StObject.set(x, "columnFieldArea", js.undefined)
    
    inline def setDataFieldArea(value: String): Self = StObject.set(x, "dataFieldArea", value.asInstanceOf[js.Any])
    
    inline def setDataFieldAreaUndefined: Self = StObject.set(x, "dataFieldArea", js.undefined)
    
    inline def setFilterFieldArea(value: String): Self = StObject.set(x, "filterFieldArea", value.asInstanceOf[js.Any])
    
    inline def setFilterFieldAreaUndefined: Self = StObject.set(x, "filterFieldArea", js.undefined)
    
    inline def setRowFieldArea(value: String): Self = StObject.set(x, "rowFieldArea", value.asInstanceOf[js.Any])
    
    inline def setRowFieldAreaUndefined: Self = StObject.set(x, "rowFieldArea", js.undefined)
  }
}
