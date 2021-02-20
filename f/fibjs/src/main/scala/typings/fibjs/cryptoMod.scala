package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 加密算法模块
  * @detail 使用方法：,```JavaScript,var crypto = require('crypto');,```
  */
object cryptoMod {
  
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
  class Cipher () extends ClassCipher
  
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
  class PKey () extends ClassPKey
  
  @JSImport("crypto", "STREAM")
  @js.native
  val STREAM: /* 8 */ Double = js.native
  
  @JSImport("crypto", "X509Cert")
  @js.native
  class X509Cert () extends ClassX509Cert
  
  @JSImport("crypto", "X509Crl")
  @js.native
  class X509Crl () extends ClassX509Crl
  
  @JSImport("crypto", "X509Req")
  @js.native
  class X509Req () extends ClassX509Req
  
  @JSImport("crypto", "ZEROS")
  @js.native
  val ZEROS: /* 3 */ Double = js.native
  
  @JSImport("crypto", "ZEROS_AND_LEN")
  @js.native
  val ZEROS_AND_LEN: /* 2 */ Double = js.native
  
  @JSImport("crypto", "createHash")
  @js.native
  def createHash(algo: String): ClassDigest = js.native
  
  @JSImport("crypto", "createHmac")
  @js.native
  def createHmac(algo: String, key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("crypto", "loadCert")
  @js.native
  def loadCert(filename: String): ClassX509Cert = js.native
  
  @JSImport("crypto", "loadCrl")
  @js.native
  def loadCrl(filename: String): ClassX509Crl = js.native
  
  @JSImport("crypto", "loadPKey")
  @js.native
  def loadPKey(filename: String): ClassPKey = js.native
  @JSImport("crypto", "loadPKey")
  @js.native
  def loadPKey(filename: String, password: String): ClassPKey = js.native
  
  @JSImport("crypto", "loadReq")
  @js.native
  def loadReq(filename: String): ClassX509Req = js.native
  
  @JSImport("crypto", "pbkdf1")
  @js.native
  def pbkdf1(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algoName: String): ClassBuffer = js.native
  @JSImport("crypto", "pbkdf1")
  @js.native
  def pbkdf1(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algo: Double): ClassBuffer = js.native
  
  @JSImport("crypto", "pbkdf2")
  @js.native
  def pbkdf2(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algoName: String): ClassBuffer = js.native
  @JSImport("crypto", "pbkdf2")
  @js.native
  def pbkdf2(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algo: Double): ClassBuffer = js.native
  
  @JSImport("crypto", "pseudoRandomBytes")
  @js.native
  def pseudoRandomBytes(size: Double): ClassBuffer = js.native
  
  @JSImport("crypto", "randomArt")
  @js.native
  def randomArt(data: ClassBuffer, title: String): String = js.native
  @JSImport("crypto", "randomArt")
  @js.native
  def randomArt(data: ClassBuffer, title: String, size: Double): String = js.native
  
  @JSImport("crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double): ClassBuffer = js.native
  
  @JSImport("crypto", "simpleRandomBytes")
  @js.native
  def simpleRandomBytes(size: Double): ClassBuffer = js.native
}
