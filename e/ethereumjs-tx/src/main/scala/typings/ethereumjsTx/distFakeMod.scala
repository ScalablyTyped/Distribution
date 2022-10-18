package typings.ethereumjsTx

import typings.ethereumjsTx.distTypesMod.BufferLike
import typings.ethereumjsTx.distTypesMod.FakeTxData
import typings.ethereumjsTx.distTypesMod.PrefixedHexString
import typings.ethereumjsTx.distTypesMod.TransactionOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFakeMod {
  
  @JSImport("ethereumjs-tx/dist/fake", JSImport.Default)
  @js.native
  open class default () extends FakeTransaction {
    def this(data: js.Array[BufferLike]) = this()
    def this(data: FakeTxData) = this()
    def this(data: PrefixedHexString) = this()
    def this(data: Buffer) = this()
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: Unit, opts: TransactionOptions) = this()
    def this(data: FakeTxData, opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
  
  @js.native
  trait FakeTransaction
    extends typings.ethereumjsTx.distTransactionMod.default {
    
    /**
      * Set from address to bypass transaction signing.
      * This is not an optional property, as its getter never returns undefined.
      */
    var from: Buffer = js.native
  }
}
