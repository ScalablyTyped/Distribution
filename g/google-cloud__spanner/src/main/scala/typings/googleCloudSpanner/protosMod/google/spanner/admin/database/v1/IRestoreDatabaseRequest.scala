package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RestoreDatabaseRequest. */
trait IRestoreDatabaseRequest extends StObject {
  
  /** RestoreDatabaseRequest backup */
  var backup: js.UndefOr[String | Null] = js.undefined
  
  /** RestoreDatabaseRequest databaseId */
  var databaseId: js.UndefOr[String | Null] = js.undefined
  
  /** RestoreDatabaseRequest encryptionConfig */
  var encryptionConfig: js.UndefOr[IRestoreDatabaseEncryptionConfig | Null] = js.undefined
  
  /** RestoreDatabaseRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IRestoreDatabaseRequest {
  
  inline def apply(): IRestoreDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestoreDatabaseRequest]
  }
  
  extension [Self <: IRestoreDatabaseRequest](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupNull: Self = StObject.set(x, "backup", null)
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdNull: Self = StObject.set(x, "databaseId", null)
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setEncryptionConfig(value: IRestoreDatabaseEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigNull: Self = StObject.set(x, "encryptionConfig", null)
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
