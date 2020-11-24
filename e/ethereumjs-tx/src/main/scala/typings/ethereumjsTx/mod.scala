package typings.ethereumjsTx

import typings.ethereumjsTx.fakeMod.default
import typings.ethereumjsTx.typesMod.BufferLike
import typings.ethereumjsTx.typesMod.FakeTxData
import typings.ethereumjsTx.typesMod.PrefixedHexString
import typings.ethereumjsTx.typesMod.TransactionOptions
import typings.ethereumjsTx.typesMod.TxData
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-tx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class FakeTransaction () extends default {
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
  
  @js.native
  /**
    * Creates a new transaction from an object with its fields' values.
    *
    * @param data - A transaction can be initialized with its rlp representation, an array containing
    * the value of its fields in order, or an object containing them by name.
    *
    * @param opts - The transaction's options, used to indicate the chain and hardfork the
    * transactions belongs to.
    *
    * @note Transaction objects implement EIP155 by default. To disable it, use the constructor's
    * second parameter to set a chain and hardfork before EIP155 activation (i.e. before Spurious
    * Dragon.)
    *
    * @example
    * ```js
    * const txData = {
    *   nonce: '0x00',
    *   gasPrice: '0x09184e72a000',
    *   gasLimit: '0x2710',
    *   to: '0x0000000000000000000000000000000000000000',
    *   value: '0x00',
    *   data: '0x7f7465737432000000000000000000000000000000000000000000000000000000600057',
    *   v: '0x1c',
    *   r: '0x5e1d3a76fbf824220eafc8c79ad578ad2b67d01b0c2425eb1f1347e8f50882ab',
    *   s: '0x5bd428537f05f9830e93792f90ea6a3e2d1ee84952dd96edbae9f658f831ab13'
    * };
    * const tx = new Transaction(txData);
    * ```
    */
  class Transaction ()
    extends typings.ethereumjsTx.transactionMod.default {
    def this(data: js.Array[BufferLike]) = this()
    def this(data: PrefixedHexString) = this()
    def this(data: TxData) = this()
    def this(data: Buffer) = this()
    def this(data: js.UndefOr[scala.Nothing], opts: TransactionOptions) = this()
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: TxData, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
}
