package typings
package fibjsLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AES: fibjsLib.fibjsLibNumbers.`1` = js.native
  val ARC4: fibjsLib.fibjsLibNumbers.`7` = js.native
  val BLOWFISH: fibjsLib.fibjsLibNumbers.`6` = js.native
  val CAMELLIA: fibjsLib.fibjsLibNumbers.`2` = js.native
  val CBC: fibjsLib.fibjsLibNumbers.`2` = js.native
  val CCM: fibjsLib.fibjsLibNumbers.`9` = js.native
  val CFB128: fibjsLib.fibjsLibNumbers.`4` = js.native
  val CFB64: fibjsLib.fibjsLibNumbers.`3` = js.native
  val CTR: fibjsLib.fibjsLibNumbers.`6` = js.native
  val DES: fibjsLib.fibjsLibNumbers.`3` = js.native
  val DES_EDE: fibjsLib.fibjsLibNumbers.`4` = js.native
  val DES_EDE3: fibjsLib.fibjsLibNumbers.`5` = js.native
  val ECB: fibjsLib.fibjsLibNumbers.`1` = js.native
  val GCM: fibjsLib.fibjsLibNumbers.`7` = js.native
  val NOPADDING: fibjsLib.fibjsLibNumbers.`4` = js.native
  val OFB: fibjsLib.fibjsLibNumbers.`5` = js.native
  val ONE_AND_ZEROS: fibjsLib.fibjsLibNumbers.`1` = js.native
  val PKCS7: fibjsLib.fibjsLibNumbers.`0` = js.native
  val STREAM: fibjsLib.fibjsLibNumbers.`8` = js.native
  val ZEROS: fibjsLib.fibjsLibNumbers.`3` = js.native
  val ZEROS_AND_LEN: fibjsLib.fibjsLibNumbers.`2` = js.native
  def createHash(algo: java.lang.String): fibjsLib.Class_Digest = js.native
  def createHmac(algo: java.lang.String, key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def loadCert(filename: java.lang.String): fibjsLib.Class_X509Cert = js.native
  def loadCrl(filename: java.lang.String): fibjsLib.Class_X509Crl = js.native
  def loadPKey(filename: java.lang.String): fibjsLib.Class_PKey = js.native
  def loadPKey(filename: java.lang.String, password: java.lang.String): fibjsLib.Class_PKey = js.native
  def loadReq(filename: java.lang.String): fibjsLib.Class_X509Req = js.native
  def pbkdf1(
    password: fibjsLib.Class_Buffer,
    salt: fibjsLib.Class_Buffer,
    iterations: scala.Double,
    size: scala.Double,
    algoName: java.lang.String
  ): fibjsLib.Class_Buffer = js.native
  def pbkdf1(
    password: fibjsLib.Class_Buffer,
    salt: fibjsLib.Class_Buffer,
    iterations: scala.Double,
    size: scala.Double,
    algo: scala.Double
  ): fibjsLib.Class_Buffer = js.native
  def pbkdf2(
    password: fibjsLib.Class_Buffer,
    salt: fibjsLib.Class_Buffer,
    iterations: scala.Double,
    size: scala.Double,
    algoName: java.lang.String
  ): fibjsLib.Class_Buffer = js.native
  def pbkdf2(
    password: fibjsLib.Class_Buffer,
    salt: fibjsLib.Class_Buffer,
    iterations: scala.Double,
    size: scala.Double,
    algo: scala.Double
  ): fibjsLib.Class_Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): fibjsLib.Class_Buffer = js.native
  def randomArt(data: fibjsLib.Class_Buffer, title: java.lang.String): java.lang.String = js.native
  def randomArt(data: fibjsLib.Class_Buffer, title: java.lang.String, size: scala.Double): java.lang.String = js.native
  def randomBytes(size: scala.Double): fibjsLib.Class_Buffer = js.native
  def simpleRandomBytes(size: scala.Double): fibjsLib.Class_Buffer = js.native
}

