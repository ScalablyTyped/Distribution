package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAll extends StObject {
  
  var exportAll: js.UndefOr[String] = js.undefined
  
  var exportSelectedRows: js.UndefOr[String] = js.undefined
  
  var exportTo: js.UndefOr[String] = js.undefined
}
object ExportAll {
  
  inline def apply(): ExportAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportAll]
  }
  
  extension [Self <: ExportAll](x: Self) {
    
    inline def setExportAll(value: String): Self = StObject.set(x, "exportAll", value.asInstanceOf[js.Any])
    
    inline def setExportAllUndefined: Self = StObject.set(x, "exportAll", js.undefined)
    
    inline def setExportSelectedRows(value: String): Self = StObject.set(x, "exportSelectedRows", value.asInstanceOf[js.Any])
    
    inline def setExportSelectedRowsUndefined: Self = StObject.set(x, "exportSelectedRows", js.undefined)
    
    inline def setExportTo(value: String): Self = StObject.set(x, "exportTo", value.asInstanceOf[js.Any])
    
    inline def setExportToUndefined: Self = StObject.set(x, "exportTo", js.undefined)
  }
}
