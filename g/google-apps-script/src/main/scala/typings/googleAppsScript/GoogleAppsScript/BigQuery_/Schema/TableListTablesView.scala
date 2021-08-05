package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListTablesView extends StObject {
  
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
}
object TableListTablesView {
  
  inline def apply(): TableListTablesView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableListTablesView]
  }
  
  extension [Self <: TableListTablesView](x: Self) {
    
    inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
  }
}
