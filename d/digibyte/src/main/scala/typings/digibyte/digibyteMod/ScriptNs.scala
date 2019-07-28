package typings.digibyte.digibyteMod

import typings.digibyte.digibyteMod.cryptoNs.Signature
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Script")
@js.native
object ScriptNs extends js.Object {
  def buildDataOut(data: String): Script = js.native
  def buildDataOut(data: String, encoding: String): Script = js.native
  def buildDataOut(data: Buffer): Script = js.native
  def buildDataOut(data: Buffer, encoding: String): Script = js.native
  def buildMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = js.native
  def buildMultisigOut(publicKeys: js.Array[PublicKey], threshold: Double, opts: js.Object): Script = js.native
  def buildP2SHMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = js.native
  def buildPublicKeyHashIn(publicKey: PublicKey, signature: Signature, sigtype: Double): Script = js.native
  def buildPublicKeyHashIn(publicKey: PublicKey, signature: Buffer, sigtype: Double): Script = js.native
  def buildPublicKeyHashOut(address: Address): Script = js.native
  def buildPublicKeyIn(signature: Signature, sigtype: Double): Script = js.native
  def buildPublicKeyIn(signature: Buffer, sigtype: Double): Script = js.native
  def buildPublicKeyOut(pubkey: PublicKey): Script = js.native
  def buildScriptHashOut(script: Script): Script = js.native
  def buildWitnessMultisigOutFromScript(script: Script): Script = js.native
  def empty(): Script = js.native
  def fromAddress(address: String): Script = js.native
  def fromAddress(address: Address): Script = js.native
  @js.native
  object types extends js.Object {
    var DATA_OUT: String = js.native
  }
  
}

