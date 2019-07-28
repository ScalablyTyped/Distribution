package typings.fibjs.cryptoMod

import typings.fibjs.Class_Buffer
import typings.fibjs.Class_Digest
import typings.fibjs.Class_PKey
import typings.fibjs.Class_X509Cert
import typings.fibjs.Class_X509Crl
import typings.fibjs.Class_X509Req
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

@JSImport("crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def createHash(algo: String): Class_Digest = js.native
  def createHmac(algo: String, key: Class_Buffer): Class_Digest = js.native
  def loadCert(filename: String): Class_X509Cert = js.native
  def loadCrl(filename: String): Class_X509Crl = js.native
  def loadPKey(filename: String): Class_PKey = js.native
  def loadPKey(filename: String, password: String): Class_PKey = js.native
  def loadReq(filename: String): Class_X509Req = js.native
  def pbkdf1(password: Class_Buffer, salt: Class_Buffer, iterations: Double, size: Double, algoName: String): Class_Buffer = js.native
  def pbkdf1(password: Class_Buffer, salt: Class_Buffer, iterations: Double, size: Double, algo: Double): Class_Buffer = js.native
  def pbkdf2(password: Class_Buffer, salt: Class_Buffer, iterations: Double, size: Double, algoName: String): Class_Buffer = js.native
  def pbkdf2(password: Class_Buffer, salt: Class_Buffer, iterations: Double, size: Double, algo: Double): Class_Buffer = js.native
  def pseudoRandomBytes(size: Double): Class_Buffer = js.native
  def randomArt(data: Class_Buffer, title: String): String = js.native
  def randomArt(data: Class_Buffer, title: String, size: Double): String = js.native
  def randomBytes(size: Double): Class_Buffer = js.native
  def simpleRandomBytes(size: Double): Class_Buffer = js.native
}

