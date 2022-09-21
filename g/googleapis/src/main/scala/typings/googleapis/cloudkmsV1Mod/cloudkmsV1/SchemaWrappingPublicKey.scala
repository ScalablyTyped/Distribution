package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWrappingPublicKey extends StObject {
  
  /**
    * The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
    */
  var pem: js.UndefOr[String | Null] = js.undefined
}
object SchemaWrappingPublicKey {
  
  inline def apply(): SchemaWrappingPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWrappingPublicKey]
  }
  
  extension [Self <: SchemaWrappingPublicKey](x: Self) {
    
    inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    inline def setPemNull: Self = StObject.set(x, "pem", null)
    
    inline def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
  }
}
