package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Script")
@js.native
object ScriptNs extends js.Object {
  def buildDataOut(data: java.lang.String): digibyteLib.digibyteMod.Script = js.native
  def buildDataOut(data: java.lang.String, encoding: java.lang.String): digibyteLib.digibyteMod.Script = js.native
  def buildDataOut(data: nodeLib.Buffer): digibyteLib.digibyteMod.Script = js.native
  def buildDataOut(data: nodeLib.Buffer, encoding: java.lang.String): digibyteLib.digibyteMod.Script = js.native
  def buildMultisigIn(
    pubkeys: js.Array[digibyteLib.digibyteMod.PublicKey],
    threshold: scala.Double,
    signatures: js.Array[nodeLib.Buffer],
    opts: js.Object
  ): digibyteLib.digibyteMod.Script = js.native
  def buildMultisigOut(publicKeys: js.Array[digibyteLib.digibyteMod.PublicKey], threshold: scala.Double, opts: js.Object): digibyteLib.digibyteMod.Script = js.native
  def buildP2SHMultisigIn(
    pubkeys: js.Array[digibyteLib.digibyteMod.PublicKey],
    threshold: scala.Double,
    signatures: js.Array[nodeLib.Buffer],
    opts: js.Object
  ): digibyteLib.digibyteMod.Script = js.native
  def buildPublicKeyHashIn(
    publicKey: digibyteLib.digibyteMod.PublicKey,
    signature: digibyteLib.digibyteMod.cryptoNs.Signature,
    sigtype: scala.Double
  ): digibyteLib.digibyteMod.Script = js.native
  def buildPublicKeyHashIn(publicKey: digibyteLib.digibyteMod.PublicKey, signature: nodeLib.Buffer, sigtype: scala.Double): digibyteLib.digibyteMod.Script = js.native
  def buildPublicKeyHashOut(address: digibyteLib.digibyteMod.Address): digibyteLib.digibyteMod.Script = js.native
  def buildPublicKeyIn(signature: digibyteLib.digibyteMod.cryptoNs.Signature, sigtype: scala.Double): digibyteLib.digibyteMod.Script = js.native
  def buildPublicKeyIn(signature: nodeLib.Buffer, sigtype: scala.Double): digibyteLib.digibyteMod.Script = js.native
  def buildPublicKeyOut(pubkey: digibyteLib.digibyteMod.PublicKey): digibyteLib.digibyteMod.Script = js.native
  def buildScriptHashOut(script: digibyteLib.digibyteMod.Script): digibyteLib.digibyteMod.Script = js.native
  def buildWitnessMultisigOutFromScript(script: digibyteLib.digibyteMod.Script): digibyteLib.digibyteMod.Script = js.native
  def empty(): digibyteLib.digibyteMod.Script = js.native
  def fromAddress(address: digibyteLib.digibyteMod.Address): digibyteLib.digibyteMod.Script = js.native
  def fromAddress(address: java.lang.String): digibyteLib.digibyteMod.Script = js.native
  @js.native
  object types extends js.Object {
    var DATA_OUT: java.lang.String = js.native
  }
  
}

