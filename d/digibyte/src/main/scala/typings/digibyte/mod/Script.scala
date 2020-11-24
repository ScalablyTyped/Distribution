package typings.digibyte.mod

import typings.digibyte.mod.crypto.Signature
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("digibyte", "Script")
@js.native
class Script protected () extends js.Object {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  
  def add(obj: js.Any): this.type = js.native
  
  def checkMinimalPush(i: Double): Boolean = js.native
  
  def classify(): String = js.native
  
  def classifyInput(): String = js.native
  
  def classifyOutput(): String = js.native
  
  def equals(script: Script): Boolean = js.native
  
  def findAndDelete(script: Script): this.type = js.native
  
  def getAddressInfo(): Address | Boolean = js.native
  
  def getData(): Buffer = js.native
  
  def getPublicKey(): Buffer = js.native
  
  def getPublicKeyHash(): Buffer = js.native
  
  def getSignatureOperationsCount(accurate: Boolean): Double = js.native
  
  def hasCodeseparators(): Boolean = js.native
  
  def isDataOut(): Boolean = js.native
  
  def isMultisigIn(): Boolean = js.native
  
  def isMultisigOut(): Boolean = js.native
  
  def isPublicKeyHashIn(): Boolean = js.native
  
  def isPublicKeyHashOut(): Boolean = js.native
  
  def isPublicKeyIn(): Boolean = js.native
  
  def isPublicKeyOut(): Boolean = js.native
  
  def isPushOnly(): Boolean = js.native
  
  def isScriptHashIn(): Boolean = js.native
  
  def isScriptHashOut(): Boolean = js.native
  
  def isStandard(): Boolean = js.native
  
  def isWitnessProgram(): Boolean = js.native
  
  def isWitnessPublicKeyHashOut(): Boolean = js.native
  
  def isWitnessScriptHashOut(): Boolean = js.native
  
  def prepend(obj: js.Any): this.type = js.native
  
  def removeCodeseparators(): this.type = js.native
  
  def set(obj: js.Object): this.type = js.native
  
  def toASM(): String = js.native
  
  def toAddress(): Address = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toHex(): String = js.native
}
@JSImport("digibyte", "Script")
@js.native
object Script extends js.Object {
  
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
