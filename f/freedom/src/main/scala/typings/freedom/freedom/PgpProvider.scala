package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PgpProvider {
  
  trait KeyFingerprint extends StObject {
    
    var fingerprint: String
    
    var words: js.Array[String]
  }
  object KeyFingerprint {
    
    inline def apply(fingerprint: String, words: js.Array[String]): KeyFingerprint = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyFingerprint]
    }
    
    extension [Self <: KeyFingerprint](x: Self) {
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
  
  @js.native
  trait PgpProvider extends StObject {
    
    def armor(data: js.typedarray.ArrayBuffer): js.Promise[String] = js.native
    def armor(data: js.typedarray.ArrayBuffer, `type`: String): js.Promise[String] = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    def dearmor(data: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def ecdhBob(curve: String, pubKey: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def exportKey(): js.Promise[PublicKey] = js.native
    
    def getFingerprint(publicKey: String): js.Promise[KeyFingerprint] = js.native
    
    // Standard freedom crypto API
    def setup(passphrase: String, userid: String): js.Promise[Unit] = js.native
    
    def signEncrypt(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def signEncrypt(data: js.typedarray.ArrayBuffer, encryptKey: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def signEncrypt(data: js.typedarray.ArrayBuffer, encryptKey: String, sign: Boolean): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def signEncrypt(data: js.typedarray.ArrayBuffer, encryptKey: Unit, sign: Boolean): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def verifyDecrypt(data: js.typedarray.ArrayBuffer): js.Promise[VerifyDecryptResult] = js.native
    def verifyDecrypt(data: js.typedarray.ArrayBuffer, verifyKey: String): js.Promise[VerifyDecryptResult] = js.native
  }
  
  trait PublicKey extends StObject {
    
    var fingerprint: String
    
    var key: String
    
    var words: js.Array[String]
  }
  object PublicKey {
    
    inline def apply(fingerprint: String, key: String, words: js.Array[String]): PublicKey = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKey]
    }
    
    extension [Self <: PublicKey](x: Self) {
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
  
  trait VerifyDecryptResult extends StObject {
    
    var data: js.typedarray.ArrayBuffer
    
    var signedBy: js.Array[String]
  }
  object VerifyDecryptResult {
    
    inline def apply(data: js.typedarray.ArrayBuffer, signedBy: js.Array[String]): VerifyDecryptResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signedBy = signedBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyDecryptResult]
    }
    
    extension [Self <: VerifyDecryptResult](x: Self) {
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSignedBy(value: js.Array[String]): Self = StObject.set(x, "signedBy", value.asInstanceOf[js.Any])
      
      inline def setSignedByVarargs(value: String*): Self = StObject.set(x, "signedBy", js.Array(value*))
    }
  }
}
