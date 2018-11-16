package typings
package fibjsLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object cryptoModMembers extends js.Object {
  val AES: /* 1 */ scala.Double = js.native
  val ARC4: /* 7 */ scala.Double = js.native
  val BLOWFISH: /* 6 */ scala.Double = js.native
  val CAMELLIA: /* 2 */ scala.Double = js.native
  val CBC: /* 2 */ scala.Double = js.native
  val CCM: /* 9 */ scala.Double = js.native
  val CFB128: /* 4 */ scala.Double = js.native
  val CFB64: /* 3 */ scala.Double = js.native
  val CTR: /* 6 */ scala.Double = js.native
  val DES: /* 3 */ scala.Double = js.native
  val DES_EDE: /* 4 */ scala.Double = js.native
  val DES_EDE3: /* 5 */ scala.Double = js.native
  val ECB: /* 1 */ scala.Double = js.native
  val GCM: /* 7 */ scala.Double = js.native
  val NOPADDING: /* 4 */ scala.Double = js.native
  val OFB: /* 5 */ scala.Double = js.native
  val ONE_AND_ZEROS: /* 1 */ scala.Double = js.native
  val PKCS7: /* 0 */ scala.Double = js.native
  val STREAM: /* 8 */ scala.Double = js.native
  val ZEROS: /* 3 */ scala.Double = js.native
  val ZEROS_AND_LEN: /* 2 */ scala.Double = js.native
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

