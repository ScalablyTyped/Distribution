package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MysqlExportOptions extends StObject {
  
  var mysqlExportOptions: js.UndefOr[MasterData] = js.undefined
  
  var schemaOnly: js.UndefOr[Boolean] = js.undefined
  
  var tables: js.UndefOr[js.Array[String]] = js.undefined
}
object MysqlExportOptions {
  
  @scala.inline
  def apply(): MysqlExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MysqlExportOptions]
  }
  
  @scala.inline
  implicit class MysqlExportOptionsMutableBuilder[Self <: MysqlExportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMysqlExportOptions(value: MasterData): Self = StObject.set(x, "mysqlExportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMysqlExportOptionsUndefined: Self = StObject.set(x, "mysqlExportOptions", js.undefined)
    
    @scala.inline
    def setSchemaOnly(value: Boolean): Self = StObject.set(x, "schemaOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaOnlyUndefined: Self = StObject.set(x, "schemaOnly", js.undefined)
    
    @scala.inline
    def setTables(value: js.Array[String]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: String*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
