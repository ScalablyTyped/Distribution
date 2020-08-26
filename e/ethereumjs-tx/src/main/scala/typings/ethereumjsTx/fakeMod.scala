package typings.ethereumjsTx

import typings.ethereumjsTx.typesMod.BufferLike
import typings.ethereumjsTx.typesMod.FakeTxData
import typings.ethereumjsTx.typesMod.PrefixedHexString
import typings.ethereumjsTx.typesMod.TransactionOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-tx/dist/fake", JSImport.Namespace)
@js.native
object fakeMod extends js.Object {
  @js.native
  trait FakeTransaction
    extends typings.ethereumjsTx.transactionMod.default {
    /**
      * Set from address to bypass transaction signing.
      * This is not an optional property, as its getter never returns undefined.
      */
    var from: Buffer = js.native
  }
  
  @js.native
  class default () extends FakeTransaction {
    def this(data: js.Array[BufferLike]) = this()
    def this(data: FakeTxData) = this()
    def this(data: PrefixedHexString) = this()
    def this(data: Buffer) = this()
    def this(data: js.UndefOr[scala.Nothing], opts: TransactionOptions) = this()
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: FakeTxData, opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
  
}

