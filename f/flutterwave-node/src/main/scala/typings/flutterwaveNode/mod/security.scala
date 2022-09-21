package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait security extends StObject {
  
  def encrypt(key: String, text: String): String
  
  def getEncryptionKey(seckey: String): String
  
  def getIntegrityHash(data: Any, pubKey: String, seckey: String): String
}
object security {
  
  inline def apply(
    encrypt: (String, String) => String,
    getEncryptionKey: String => String,
    getIntegrityHash: (Any, String, String) => String
  ): security = {
    val __obj = js.Dynamic.literal(encrypt = js.Any.fromFunction2(encrypt), getEncryptionKey = js.Any.fromFunction1(getEncryptionKey), getIntegrityHash = js.Any.fromFunction3(getIntegrityHash))
    __obj.asInstanceOf[security]
  }
  
  extension [Self <: security](x: Self) {
    
    inline def setEncrypt(value: (String, String) => String): Self = StObject.set(x, "encrypt", js.Any.fromFunction2(value))
    
    inline def setGetEncryptionKey(value: String => String): Self = StObject.set(x, "getEncryptionKey", js.Any.fromFunction1(value))
    
    inline def setGetIntegrityHash(value: (Any, String, String) => String): Self = StObject.set(x, "getIntegrityHash", js.Any.fromFunction3(value))
  }
}
