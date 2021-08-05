package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The public key for a given CryptoKeyVersion. Obtained via GetPublicKey.
  */
trait SchemaPublicKey extends StObject {
  
  /**
    * The Algorithm associated with this key.
    */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /**
    * The public key, encoded in PEM format. For more information, see the [RFC
    * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
    * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
    * [Textual Encoding of Subject Public Key Info]
    * (https://tools.ietf.org/html/rfc7468#section-13).
    */
  var pem: js.UndefOr[String] = js.undefined
}
object SchemaPublicKey {
  
  inline def apply(): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKey]
  }
  
  extension [Self <: SchemaPublicKey](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    inline def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
  }
}
