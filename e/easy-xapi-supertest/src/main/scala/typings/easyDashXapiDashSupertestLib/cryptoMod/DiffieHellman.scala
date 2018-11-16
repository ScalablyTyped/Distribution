package typings
package easyDashXapiDashSupertestLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffieHellman extends js.Object {
  def computeSecret(other_public_key: java.lang.String): java.lang.String = js.native
  def computeSecret(other_public_key: java.lang.String, input_encoding: java.lang.String): java.lang.String = js.native
  def computeSecret(
    other_public_key: java.lang.String,
    input_encoding: java.lang.String,
    output_encoding: java.lang.String
  ): java.lang.String = js.native
  def generateKeys(): java.lang.String = js.native
  def generateKeys(encoding: java.lang.String): java.lang.String = js.native
  def getGenerator(encoding: java.lang.String): java.lang.String = js.native
  def getPrime(): java.lang.String = js.native
  def getPrime(encoding: java.lang.String): java.lang.String = js.native
  def getPrivateKey(): java.lang.String = js.native
  def getPrivateKey(encoding: java.lang.String): java.lang.String = js.native
  def getPublicKey(): java.lang.String = js.native
  def getPublicKey(encoding: java.lang.String): java.lang.String = js.native
  def setPrivateKey(public_key: java.lang.String): scala.Unit = js.native
  def setPrivateKey(public_key: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def setPublicKey(public_key: java.lang.String): scala.Unit = js.native
  def setPublicKey(public_key: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
}

