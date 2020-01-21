package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`5`
import typings.fibjs.fibjsNumbers.`6`
import typings.fibjs.fibjsNumbers.`7`
import typings.fibjs.fibjsNumbers.`8`
import typings.fibjs.fibjsNumbers.`9`
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
  
  val AES: `1` = js.native
  val ARC4: `7` = js.native
  val BLOWFISH: `6` = js.native
  val CAMELLIA: `2` = js.native
  val CBC: `2` = js.native
  val CCM: `9` = js.native
  val CFB128: `4` = js.native
  val CFB64: `3` = js.native
  val CTR: `6` = js.native
  val DES: `3` = js.native
  val DES_EDE: `4` = js.native
  val DES_EDE3: `5` = js.native
  val ECB: `1` = js.native
  val GCM: `7` = js.native
  val NOPADDING: `4` = js.native
  val OFB: `5` = js.native
  val ONE_AND_ZEROS: `1` = js.native
  val PKCS7: `0` = js.native
  val STREAM: `8` = js.native
  val ZEROS: `3` = js.native
  val ZEROS_AND_LEN: `2` = js.native
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

