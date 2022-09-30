package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDiscount extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/payment-discount
  /**
    * A string used to uniquely identify a discount offer for a product.
    */
  var identifier: String
  
  /**
    * A string that identifies the key used to generate the signature.
    */
  var keyIdentifier: String
  
  /**
    * A universally unique ID (UUID) value that you define.
    */
  var nonce: String
  
  /**
    * A UTF-8 string representing the properties of a specific discount offer,
    * cryptographically signed.
    */
  var signature: String
  
  /**
    * The date and time of the signature's creation in milliseconds, formatted in Unix
    * epoch time.
    */
  var timestamp: Double
}
object PaymentDiscount {
  
  inline def apply(identifier: String, keyIdentifier: String, nonce: String, signature: String, timestamp: Double): PaymentDiscount = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], keyIdentifier = keyIdentifier.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDiscount]
  }
  
  extension [Self <: PaymentDiscount](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setKeyIdentifier(value: String): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
