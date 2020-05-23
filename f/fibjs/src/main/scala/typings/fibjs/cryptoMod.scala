package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief 加密算法模块
  * @detail 使用方法：,```JavaScript,var crypto = require('crypto');,```
  */
@JSImport("crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  @js.native
  class Cipher () extends ClassCipher
  
  @js.native
  class PKey () extends ClassPKey
  
  @js.native
  class X509Cert () extends ClassX509Cert
  
  @js.native
  class X509Crl () extends ClassX509Crl
  
  @js.native
  class X509Req () extends ClassX509Req
  
  val AES: /* 1 */ Double = js.native
  val ARC4: /* 7 */ Double = js.native
  val BLOWFISH: /* 6 */ Double = js.native
  val CAMELLIA: /* 2 */ Double = js.native
  val CBC: /* 2 */ Double = js.native
  val CCM: /* 9 */ Double = js.native
  val CFB128: /* 4 */ Double = js.native
  val CFB64: /* 3 */ Double = js.native
  val CTR: /* 6 */ Double = js.native
  val DES: /* 3 */ Double = js.native
  val DES_EDE: /* 4 */ Double = js.native
  val DES_EDE3: /* 5 */ Double = js.native
  val ECB: /* 1 */ Double = js.native
  val GCM: /* 7 */ Double = js.native
  val NOPADDING: /* 4 */ Double = js.native
  val OFB: /* 5 */ Double = js.native
  val ONE_AND_ZEROS: /* 1 */ Double = js.native
  val PKCS7: /* 0 */ Double = js.native
  val STREAM: /* 8 */ Double = js.native
  val ZEROS: /* 3 */ Double = js.native
  val ZEROS_AND_LEN: /* 2 */ Double = js.native
  def createHash(algo: String): ClassDigest = js.native
  def createHmac(algo: String, key: ClassBuffer): ClassDigest = js.native
  def loadCert(filename: String): ClassX509Cert = js.native
  def loadCrl(filename: String): ClassX509Crl = js.native
  def loadPKey(filename: String): ClassPKey = js.native
  def loadPKey(filename: String, password: String): ClassPKey = js.native
  def loadReq(filename: String): ClassX509Req = js.native
  def pbkdf1(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algoName: String): ClassBuffer = js.native
  def pbkdf1(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algo: Double): ClassBuffer = js.native
  def pbkdf2(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algoName: String): ClassBuffer = js.native
  def pbkdf2(password: ClassBuffer, salt: ClassBuffer, iterations: Double, size: Double, algo: Double): ClassBuffer = js.native
  def pseudoRandomBytes(size: Double): ClassBuffer = js.native
  def randomArt(data: ClassBuffer, title: String): String = js.native
  def randomArt(data: ClassBuffer, title: String, size: Double): String = js.native
  def randomBytes(size: Double): ClassBuffer = js.native
  def simpleRandomBytes(size: Double): ClassBuffer = js.native
}

