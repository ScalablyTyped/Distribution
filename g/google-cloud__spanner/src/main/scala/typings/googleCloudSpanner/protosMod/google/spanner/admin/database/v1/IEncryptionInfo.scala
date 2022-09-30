package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.googleCloudSpannerStrings.create
import typings.googleCloudSpanner.googleCloudSpannerStrings.decode
import typings.googleCloudSpanner.googleCloudSpannerStrings.decodeDelimited
import typings.googleCloudSpanner.googleCloudSpannerStrings.encode
import typings.googleCloudSpanner.googleCloudSpannerStrings.encodeDelimited
import typings.googleCloudSpanner.googleCloudSpannerStrings.fromObject
import typings.googleCloudSpanner.googleCloudSpannerStrings.getTypeUrl
import typings.googleCloudSpanner.googleCloudSpannerStrings.toObject
import typings.googleCloudSpanner.googleCloudSpannerStrings.verify
import typings.googleCloudSpanner.protosMod.google.rpc.IStatus
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EncryptionInfo. */
trait IEncryptionInfo extends StObject {
  
  /** EncryptionInfo encryptionStatus */
  var encryptionStatus: js.UndefOr[IStatus | Null] = js.undefined
  
  /** EncryptionInfo encryptionType */
  var encryptionType: js.UndefOr[
    Type | create | encode | encodeDelimited | decode | decodeDelimited | verify | fromObject | toObject | getTypeUrl | Null
  ] = js.undefined
  
  /** EncryptionInfo kmsKeyVersion */
  var kmsKeyVersion: js.UndefOr[String | Null] = js.undefined
}
object IEncryptionInfo {
  
  inline def apply(): IEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEncryptionInfo]
  }
  
  extension [Self <: IEncryptionInfo](x: Self) {
    
    inline def setEncryptionStatus(value: IStatus): Self = StObject.set(x, "encryptionStatus", value.asInstanceOf[js.Any])
    
    inline def setEncryptionStatusNull: Self = StObject.set(x, "encryptionStatus", null)
    
    inline def setEncryptionStatusUndefined: Self = StObject.set(x, "encryptionStatus", js.undefined)
    
    inline def setEncryptionType(
      value: Type | create | encode | encodeDelimited | decode | decodeDelimited | verify | fromObject | toObject | getTypeUrl
    ): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeNull: Self = StObject.set(x, "encryptionType", null)
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsKeyVersion(value: String): Self = StObject.set(x, "kmsKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyVersionNull: Self = StObject.set(x, "kmsKeyVersion", null)
    
    inline def setKmsKeyVersionUndefined: Self = StObject.set(x, "kmsKeyVersion", js.undefined)
  }
}
