package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CopyBackupRequest. */
trait ICopyBackupRequest extends StObject {
  
  /** CopyBackupRequest backupId */
  var backupId: js.UndefOr[String | Null] = js.undefined
  
  /** CopyBackupRequest encryptionConfig */
  var encryptionConfig: js.UndefOr[ICopyBackupEncryptionConfig | Null] = js.undefined
  
  /** CopyBackupRequest expireTime */
  var expireTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** CopyBackupRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** CopyBackupRequest sourceBackup */
  var sourceBackup: js.UndefOr[String | Null] = js.undefined
}
object ICopyBackupRequest {
  
  inline def apply(): ICopyBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICopyBackupRequest]
  }
  
  extension [Self <: ICopyBackupRequest](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdNull: Self = StObject.set(x, "backupId", null)
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setEncryptionConfig(value: ICopyBackupEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigNull: Self = StObject.set(x, "encryptionConfig", null)
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setExpireTime(value: ITimestamp): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupNull: Self = StObject.set(x, "sourceBackup", null)
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
