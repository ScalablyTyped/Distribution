package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A backup of a Cloud Bigtable table.
  */
trait SchemaBackup extends StObject {
  
  /**
    * Output only. The encryption information for the backup.
    */
  var encryptionInfo: js.UndefOr[SchemaEncryptionInfo] = js.undefined
  
  /**
    * Output only. `end_time` is the time that the backup was finished. The row data in the backup will be no newer than this timestamp.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 30 days from the time the request is received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A globally unique identifier for the backup which cannot be changed. Values are of the form `projects/{project\}/instances/{instance\}/clusters/{cluster\}/ backups/_a-zA-Z0-9*` The final segment of the name must be between 1 and 50 characters in length. The backup is stored in the cluster identified by the prefix of the backup name of the form `projects/{project\}/instances/{instance\}/clusters/{cluster\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Size of the backup in bytes.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. Name of the table from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects/{project\}/instances/{instance\}/tables/{source_table\}`.
    */
  var sourceTable: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. `start_time` is the time that the backup was started (i.e. approximately the time the CreateBackup request is received). The row data in this backup will be no older than this timestamp.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the backup.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackup {
  
  inline def apply(): SchemaBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackup]
  }
  
  extension [Self <: SchemaBackup](x: Self) {
    
    inline def setEncryptionInfo(value: SchemaEncryptionInfo): Self = StObject.set(x, "encryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "encryptionInfo", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    inline def setSourceTable(value: String): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    inline def setSourceTableNull: Self = StObject.set(x, "sourceTable", null)
    
    inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
