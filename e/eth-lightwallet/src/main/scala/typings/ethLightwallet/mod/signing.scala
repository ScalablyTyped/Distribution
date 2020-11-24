package typings.ethLightwallet.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eth-lightwallet", "signing")
@js.native
object signing extends js.Object {
  
  def concatSig(signature: js.Any): String = js.native
  
  def signMsg(keystore: keystore, pwDerivedKey: Uint8Array, rawMsg: String, signingAddress: String): ECSignatureBuffer = js.native
  
  def signMsgHash(keystore: keystore, pwDerivedKey: Uint8Array, msgHash: String, signingAddress: String): ECSignatureBuffer = js.native
  
  def signTx(keystore: keystore, pwDerivedKey: Uint8Array, rawTx: String, signingAddress: String): String = js.native
}
