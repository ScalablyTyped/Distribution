package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 加密算法模块
  * @detail 使用方法：,```JavaScript,var crypto = require('crypto');,```
  */
object cryptoMod {
  
  @JSImport("crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("crypto", "AES")
  @js.native
  val AES: /* 1 */ Double = js.native
  
  @JSImport("crypto", "ARC4")
  @js.native
  val ARC4: /* 7 */ Double = js.native
  
  @JSImport("crypto", "BLOWFISH")
  @js.native
  val BLOWFISH: /* 6 */ Double = js.native
  
  @JSImport("crypto", "CAMELLIA")
  @js.native
  val CAMELLIA: /* 2 */ Double = js.native
  
  @JSImport("crypto", "CBC")
  @js.native
  val CBC: /* 2 */ Double = js.native
  
  @JSImport("crypto", "CCM")
  @js.native
  val CCM: /* 9 */ Double = js.native
  
  @JSImport("crypto", "CFB128")
  @js.native
  val CFB128: /* 4 */ Double = js.native
  
  @JSImport("crypto", "CFB64")
  @js.native
  val CFB64: /* 3 */ Double = js.native
  
  @JSImport("crypto", "CTR")
  @js.native
  val CTR: /* 6 */ Double = js.native
  
  @JSImport("crypto", "Cipher")
  @js.native
  open class Cipher ()
    extends StObject
       with ClassCipher
  
  @JSImport("crypto", "DES")
  @js.native
  val DES: /* 3 */ Double = js.native
  
  @JSImport("crypto", "DES_EDE")
  @js.native
  val DES_EDE: /* 4 */ Double = js.native
  
  @JSImport("crypto", "DES_EDE3")
  @js.native
  val DES_EDE3: /* 5 */ Double = js.native
  
  @JSImport("crypto", "ECB")
  @js.native
  val ECB: /* 1 */ Double = js.native
  
  @JSImport("crypto", "GCM")
  @js.native
  val GCM: /* 7 */ Double = js.native
  
  @JSImport("crypto", "NOPADDING")
  @js.native
  val NOPADDING: /* 4 */ Double = js.native
  
  @JSImport("crypto", "OFB")
  @js.native
  val OFB: /* 5 */ Double = js.native
  
  @JSImport("crypto", "ONE_AND_ZEROS")
  @js.native
  val ONE_AND_ZEROS: /* 1 */ Double = js.native
  
  @JSImport("crypto", "PKCS7")
  @js.native
  val PKCS7: /* 0 */ Double = js.native
  
  @JSImport("crypto", "PKey")
  @js.native
  open class PKey ()
    extends StObject
       with ClassPKey
  
  @JSImport("crypto", "STREAM")
  @js.native
  val STREAM: /* 8 */ Double = js.native
  
  @JSImport("crypto", "X509Cert")
  @js.native
  open class X509Cert ()
    extends StObject
       with ClassX509Cert
  
  @JSImport("crypto", "X509Crl")
  @js.native
  open class X509Crl ()
    extends StObject
       with ClassX509Crl
  
  @JSImport("crypto", "X509Req")
  @js.native
  open class X509Req ()
    extends StObject
       with ClassX509Req
  
  @JSImport("crypto", "ZEROS")
  @js.native
  val ZEROS: /* 3 */ Double = js.native
  
  @JSImport("crypto", "ZEROS_AND_LEN")
  @js.native
  val ZEROS_AND_LEN: /* 2 */ Double = js.native
  
  inline def createHash(algo: String): ClassDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algo.asInstanceOf[js.Any]).asInstanceOf[ClassDigest]
  
  inline def createHmac(algo: String, key: ClassBuffer): ClassDigest = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algo.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ClassDigest]
  
  inline def loadCert(filename: String): ClassX509Cert = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCert")(filename.asInstanceOf[js.Any]).asInstanceOf[ClassX509Cert]
  
  inline def loadCrl(filename: String): ClassX509Crl = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCrl")(filename.asInstanceOf[js.Any]).asInstanceOf[ClassX509Crl]
  
  inline def loadPKey(filename: String): ClassPKey = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPKey")(filename.asInstanceOf[js.Any]).asInstanceOf[ClassPKey]
  inline def loadPKey(filename: String, password: String): ClassPKey = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPKey")(filename.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[ClassPKey]
  
  inline def loadReq(filename: String): ClassX509Req = ^.asInstanceOf[js.Dynamic].applyDynamic("loadReq")(filename.asInstanceOf[js.Any]).asInstanceOf[ClassX509Req]
  
  inline def pbkdf1(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algoName: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf1")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], size.asInstanceOf[js.Any], algoName.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  inline def pbkdf1(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algo: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf1")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], size.asInstanceOf[js.Any], algo.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def pbkdf2(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algoName: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], size.asInstanceOf[js.Any], algoName.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  inline def pbkdf2(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algo: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], size.asInstanceOf[js.Any], algo.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def pseudoRandomBytes(size: Double): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  
  inline def randomArt(data: ClassBuffer, title: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomArt")(data.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomArt(data: ClassBuffer, title: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomArt")(data.asInstanceOf[js.Any], title.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def randomBytes(size: Double): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  
  inline def simpleRandomBytes(size: Double): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
}
