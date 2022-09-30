package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EncryptionConfig. */
trait IEncryptionConfig extends StObject {
  
  /** EncryptionConfig kmsKeyName */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object IEncryptionConfig {
  
  inline def apply(): IEncryptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEncryptionConfig]
  }
  
  extension [Self <: IEncryptionConfig](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
