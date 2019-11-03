package typings.ethereumjsDashTx

import typings.ethereumjsDashTx.distFakeMod.FakeTransaction
import typings.ethereumjsDashTx.distTypesMod.BufferLike
import typings.ethereumjsDashTx.distTypesMod.FakeTxData
import typings.ethereumjsDashTx.distTypesMod.PrefixedHexString
import typings.ethereumjsDashTx.distTypesMod.TransactionOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-tx/dist/fake", JSImport.Namespace)
@js.native
object distFakeMod extends js.Object {
  @js.native
  trait FakeTransaction
    extends typings.ethereumjsDashTx.distTransactionMod.default {
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
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: FakeTxData, opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
  
}

