package typings.googleAuthLibrary

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCryptoCryptoMod {
  
  @JSImport("google-auth-library/build/src/crypto/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCrypto(): Crypto = ^.asInstanceOf[js.Dynamic].applyDynamic("createCrypto")().asInstanceOf[Crypto]
  
  inline def fromArrayBufferToHex(arrayBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBufferToHex")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasBrowserCrypto(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBrowserCrypto")().asInstanceOf[Boolean]
  
  @js.native
  trait Crypto extends StObject {
    
    def decodeBase64StringUtf8(base64: String): String = js.native
    
    def encodeBase64StringUtf8(text: String): String = js.native
    
    def randomBytesBase64(n: Double): String = js.native
    
    def sha256DigestBase64(str: String): js.Promise[String] = js.native
    
    /**
      * Computes the SHA-256 hash of the provided string.
      * @param str The plain text string to hash.
      * @return A promise that resolves with the SHA-256 hash of the provided
      *   string in hexadecimal encoding.
      */
    def sha256DigestHex(str: String): js.Promise[String] = js.native
    
    def sign(privateKey: String, data: String): js.Promise[String] = js.native
    def sign(privateKey: String, data: Buffer): js.Promise[String] = js.native
    def sign(privateKey: JwkCertificate, data: String): js.Promise[String] = js.native
    def sign(privateKey: JwkCertificate, data: Buffer): js.Promise[String] = js.native
    
    /**
      * Computes the HMAC hash of a message using the provided crypto key and the
      * SHA-256 algorithm.
      * @param key The secret crypto key in utf-8 or ArrayBuffer format.
      * @param msg The plain text message.
      * @return A promise that resolves with the HMAC-SHA256 hash in ArrayBuffer
      *   format.
      */
    def signWithHmacSha256(key: String, msg: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def signWithHmacSha256(key: js.typedarray.ArrayBuffer, msg: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def verify(pubkey: String, data: String, signature: String): js.Promise[Boolean] = js.native
    def verify(pubkey: String, data: Buffer, signature: String): js.Promise[Boolean] = js.native
    def verify(pubkey: JwkCertificate, data: String, signature: String): js.Promise[Boolean] = js.native
    def verify(pubkey: JwkCertificate, data: Buffer, signature: String): js.Promise[Boolean] = js.native
  }
  
  trait CryptoSigner extends StObject {
    
    def sign(key: String, outputFormat: String): String
    
    def update(data: String): Unit
  }
  object CryptoSigner {
    
    inline def apply(sign: (String, String) => String, update: String => Unit): CryptoSigner = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[CryptoSigner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CryptoSigner] (val x: Self) extends AnyVal {
      
      inline def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      inline def setUpdate(value: String => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait JwkCertificate extends StObject {
    
    var alg: String
    
    var e: String
    
    var kid: String
    
    var kty: String
    
    var n: String
    
    var use: js.UndefOr[String] = js.undefined
  }
  object JwkCertificate {
    
    inline def apply(alg: String, e: String, kid: String, kty: String, n: String): JwkCertificate = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwkCertificate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JwkCertificate] (val x: Self) extends AnyVal {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
}
