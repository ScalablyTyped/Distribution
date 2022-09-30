package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RestoreDatabaseEncryptionConfig. */
trait IRestoreDatabaseEncryptionConfig extends StObject {
  
  /** RestoreDatabaseEncryptionConfig encryptionType */
  var encryptionType: js.UndefOr[
    EncryptionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType * / any */ String) | Null
  ] = js.undefined
  
  /** RestoreDatabaseEncryptionConfig kmsKeyName */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object IRestoreDatabaseEncryptionConfig {
  
  inline def apply(): IRestoreDatabaseEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRestoreDatabaseEncryptionConfig]
  }
  
  extension [Self <: IRestoreDatabaseEncryptionConfig](x: Self) {
    
    inline def setEncryptionType(
      value: EncryptionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.RestoreDatabaseEncryptionConfig.EncryptionType * / any */ String)
    ): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeNull: Self = StObject.set(x, "encryptionType", null)
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
