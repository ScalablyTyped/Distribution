package typings
package easyDashXDashHeadersLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object cryptoModMembers extends js.Object {
  def createCipher(algorithm: java.lang.String, password: js.Any): Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: js.Any, iv: js.Any): Cipher = js.native
  def createCredentials(details: CredentialDetails): Credentials = js.native
  def createDecipher(algorithm: java.lang.String, password: js.Any): Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: js.Any, iv: js.Any): Decipher = js.native
  def createDiffieHellman(prime_length: scala.Double): DiffieHellman = js.native
  def createDiffieHellman(prime: scala.Double, encoding: java.lang.String): DiffieHellman = js.native
  def createHash(algorithm: java.lang.String): Hash = js.native
  def createHmac(algorithm: java.lang.String, key: easyDashXDashHeadersLib.Buffer): Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: java.lang.String): Hmac = js.native
  def createSign(algorithm: java.lang.String): Signer = js.native
  def createVerify(algorith: java.lang.String): Verify = js.native
  def getDiffieHellman(group_name: java.lang.String): DiffieHellman = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ easyDashXDashHeadersLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ easyDashXDashHeadersLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(password: java.lang.String, salt: java.lang.String, iterations: scala.Double, keylen: scala.Double): easyDashXDashHeadersLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): easyDashXDashHeadersLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): easyDashXDashHeadersLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* buf */ easyDashXDashHeadersLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomBytes(size: scala.Double): easyDashXDashHeadersLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* buf */ easyDashXDashHeadersLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

