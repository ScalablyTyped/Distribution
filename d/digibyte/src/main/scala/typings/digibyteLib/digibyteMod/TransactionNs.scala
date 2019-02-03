package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Transaction")
@js.native
object TransactionNs extends js.Object {
  @js.native
  class Input () extends js.Object {
    val output: js.UndefOr[Output] = js.native
    val outputIndex: scala.Double = js.native
    val prevTxId: nodeLib.Buffer = js.native
    val script: digibyteLib.digibyteMod.Script = js.native
    val sequenceNumber: scala.Double = js.native
  }
  
  @js.native
  class Output protected () extends js.Object {
    def this(data: js.Object) = this()
    val satoshis: scala.Double = js.native
    val script: digibyteLib.digibyteMod.Script = js.native
    def inspect(): java.lang.String = js.native
    def setScript(script: digibyteLib.digibyteMod.Script): this.type = js.native
    def setScript(script: java.lang.String): this.type = js.native
    def setScript(script: nodeLib.Buffer): this.type = js.native
    def toObject(): js.Object = js.native
  }
  
  @js.native
  class UnspentOutput protected () extends js.Object {
    def this(data: js.Object) = this()
    val address: digibyteLib.digibyteMod.Address = js.native
    val outputIndex: scala.Double = js.native
    val satoshis: scala.Double = js.native
    val script: digibyteLib.digibyteMod.Script = js.native
    val txId: java.lang.String = js.native
    def inspect(): java.lang.String = js.native
    def toObject(): this.type = js.native
  }
  
  /* static members */
  @js.native
  object UnspentOutput extends js.Object {
    def fromObject(o: js.Object): digibyteLib.digibyteMod.TransactionNs.UnspentOutput = js.native
  }
  
}

