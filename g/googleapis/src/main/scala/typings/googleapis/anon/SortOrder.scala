package typings.googleapis.anon

import typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2.SchemaReportApiColumnSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortOrder extends StObject {
  
  var column: js.UndefOr[SchemaReportApiColumnSpec] = js.undefined
  
  var sortOrder: js.UndefOr[String] = js.undefined
}
object SortOrder {
  
  inline def apply(): SortOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOrder]
  }
  
  extension [Self <: SortOrder](x: Self) {
    
    inline def setColumn(value: SchemaReportApiColumnSpec): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
