package typings.digibyte.mod

import typings.digibyte.mod.Transaction.Input
import typings.digibyte.mod.Transaction.Output
import typings.digibyte.mod.Transaction.UnspentOutput
import typings.digibyte.mod.crypto.Signature
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Transaction")
@js.native
class Transaction () extends js.Object {
  def this(serialized: js.Any) = this()
  val hash: String = js.native
  val id: String = js.native
  var inputs: js.Array[Input] = js.native
  var nid: String = js.native
  var outputs: js.Array[Output] = js.native
  def addData(value: Buffer): this.type = js.native
  def addInput(input: Input): this.type = js.native
  def addOutput(output: Output): this.type = js.native
  def applySignature(sig: Signature): this.type = js.native
  def change(address: String): this.type = js.native
  def change(address: Address): this.type = js.native
  def enableRBF(): this.type = js.native
  def fee(amount: Double): this.type = js.native
  def feePerKb(amount: Double): this.type = js.native
  def from(utxos: js.Array[UnspentOutput]): this.type = js.native
  def getChangeOutput(): Output | Null = js.native
  def getFee(): Double = js.native
  def getLockTime(): Date | Double = js.native
  def hasWitnesses(): Boolean = js.native
  def inspect(): String = js.native
  def isCoinbase(): Boolean = js.native
  def isRBF(): Boolean = js.native
  def lockUntilBlockHeight(height: Double): this.type = js.native
  def lockUntilDate(time: Double): this.type = js.native
  def lockUntilDate(time: Date): this.type = js.native
  def serialize(): String = js.native
  def sign(privateKey: String): this.type = js.native
  def sign(privateKey: PrivateKey): this.type = js.native
  def to(address: String, amount: Double): this.type = js.native
  def to(address: js.Array[Address], amount: Double): this.type = js.native
  def to(address: Address, amount: Double): this.type = js.native
  def verify(): String | Boolean = js.native
}

@JSImport("digibyte", "Transaction")
@js.native
object Transaction extends js.Object {
  @js.native
  class Input () extends js.Object {
    val output: js.UndefOr[Output] = js.native
    val outputIndex: Double = js.native
    val prevTxId: Buffer = js.native
    val script: Script = js.native
    val sequenceNumber: Double = js.native
  }
  
  @js.native
  class Output protected () extends js.Object {
    def this(data: js.Object) = this()
    val satoshis: Double = js.native
    val script: Script = js.native
    def inspect(): String = js.native
    def setScript(script: String): this.type = js.native
    def setScript(script: Script): this.type = js.native
    def setScript(script: Buffer): this.type = js.native
    def toObject(): js.Object = js.native
  }
  
  @js.native
  class UnspentOutput protected () extends js.Object {
    def this(data: js.Object) = this()
    val address: Address = js.native
    val outputIndex: Double = js.native
    val satoshis: Double = js.native
    val script: Script = js.native
    val txId: String = js.native
    def inspect(): String = js.native
    def toObject(): this.type = js.native
  }
  
  /* static members */
  @js.native
  object UnspentOutput extends js.Object {
    def fromObject(o: js.Object): UnspentOutput = js.native
  }
  
}

