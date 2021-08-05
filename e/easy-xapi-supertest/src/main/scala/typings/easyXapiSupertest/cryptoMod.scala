package typings.easyXapiSupertest

import typings.easyXapiSupertest.easyXapiSupertestStrings.buffer
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCipher(algorithm: String, password: js.Any): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  
  inline def createCipheriv(algorithm: String, key: js.Any, iv: js.Any): Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Cipher]
  
  inline def createCredentials(details: CredentialDetails): Credentials = ^.asInstanceOf[js.Dynamic].applyDynamic("createCredentials")(details.asInstanceOf[js.Any]).asInstanceOf[Credentials]
  
  inline def createDecipher(algorithm: String, password: js.Any): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Decipher]
  
  inline def createDecipheriv(algorithm: String, key: js.Any, iv: js.Any): Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Decipher]
  
  inline def createDiffieHellman(prime_length: Double): DiffieHellman = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime_length.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman]
  inline def createDiffieHellman(prime: Double, encoding: String): DiffieHellman = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman]
  
  inline def createHash(algorithm: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  inline def createHmac(algorithm: String, key: String): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def createHmac(algorithm: String, key: Buffer): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  
  inline def createSign(algorithm: String): Signer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Signer]
  
  inline def createVerify(algorith: String): Verify = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorith.asInstanceOf[js.Any]).asInstanceOf[Verify]
  
  inline def getDiffieHellman(group_name: String): DiffieHellman = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(group_name.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman]
  
  inline def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def pseudoRandomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ Error, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def randomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def randomBytes(size: Double, callback: js.Function2[/* err */ Error, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Cipher extends StObject {
    
    def `final`(): Buffer = js.native
    def `final`(output_encoding: String): String = js.native
    
    def setAutoPadding(auto_padding: Boolean): Unit = js.native
    
    def update(data: String): String = js.native
    def update(data: String, input_encoding: String): String = js.native
    def update(data: String, input_encoding: String, output_encoding: String): String = js.native
    def update(data: String, input_encoding: Unit, output_encoding: String): String = js.native
    def update(data: Buffer): Buffer = js.native
  }
  
  trait CredentialDetails extends StObject {
    
    var ca: js.Any
    
    var cert: String
    
    //string | string array
    var ciphers: String
    
    //string | string array
    var crl: js.Any
    
    var key: String
    
    var passphrase: String
    
    var pfx: String
  }
  object CredentialDetails {
    
    inline def apply(
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
    
    extension [Self <: CredentialDetails](x: Self) {
      
      inline def setCa(value: js.Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCrl(value: js.Any): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    }
  }
  
  trait Credentials extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  @js.native
  trait Decipher extends StObject {
    
    def `final`(): Buffer = js.native
    def `final`(output_encoding: String): String = js.native
    
    def setAutoPadding(auto_padding: Boolean): Unit = js.native
    
    def update(data: String): String = js.native
    def update(data: String, input_encoding: String): String = js.native
    def update(data: String, input_encoding: String, output_encoding: String): String = js.native
    def update(data: String, input_encoding: Unit, output_encoding: String): String = js.native
    def update(data: Buffer): Buffer = js.native
  }
  
  @js.native
  trait DiffieHellman extends StObject {
    
    def computeSecret(other_public_key: String): String = js.native
    def computeSecret(other_public_key: String, input_encoding: String): String = js.native
    def computeSecret(other_public_key: String, input_encoding: String, output_encoding: String): String = js.native
    def computeSecret(other_public_key: String, input_encoding: Unit, output_encoding: String): String = js.native
    
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
  
  trait Signer extends StObject {
    
    def sign(private_key: String, output_format: String): String
    
    def update(data: js.Any): Unit
  }
  object Signer {
    
    inline def apply(sign: (String, String) => String, update: js.Any => Unit): Signer = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Signer]
    }
    
    extension [Self <: Signer](x: Self) {
      
      inline def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      inline def setUpdate(value: js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Verify extends StObject {
    
    def update(data: js.Any): Unit = js.native
    
    def verify(`object`: String, signature: String): Boolean = js.native
    def verify(`object`: String, signature: String, signature_format: String): Boolean = js.native
  }
}
