package typings.fernet

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.cryptoJs.mod.Encoder
import typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fernet", JSImport.Namespace)
  @js.native
  val ^ : typings.fernet.mod.fernet = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("fernet", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with Fernet_ {
    def this(options: Options) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("fernet", "Secret")
  @js.native
  open class SecretCls protected ()
    extends StObject
       with Secret {
    def this(secret64: String) = this()
    
    /* CompleteClass */
    override val encryptionKey: WordArray = js.native
    
    /* CompleteClass */
    override val encryptionKeyHex: String = js.native
    
    /* CompleteClass */
    override val signingKey: WordArray = js.native
    
    /* CompleteClass */
    override val signingKeyHex: String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("fernet", "Token")
  @js.native
  open class TokenCls ()
    extends StObject
       with Token {
    def this(options: TokenOptions) = this()
  }
  
  type FernetConstructor = Instantiable1[/* options */ js.UndefOr[Options], Fernet_]
  
  @js.native
  trait Fernet_ extends StObject {
    
    /**
      * Convert array to hex string.
      */
    def ArrayToHex(array: js.Array[String | Double]): String = js.native
    
    var Base64: Encoder = js.native
    
    var Hex: Encoder = js.native
    
    var Secret: SecretConstructor = js.native
    
    var Token: TokenConstructor = js.native
    
    def createHmac(signingKey: String, time: WordArray, iv: WordArray, cipherText: WordArray): WordArray = js.native
    def createHmac(signingKey: WordArray, time: WordArray, iv: WordArray, cipherText: WordArray): WordArray = js.native
    
    def createToken(signingKey: String, time: WordArray, iv: WordArray, cipherText: WordArray): String = js.native
    def createToken(signingKey: WordArray, time: WordArray, iv: WordArray, cipherText: WordArray): String = js.native
    
    /**
      * Convert base64 string to hex string.
      */
    def decode64toHex(str: String): String = js.native
    
    def decryptMessage(cipherText: WordArray, encryptionKey: String, iv: WordArray): String = js.native
    def decryptMessage(cipherText: WordArray, encryptionKey: WordArray, iv: WordArray): String = js.native
    
    def encryptMessage(message: String, encryptionKey: String, iv: WordArray): WordArray = js.native
    def encryptMessage(message: String, encryptionKey: WordArray, iv: WordArray): WordArray = js.native
    def encryptMessage(message: WordArray, encryptionKey: String, iv: WordArray): WordArray = js.native
    def encryptMessage(message: WordArray, encryptionKey: WordArray, iv: WordArray): WordArray = js.native
    
    /**
      * Turn `bits` into number of chars in a hex string.
      */
    def hexBits(bits: Double): Double = js.native
    
    var iv: WordArray = js.native
    
    var ivHex: String = js.native
    
    /**
      * Parse a hex string to an int.
      */
    def parseHex(hexString: String): Double = js.native
    
    var secret: js.UndefOr[Secret] = js.native
    
    def setIV(): String = js.native
    def setIV(ivArray: js.Array[String | Double]): String = js.native
    
    /**
      * Sets the secret from base64 encoded value.
      */
    def setSecret(secret64: String): Secret = js.native
    
    /**
      * Convert provided time or current time into a WordArray.
      */
    def timeBytes(): WordArray = js.native
    def timeBytes(time: js.Date): WordArray = js.native
    def timeBytes(time: Double): WordArray = js.native
    
    var ttl: Double = js.native
    
    /**
      * Makes a base64 string a url-safe base64 string.
      */
    def urlsafe(str: String): String = js.native
    
    var versionHex: String = js.native
  }
  
  trait Options extends StObject {
    
    var iv: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIv(value: js.Array[String | Double]): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setIvVarargs(value: (String | Double)*): Self = StObject.set(x, "iv", js.Array(value*))
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait Secret extends StObject {
    
    val encryptionKey: WordArray
    
    val encryptionKeyHex: String
    
    val signingKey: WordArray
    
    val signingKeyHex: String
  }
  object Secret {
    
    inline def apply(encryptionKey: WordArray, encryptionKeyHex: String, signingKey: WordArray, signingKeyHex: String): Secret = {
      val __obj = js.Dynamic.literal(encryptionKey = encryptionKey.asInstanceOf[js.Any], encryptionKeyHex = encryptionKeyHex.asInstanceOf[js.Any], signingKey = signingKey.asInstanceOf[js.Any], signingKeyHex = signingKeyHex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Secret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
      
      inline def setEncryptionKey(value: WordArray): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionKeyHex(value: String): Self = StObject.set(x, "encryptionKeyHex", value.asInstanceOf[js.Any])
      
      inline def setSigningKey(value: WordArray): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
      
      inline def setSigningKeyHex(value: String): Self = StObject.set(x, "signingKeyHex", value.asInstanceOf[js.Any])
    }
  }
  
  type SecretConstructor = Instantiable1[/* secret64 */ String, Secret]
  
  @js.native
  trait Token extends StObject {
    
    var cipherText: js.UndefOr[WordArray] = js.native
    
    var cipherTextHex: js.UndefOr[String] = js.native
    
    def decode(): String = js.native
    def decode(token: String): String = js.native
    
    def encode(): String = js.native
    def encode(message: String): String = js.native
    
    var encoded: js.UndefOr[Boolean] = js.native
    
    var hmacHex: js.UndefOr[String] = js.native
    
    var iv: js.UndefOr[WordArray] = js.native
    
    var ivHex: js.UndefOr[String] = js.native
    
    var maxClockSkew: Double = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var optsIV: js.UndefOr[js.Array[String | Double]] = js.native
    
    var secret: js.UndefOr[Secret] = js.native
    
    def setIV(): String = js.native
    def setIV(ivArray: js.Array[String | Double]): String = js.native
    @JSName("setIV")
    var setIV_Original: js.Function1[/* ivArray */ js.UndefOr[js.Array[String | Double]], String] = js.native
    
    def setTime(): WordArray = js.native
    def setTime(time: String): WordArray = js.native
    def setTime(time: js.Date): WordArray = js.native
    def setTime(time: Double): WordArray = js.native
    
    var time: js.UndefOr[js.Date | WordArray] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var ttl: Double = js.native
    
    var version: Double = js.native
  }
  
  type TokenConstructor = Instantiable1[/* options */ js.UndefOr[TokenOptions], Token]
  
  trait TokenOptions extends StObject {
    
    var cipherText: js.UndefOr[WordArray] = js.undefined
    
    var iv: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var secret: js.UndefOr[Secret] = js.undefined
    
    var time: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object TokenOptions {
    
    inline def apply(): TokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
      
      inline def setCipherText(value: WordArray): Self = StObject.set(x, "cipherText", value.asInstanceOf[js.Any])
      
      inline def setCipherTextUndefined: Self = StObject.set(x, "cipherText", js.undefined)
      
      inline def setIv(value: js.Array[String | Double]): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setIvVarargs(value: (String | Double)*): Self = StObject.set(x, "iv", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSecret(value: Secret): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setTime(value: String | Double | js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type _To = typings.fernet.mod.fernet
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.fernet.mod.fernet = ^
  
  type fernet = FernetConstructor & Fernet_
}
