package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateBackupRequest. */
trait ICreateBackupRequest extends StObject {
  
  /** CreateBackupRequest backup */
  var backup: js.UndefOr[IBackup | Null] = js.undefined
  
  /** CreateBackupRequest backupId */
  var backupId: js.UndefOr[String | Null] = js.undefined
  
  /** CreateBackupRequest encryptionConfig */
  var encryptionConfig: js.UndefOr[ICreateBackupEncryptionConfig | Null] = js.undefined
  
  /** CreateBackupRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateBackupRequest {
  
  inline def apply(): ICreateBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateBackupRequest]
  }
  
  extension [Self <: ICreateBackupRequest](x: Self) {
    
    inline def setBackup(value: IBackup): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdNull: Self = StObject.set(x, "backupId", null)
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setEncryptionConfig(value: ICreateBackupEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigNull: Self = StObject.set(x, "encryptionConfig", null)
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
