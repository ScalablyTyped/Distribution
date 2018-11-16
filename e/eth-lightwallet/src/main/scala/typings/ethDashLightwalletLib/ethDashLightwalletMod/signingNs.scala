package typings
package ethDashLightwalletLib.ethDashLightwalletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-lightwallet", "signing")
@js.native
object signingNs extends js.Object {
  def concatSig(signature: js.Any): java.lang.String = js.native
  def signMsg(
    keystore: ethDashLightwalletLib.ethDashLightwalletMod.keystore,
    pwDerivedKey: stdLib.Uint8Array,
    rawMsg: java.lang.String,
    signingAddress: java.lang.String
  ): ethDashLightwalletLib.ethDashLightwalletMod.ECSignatureBuffer = js.native
  def signMsgHash(
    keystore: ethDashLightwalletLib.ethDashLightwalletMod.keystore,
    pwDerivedKey: stdLib.Uint8Array,
    msgHash: java.lang.String,
    signingAddress: java.lang.String
  ): ethDashLightwalletLib.ethDashLightwalletMod.ECSignatureBuffer = js.native
  def signTx(
    keystore: ethDashLightwalletLib.ethDashLightwalletMod.keystore,
    pwDerivedKey: stdLib.Uint8Array,
    rawTx: java.lang.String,
    signingAddress: java.lang.String
  ): java.lang.String = js.native
}

