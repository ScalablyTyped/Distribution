package typings
package ethDashLightwalletLib.ethDashLightwalletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-lightwallet", "keystore")
@js.native
class keystore () extends js.Object {
  def exportPrivateKey(address: java.lang.String, pwDerivedKey: stdLib.Uint8Array): java.lang.String = js.native
  def generateNewAddress(pwDerivedKey: stdLib.Uint8Array, numberOfAddresses: scala.Double): scala.Unit = js.native
  def getAddresses(): js.Array[java.lang.String] = js.native
  def getSeed(pwDerivedKey: stdLib.Uint8Array): java.lang.String = js.native
  def isDerivedKeyCorrect(pwDerivedKey: stdLib.Uint8Array): scala.Boolean = js.native
  def keyFromPassword(password: java.lang.String): stdLib.Uint8Array = js.native
  def keyFromPassword(
    password: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* pwDerivedKey */ stdLib.Uint8Array, scala.Unit]
  ): stdLib.Uint8Array = js.native
  def serialize(): java.lang.String = js.native
}

/* static members */
@JSImport("eth-lightwallet", "keystore")
@js.native
object keystore extends js.Object {
  def createVault(options: js.Any): ethDashLightwalletLib.ethDashLightwalletMod.keystore = js.native
  def createVault(
    options: js.Any,
    callback: js.Function2[/* error */ stdLib.Error, /* keystore */ this.type, scala.Unit]
  ): ethDashLightwalletLib.ethDashLightwalletMod.keystore = js.native
  def deserialize(keystore: java.lang.String): ethDashLightwalletLib.ethDashLightwalletMod.keystore = js.native
  def generateRandomSeed(): java.lang.String = js.native
  def isSeedValid(seed: java.lang.String): scala.Boolean = js.native
}

