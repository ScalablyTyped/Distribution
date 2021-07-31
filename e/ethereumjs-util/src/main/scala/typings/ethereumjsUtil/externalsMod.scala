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
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: Unit, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: Unit, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: Unit, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
    def this(number: Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: Uint8Array, base: Unit, endian: Endianness) = this()
    def this(number: Uint8Array, base: hex, endian: Endianness) = this()
  }
  object BN {
    
    @JSImport("ethereumjs-util/dist/externals", "BN")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @description returns true if the supplied object is a BN.js instance
      */
    /* static member */
    @scala.inline
    def isBN(b: js.Any): /* is bn.js.bn.js.BN */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBN")(b.asInstanceOf[js.Any]).asInstanceOf[/* is bn.js.bn.js.BN */ Boolean]
    
    /**
      * @description returns the maximum of 2 BN instances.
      */
    /* static member */
    @scala.inline
    def max(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description returns the minimum of 2 BN instances.
      */
    /* static member */
    @scala.inline
    def min(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    /* static member */
    @scala.inline
    def mont(num: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("mont")(num.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    
    /**
      * @description  create a reduction context
      */
    /* static member */
    @scala.inline
    def red(reductionContext: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    @scala.inline
    def red(reductionContext: IPrimeName): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
  }
  
  object rlp {
    
    @JSImport("ethereumjs-util/dist/externals", "rlp")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decode(input: js.Array[Buffer]): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
    @scala.inline
    def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
    @scala.inline
    def decode(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    @scala.inline
    def decode(input: Buffer, stream: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer] | Buffer | Decoded]
    @scala.inline
    def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer] | Buffer | Decoded]
    
    @scala.inline
    def encode(input: Input): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def getLength(input: Input): Buffer | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer | Double]
  }
}
