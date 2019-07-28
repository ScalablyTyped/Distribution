package typings.easyDashXDashHeaders.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffieHellman extends js.Object {
  def computeSecret(other_public_key: String): String = js.native
  def computeSecret(other_public_key: String, input_encoding: String): String = js.native
  def computeSecret(other_public_key: String, input_encoding: String, output_encoding: String): String = js.native
  def generateKeys(): String = js.native
  def generateKeys(encoding: String): String = js.native
  def getGenerator(encoding: String): String = js.native
  def getPrime(): String = js.native
  def getPrime(encoding: String): String = js.native
  def getPrivateKey(): String = js.native
  def getPrivateKey(encoding: String): String = js.native
  def getPublicKey(): String = js.native
  def getPublicKey(encoding: String): String = js.native
  def setPrivateKey(public_key: String): Unit = js.native
  def setPrivateKey(public_key: String, encoding: String): Unit = js.native
  def setPublicKey(public_key: String): Unit = js.native
  def setPublicKey(public_key: String, encoding: String): Unit = js.native
}

