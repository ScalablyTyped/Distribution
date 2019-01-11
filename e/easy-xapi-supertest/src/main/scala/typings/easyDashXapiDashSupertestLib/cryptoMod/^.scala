package typings
package easyDashXapiDashSupertestLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createCipher(algorithm: java.lang.String, password: js.Any): easyDashXapiDashSupertestLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: js.Any, iv: js.Any): easyDashXapiDashSupertestLib.cryptoMod.Cipher = js.native
  def createCredentials(details: easyDashXapiDashSupertestLib.cryptoMod.CredentialDetails): easyDashXapiDashSupertestLib.cryptoMod.Credentials = js.native
  def createDecipher(algorithm: java.lang.String, password: js.Any): easyDashXapiDashSupertestLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: js.Any, iv: js.Any): easyDashXapiDashSupertestLib.cryptoMod.Decipher = js.native
  def createDiffieHellman(prime_length: scala.Double): easyDashXapiDashSupertestLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: scala.Double, encoding: java.lang.String): easyDashXapiDashSupertestLib.cryptoMod.DiffieHellman = js.native
  def createHash(algorithm: java.lang.String): easyDashXapiDashSupertestLib.cryptoMod.Hash = js.native
  def createHmac(algorithm: java.lang.String, key: easyDashXapiDashSupertestLib.Buffer): easyDashXapiDashSupertestLib.cryptoMod.Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: java.lang.String): easyDashXapiDashSupertestLib.cryptoMod.Hmac = js.native
  def createSign(algorithm: java.lang.String): easyDashXapiDashSupertestLib.cryptoMod.Signer = js.native
  def createVerify(algorith: java.lang.String): easyDashXapiDashSupertestLib.cryptoMod.Verify = js.native
  def getDiffieHellman(group_name: java.lang.String): easyDashXapiDashSupertestLib.cryptoMod.DiffieHellman = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ easyDashXapiDashSupertestLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* derivedKey */ easyDashXapiDashSupertestLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(password: java.lang.String, salt: java.lang.String, iterations: scala.Double, keylen: scala.Double): easyDashXapiDashSupertestLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): easyDashXapiDashSupertestLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): easyDashXapiDashSupertestLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* buf */ easyDashXapiDashSupertestLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomBytes(size: scala.Double): easyDashXapiDashSupertestLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error, /* buf */ easyDashXapiDashSupertestLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

