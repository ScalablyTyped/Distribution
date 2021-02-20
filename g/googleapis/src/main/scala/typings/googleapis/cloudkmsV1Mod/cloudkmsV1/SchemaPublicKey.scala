package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The public key for a given CryptoKeyVersion. Obtained via GetPublicKey.
  */
@js.native
trait SchemaPublicKey extends StObject {
  
  /**
    * The Algorithm associated with this key.
    */
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * The public key, encoded in PEM format. For more information, see the [RFC
    * 7468](https://tools.ietf.org/html/rfc7468) sections for [General
    * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and
    * [Textual Encoding of Subject Public Key Info]
    * (https://tools.ietf.org/html/rfc7468#section-13).
    */
  var pem: js.UndefOr[String] = js.native
}
object SchemaPublicKey {
  
  @scala.inline
  def apply(): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKey]
  }
  
  @scala.inline
  implicit class SchemaPublicKeyMutableBuilder[Self <: SchemaPublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
  }
}
