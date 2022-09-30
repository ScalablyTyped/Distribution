package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CopyBackupEncryptionConfig. */
trait ICopyBackupEncryptionConfig extends StObject {
  
  /** CopyBackupEncryptionConfig encryptionType */
  var encryptionType: js.UndefOr[
    EncryptionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType * / any */ String) | Null
  ] = js.undefined
  
  /** CopyBackupEncryptionConfig kmsKeyName */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object ICopyBackupEncryptionConfig {
  
  inline def apply(): ICopyBackupEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICopyBackupEncryptionConfig]
  }
  
  extension [Self <: ICopyBackupEncryptionConfig](x: Self) {
    
    inline def setEncryptionType(
      value: EncryptionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.CopyBackupEncryptionConfig.EncryptionType * / any */ String)
    ): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeNull: Self = StObject.set(x, "encryptionType", null)
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
