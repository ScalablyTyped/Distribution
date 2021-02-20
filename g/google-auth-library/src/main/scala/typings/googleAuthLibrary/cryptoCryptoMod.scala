package typings.googleAuthLibrary

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoCryptoMod {
  
  @JSImport("google-auth-library/build/src/crypto/crypto", "createCrypto")
  @js.native
  def createCrypto(): Crypto = js.native
  
  @JSImport("google-auth-library/build/src/crypto/crypto", "hasBrowserCrypto")
  @js.native
  def hasBrowserCrypto(): Boolean = js.native
  
  @js.native
  trait Crypto extends StObject {
    
    def decodeBase64StringUtf8(base64: String): String = js.native
    
    def encodeBase64StringUtf8(text: String): String = js.native
    
    def randomBytesBase64(n: Double): String = js.native
    
    def sha256DigestBase64(str: String): js.Promise[String] = js.native
    
    def sign(privateKey: String, data: String): js.Promise[String] = js.native
    def sign(privateKey: String, data: Buffer): js.Promise[String] = js.native
    def sign(privateKey: JwkCertificate, data: String): js.Promise[String] = js.native
    def sign(privateKey: JwkCertificate, data: Buffer): js.Promise[String] = js.native
    
    def verify(pubkey: String, data: String, signature: String): js.Promise[Boolean] = js.native
    def verify(pubkey: String, data: Buffer, signature: String): js.Promise[Boolean] = js.native
    def verify(pubkey: JwkCertificate, data: String, signature: String): js.Promise[Boolean] = js.native
    def verify(pubkey: JwkCertificate, data: Buffer, signature: String): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait CryptoSigner extends StObject {
    
    def sign(key: String, outputFormat: String): String = js.native
    
    def update(data: String): Unit = js.native
  }
  object CryptoSigner {
    
    @scala.inline
    def apply(sign: (String, String) => String, update: String => Unit): CryptoSigner = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[CryptoSigner]
    }
    
    @scala.inline
    implicit class CryptoSignerMutableBuilder[Self <: CryptoSigner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdate(value: String => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait JwkCertificate extends StObject {
    
    var alg: String = js.native
    
    var e: String = js.native
    
    var kid: String = js.native
    
    var kty: String = js.native
    
    var n: String = js.native
    
    var use: js.UndefOr[String] = js.native
  }
  object JwkCertificate {
    
    @scala.inline
    def apply(alg: String, e: String, kid: String, kty: String, n: String): JwkCertificate = {
      val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[JwkCertificate]
    }
    
    @scala.inline
    implicit class JwkCertificateMutableBuilder[Self <: JwkCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
}
