package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupInfo extends StObject {
  
  /**
    * Output only. Name of the backup.
    */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. This time that the backup was finished. Row data in the backup will be no newer than this timestamp.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the table the backup was created from.
    */
  var sourceTable: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time that the backup was started. Row data in the backup will be no older than this timestamp.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackupInfo {
  
  inline def apply(): SchemaBackupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupInfo]
  }
  
  extension [Self <: SchemaBackupInfo](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setSourceTable(value: String): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    inline def setSourceTableNull: Self = StObject.set(x, "sourceTable", null)
    
    inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
