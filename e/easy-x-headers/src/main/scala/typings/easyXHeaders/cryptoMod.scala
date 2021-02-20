package typings.easyXHeaders

import typings.easyXHeaders.easyXHeadersStrings.buffer
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("crypto", "createCipher")
  @js.native
  def createCipher(algorithm: String, password: js.Any): Cipher = js.native
  
  @JSImport("crypto", "createCipheriv")
  @js.native
  def createCipheriv(algorithm: String, key: js.Any, iv: js.Any): Cipher = js.native
  
  @JSImport("crypto", "createCredentials")
  @js.native
  def createCredentials(details: CredentialDetails): Credentials = js.native
  
  @JSImport("crypto", "createDecipher")
  @js.native
  def createDecipher(algorithm: String, password: js.Any): Decipher = js.native
  
  @JSImport("crypto", "createDecipheriv")
  @js.native
  def createDecipheriv(algorithm: String, key: js.Any, iv: js.Any): Decipher = js.native
  
  @JSImport("crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime_length: Double): DiffieHellman = js.native
  @JSImport("crypto", "createDiffieHellman")
  @js.native
  def createDiffieHellman(prime: Double, encoding: String): DiffieHellman = js.native
  
  @JSImport("crypto", "createHash")
  @js.native
  def createHash(algorithm: String): Hash = js.native
  
  @JSImport("crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: String): Hmac = js.native
  @JSImport("crypto", "createHmac")
  @js.native
  def createHmac(algorithm: String, key: Buffer): Hmac = js.native
  
  @JSImport("crypto", "createSign")
  @js.native
  def createSign(algorithm: String): Signer = js.native
  
  @JSImport("crypto", "createVerify")
  @js.native
  def createVerify(algorith: String): Verify = js.native
  
  @JSImport("crypto", "getDiffieHellman")
  @js.native
  def getDiffieHellman(group_name: String): DiffieHellman = js.native
  
  @JSImport("crypto", "pbkdf2")
  @js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  @JSImport("crypto", "pbkdf2")
  @js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  
  @JSImport("crypto", "pbkdf2Sync")
  @js.native
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double): Buffer = js.native
  @JSImport("crypto", "pbkdf2Sync")
  @js.native
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  
  @JSImport("crypto", "pseudoRandomBytes")
  @js.native
  def pseudoRandomBytes(size: Double): Buffer = js.native
  @JSImport("crypto", "pseudoRandomBytes")
  @js.native
  def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ Error, /* buf */ Buffer, Unit]): Unit = js.native
  
  @JSImport("crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double): Buffer = js.native
  @JSImport("crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double, callback: js.Function2[/* err */ Error, /* buf */ Buffer, Unit]): Unit = js.native
  
  @js.native
  trait Cipher extends StObject {
    
    def `final`(): Buffer = js.native
    def `final`(output_encoding: String): String = js.native
    
    def setAutoPadding(auto_padding: Boolean): Unit = js.native
    
    def update(data: String): String = js.native
    def update(data: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: String): String = js.native
    def update(data: String, input_encoding: String): String = js.native
    def update(data: String, input_encoding: String, output_encoding: String): String = js.native
    def update(data: Buffer): Buffer = js.native
  }
  
  @js.native
  trait CredentialDetails extends StObject {
    
    var ca: js.Any = js.native
    
    var cert: String = js.native
    
    //string | string array
    var ciphers: String = js.native
    
    //string | string array
    var crl: js.Any = js.native
    
    var key: String = js.native
    
    var passphrase: String = js.native
    
    var pfx: String = js.native
  }
  object CredentialDetails {
    
    @scala.inline
    def apply(
      ca: js.Any,
      cert: String,
      ciphers: String,
      crl: js.Any,
      key: String,
      passphrase: String,
      pfx: String
    ): CredentialDetails = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], ciphers = ciphers.asInstanceOf[js.Any], crl = crl.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialDetails]
    }
    
    @scala.inline
    implicit class CredentialDetailsMutableBuilder[Self <: CredentialDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrl(value: js.Any): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  @js.native
  trait Decipher extends StObject {
    
    def `final`(): Buffer = js.native
    def `final`(output_encoding: String): String = js.native
    
    def setAutoPadding(auto_padding: Boolean): Unit = js.native
    
    def update(data: String): String = js.native
    def update(data: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: String): String = js.native
    def update(data: String, input_encoding: String): String = js.native
    def update(data: String, input_encoding: String, output_encoding: String): String = js.native
    def update(data: Buffer): Buffer = js.native
  }
  
  @js.native
  trait DiffieHellman extends StObject {
    
    def computeSecret(other_public_key: String): String = js.native
    def computeSecret(other_public_key: String, input_encoding: js.UndefOr[scala.Nothing], output_encoding: String): String = js.native
    def computeSecret(other_public_key: String, input_encoding: String): String = js.native
    def computeSecret(other_public_key: String, input_encoding: String, output_encoding: String): String = js.native
    
    def generateKeys(): String = js.native
    def generateKeys(encoding: String): String = js.native
    
    def getGenerator(encoding: String): String = js.native
    
    def getPrime(): String = js.native
    def getPrime(encoding: String): String = js.native
    
    def getPrivateKey(): String = js.native
    def getPrivateKey(encoding: String): String = js.native
    
    def getPublicKey(): String = js.native
    def getPublicKey(encoding: String): String = js.native
    
    def setPrivateKey(public_key: String): Unit = js.native
    def setPrivateKey(public_key: String, encoding: String): Unit = js.native
    
    def setPublicKey(public_key: String): Unit = js.native
    def setPublicKey(public_key: String, encoding: String): Unit = js.native
  }
  
  @js.native
  trait Hash extends StObject {
    
    def digest(): Buffer = js.native
    def digest(encoding: String): js.Any = js.native
    @JSName("digest")
    def digest_buffer(encoding: buffer): Buffer = js.native
    
    def update(data: js.Any): Hash = js.native
    def update(data: js.Any, input_encoding: String): Hash = js.native
  }
  
  @js.native
  trait Hmac extends StObject {
    
    def digest(): Buffer = js.native
    def digest(encoding: String): js.Any = js.native
    @JSName("digest")
    def digest_buffer(encoding: buffer): Buffer = js.native
    
    def update(data: js.Any): Hmac = js.native
    def update(data: js.Any, input_encoding: String): Hmac = js.native
  }
  
  @js.native
  trait Signer extends StObject {
    
    def sign(private_key: String, output_format: String): String = js.native
    
    def update(data: js.Any): Unit = js.native
  }
  object Signer {
    
    @scala.inline
    def apply(sign: (String, String) => String, update: js.Any => Unit): Signer = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Signer]
    }
    
    @scala.inline
    implicit class SignerMutableBuilder[Self <: Signer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdate(value: js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Verify extends StObject {
    
    def update(data: js.Any): Unit = js.native
    
    def verify(`object`: String, signature: String): Boolean = js.native
    def verify(`object`: String, signature: String, signature_format: String): Boolean = js.native
  }
}
