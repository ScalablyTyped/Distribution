package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateBackupMetadata extends StObject {
  
  /**
    * If set, the time at which this operation finished or was cancelled.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the backup being created.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the table the backup is created from.
    */
  var sourceTable: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which this operation started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateBackupMetadata {
  
  inline def apply(): SchemaCreateBackupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateBackupMetadata]
  }
  
  extension [Self <: SchemaCreateBackupMetadata](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourceTable(value: String): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    inline def setSourceTableNull: Self = StObject.set(x, "sourceTable", null)
    
    inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
