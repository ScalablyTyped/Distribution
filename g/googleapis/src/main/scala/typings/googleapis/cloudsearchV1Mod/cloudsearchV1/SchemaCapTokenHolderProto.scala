package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCapTokenHolderProto extends StObject {
  
  /**
    * The hash of the corresponding capability token. The value is defined to be identical to the one in acl.proto's CapTokenMetadata: 10-byte prefix of HMAC-SHA1 of the token. The HMAC key is the following fixed (non-secret) 512-bit value: 79b1c8f4 82baf523 b8a9ab4a e960f438 c45be041 11f1f222 e8a3f64d aeb05e3d c3576acc ec649194 aede422c 4e48e0d1 ff21234a a6ed6b49 a7fa592e efd7bba3
    */
  var tokenHmacSha1Prefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaCapTokenHolderProto {
  
  inline def apply(): SchemaCapTokenHolderProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapTokenHolderProto]
  }
  
  extension [Self <: SchemaCapTokenHolderProto](x: Self) {
    
    inline def setTokenHmacSha1Prefix(value: String): Self = StObject.set(x, "tokenHmacSha1Prefix", value.asInstanceOf[js.Any])
    
    inline def setTokenHmacSha1PrefixNull: Self = StObject.set(x, "tokenHmacSha1Prefix", null)
    
    inline def setTokenHmacSha1PrefixUndefined: Self = StObject.set(x, "tokenHmacSha1Prefix", js.undefined)
  }
}
