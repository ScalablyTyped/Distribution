package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnType extends StObject {
  
  var columnType: js.UndefOr[String] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ColumnType {
  
  inline def apply(): ColumnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnType]
  }
  
  extension [Self <: ColumnType](x: Self) {
    
    inline def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
    
    inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
