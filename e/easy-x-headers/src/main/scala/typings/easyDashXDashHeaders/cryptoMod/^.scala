package typings.easyDashXDashHeaders.cryptoMod

import typings.easyDashXDashHeaders.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createCipher(algorithm: String, password: js.Any): Cipher = js.native
  def createCipheriv(algorithm: String, key: js.Any, iv: js.Any): Cipher = js.native
  def createCredentials(details: CredentialDetails): Credentials = js.native
  def createDecipher(algorithm: String, password: js.Any): Decipher = js.native
  def createDecipheriv(algorithm: String, key: js.Any, iv: js.Any): Decipher = js.native
  def createDiffieHellman(prime_length: Double): DiffieHellman = js.native
  def createDiffieHellman(prime: Double, encoding: String): DiffieHellman = js.native
  def createHash(algorithm: String): Hash = js.native
  def createHmac(algorithm: String, key: String): Hmac = js.native
  def createHmac(algorithm: String, key: Buffer): Hmac = js.native
  def createSign(algorithm: String): Signer = js.native
  def createVerify(algorith: String): Verify = js.native
  def getDiffieHellman(group_name: String): DiffieHellman = js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double): Buffer = js.native
  def pbkdf2Sync(password: String, salt: String, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  def pseudoRandomBytes(size: Double): Buffer = js.native
  def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ Error, /* buf */ Buffer, Unit]): Unit = js.native
  def randomBytes(size: Double): Buffer = js.native
  def randomBytes(size: Double, callback: js.Function2[/* err */ Error, /* buf */ Buffer, Unit]): Unit = js.native
}

