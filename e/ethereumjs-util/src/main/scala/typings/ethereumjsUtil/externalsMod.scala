package typings.ethereumjsUtil

import typings.bnJs.mod.Endianness
import typings.bnJs.mod.IPrimeName
import typings.bnJs.mod.ReductionContext
import typings.bnJs.mod.^
import typings.ethereumjsUtil.ethereumjsUtilStrings.hex
import typings.node.Buffer
import typings.rlp.typesMod.Decoded
import typings.rlp.typesMod.Input
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalsMod {
  
  @JSImport("ethereumjs-util/dist/externals", "BN")
  @js.native
  class BN protected () extends ^ {
    def this(number: String) = this()
    def this(number: js.Array[Double]) = this()
    def this(number: Double) = this()
    def this(number: typings.bnJs.mod.BN) = this()
    def this(number: Buffer) = this()
    def this(number: Uint8Array) = this()
    def this(number: String, base: Double) = this()
    def this(number: String, base: hex) = this()
    def this(number: String, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double) = this()
    def this(number: js.Array[Double], base: hex) = this()
    def this(number: js.Array[Double], endian: Endianness) = this()
    def this(number: Double, base: Double) = this()
    def this(number: Double, base: hex) = this()
    def this(number: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double) = this()
    def this(number: typings.bnJs.mod.BN, base: hex) = this()
    def this(number: typings.bnJs.mod.BN, endian: Endianness) = this()
    def this(number: Buffer, base: Double) = this()
    def this(number: Buffer, base: hex) = this()
    def this(number: Buffer, endian: Endianness) = this()
    def this(number: Uint8Array, base: Double) = this()
    def this(number: Uint8Array, base: hex) = this()
    def this(number: Uint8Array, endian: Endianness) = this()
    def this(number: String, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: Double, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
    def this(number: Uint8Array, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
    def this(number: Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: Uint8Array, base: hex, endian: Endianness) = this()
  }
  object BN {
    
    /**
      * @description returns true if the supplied object is a BN.js instance
      */
    /* static member */
    @JSImport("ethereumjs-util/dist/externals", "BN.isBN")
    @js.native
    def isBN(b: js.Any): /* is bn.js.bn.js.BN */ Boolean = js.native
    
    /**
      * @description returns the maximum of 2 BN instances.
      */
    /* static member */
    @JSImport("ethereumjs-util/dist/externals", "BN.max")
    @js.native
    def max(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = js.native
    
    /**
      * @description returns the minimum of 2 BN instances.
      */
    /* static member */
    @JSImport("ethereumjs-util/dist/externals", "BN.min")
    @js.native
    def min(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = js.native
    
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    /* static member */
    @JSImport("ethereumjs-util/dist/externals", "BN.mont")
    @js.native
    def mont(num: typings.bnJs.mod.BN): ReductionContext = js.native
    
    /**
      * @description  create a reduction context
      */
    /* static member */
    @JSImport("ethereumjs-util/dist/externals", "BN.red")
    @js.native
    def red(reductionContext: typings.bnJs.mod.BN): ReductionContext = js.native
    @JSImport("ethereumjs-util/dist/externals", "BN.red")
    @js.native
    def red(reductionContext: IPrimeName): ReductionContext = js.native
  }
  
  object rlp {
    
    @JSImport("ethereumjs-util/dist/externals", "rlp.decode")
    @js.native
    def decode(input: js.Array[Buffer]): js.Array[Buffer] = js.native
    @JSImport("ethereumjs-util/dist/externals", "rlp.decode")
    @js.native
    def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = js.native
    @JSImport("ethereumjs-util/dist/externals", "rlp.decode")
    @js.native
    def decode(input: Buffer): Buffer = js.native
    @JSImport("ethereumjs-util/dist/externals", "rlp.decode")
    @js.native
    def decode(input: Buffer, stream: Boolean): Buffer = js.native
    @JSImport("ethereumjs-util/dist/externals", "rlp.decode")
    @js.native
    def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = js.native
    @JSImport("ethereumjs-util/dist/externals", "rlp.decode")
    @js.native
    def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = js.native
    
    @JSImport("ethereumjs-util/dist/externals", "rlp.encode")
    @js.native
    def encode(input: Input): Buffer = js.native
    
    @JSImport("ethereumjs-util/dist/externals", "rlp.getLength")
    @js.native
    def getLength(input: Input): Buffer | Double = js.native
  }
}
