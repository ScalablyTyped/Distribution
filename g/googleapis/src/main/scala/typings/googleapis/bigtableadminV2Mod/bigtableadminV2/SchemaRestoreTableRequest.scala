package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestoreTableRequest extends StObject {
  
  /**
    * Name of the backup from which to restore. Values are of the form `projects//instances//clusters//backups/`.
    */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The id of the table to create and restore to. This table must not already exist. The `table_id` appended to `parent` forms the full table name of the form `projects//instances//tables/`.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestoreTableRequest {
  
  inline def apply(): SchemaRestoreTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestoreTableRequest]
  }
  
  extension [Self <: SchemaRestoreTableRequest](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
