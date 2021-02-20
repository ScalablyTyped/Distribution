package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableListTablesView extends StObject {
  
  var useLegacySql: js.UndefOr[Boolean] = js.native
}
object TableListTablesView {
  
  @scala.inline
  def apply(): TableListTablesView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableListTablesView]
  }
  
  @scala.inline
  implicit class TableListTablesViewMutableBuilder[Self <: TableListTablesView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
  }
}
