package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BackupInfo. */
trait IBackupInfo extends StObject {
  
  /** BackupInfo backup */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /** BackupInfo createTime */
  var createTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** BackupInfo sourceDatabase */
  var sourceDatabase: js.UndefOr[String | Null] = js.undefined
  
  /** BackupInfo versionTime */
  var versionTime: js.UndefOr[ITimestamp | Null] = js.undefined
}
object IBackupInfo {
  
  inline def apply(): IBackupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBackupInfo]
  }
  
  extension [Self <: IBackupInfo](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setCreateTime(value: ITimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setSourceDatabase(value: String): Self = StObject.set(x, "sourceDatabase", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseNull: Self = StObject.set(x, "sourceDatabase", null)
    
    inline def setSourceDatabaseUndefined: Self = StObject.set(x, "sourceDatabase", js.undefined)
    
    inline def setVersionTime(value: ITimestamp): Self = StObject.set(x, "versionTime", value.asInstanceOf[js.Any])
    
    inline def setVersionTimeNull: Self = StObject.set(x, "versionTime", null)
    
    inline def setVersionTimeUndefined: Self = StObject.set(x, "versionTime", js.undefined)
  }
}
