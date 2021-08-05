package typings.extjs.Ext.grid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumberColumn
  extends StObject
     with typings.extjs.Ext.grid.column.IColumn {
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
}
object INumberColumn {
  
  inline def apply(): INumberColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumberColumn]
  }
  
  extension [Self <: INumberColumn](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
