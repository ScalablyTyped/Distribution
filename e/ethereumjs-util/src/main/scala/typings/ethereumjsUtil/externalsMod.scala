package typings.ethereumjsUtil

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.bnJs.mod.Endianness
import typings.bnJs.mod.IPrimeName
import typings.bnJs.mod.ReductionContext
import typings.bnJs.mod.^
import typings.ethereumjsUtil.bytesMod._ToBufferInputTypes
import typings.ethereumjsUtil.ethereumjsUtilBooleans.`false`
import typings.ethereumjsUtil.ethereumjsUtilBooleans.`true`
import typings.ethereumjsUtil.ethereumjsUtilInts.`26`
import typings.ethereumjsUtil.ethereumjsUtilStrings.hex
import typings.ethereumjsUtil.typesMod._BufferLike
import typings.node.bufferMod.global.Buffer
import typings.rlp.anon.FnCall
import typings.rlp.mod.Decoded
import typings.rlp.mod.Input
import typings.rlp.mod.NestedUint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalsMod {
  
  @JSImport("ethereumjs-util/dist/externals", "BN")
  @js.native
  open class BN protected ()
    extends ^
       with _BufferLike
       with _ToBufferInputTypes {
    def this(number: String) = this()
    def this(number: js.Array[Double]) = this()
    def this(number: js.typedarray.Uint8Array) = this()
    def this(number: Double) = this()
    def this(number: typings.bnJs.mod.BN) = this()
    def this(number: Buffer) = this()
    def this(number: String, base: Double) = this()
    def this(number: String, base: hex) = this()
    def this(number: String, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double) = this()
    def this(number: js.Array[Double], base: hex) = this()
    def this(number: js.Array[Double], endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Double) = this()
    def this(number: js.typedarray.Uint8Array, base: hex) = this()
    def this(number: js.typedarray.Uint8Array, endian: Endianness) = this()
    def this(number: Double, base: Double) = this()
    def this(number: Double, base: hex) = this()
    def this(number: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double) = this()
    def this(number: typings.bnJs.mod.BN, base: hex) = this()
    def this(number: typings.bnJs.mod.BN, endian: Endianness) = this()
    def this(number: Buffer, base: Double) = this()
    def this(number: Buffer, base: hex) = this()
    def this(number: Buffer, endian: Endianness) = this()
    def this(number: String, base: Double, endian: Endianness) = this()
    def this(number: String, base: Unit, endian: Endianness) = this()
    def this(number: String, base: hex, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
    def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
    def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
    def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
    def this(number: Double, base: Double, endian: Endianness) = this()
    def this(number: Double, base: Unit, endian: Endianness) = this()
    def this(number: Double, base: hex, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
    def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
    def this(number: Buffer, base: Double, endian: Endianness) = this()
    def this(number: Buffer, base: Unit, endian: Endianness) = this()
    def this(number: Buffer, base: hex, endian: Endianness) = this()
  }
  object BN extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("ethereumjs-util/dist/externals", "BN")
    @js.native
    open class ^ protected ()
      extends StObject
         with typings.bnJs.mod.BN {
      def this(number: String) = this()
      def this(number: js.Array[Double]) = this()
      def this(number: js.typedarray.Uint8Array) = this()
      def this(number: Double) = this()
      def this(number: typings.bnJs.mod.BN) = this()
      def this(number: Buffer) = this()
      def this(number: String, base: Double) = this()
      def this(number: String, base: hex) = this()
      def this(number: js.Array[Double], base: Double) = this()
      def this(number: js.Array[Double], base: hex) = this()
      def this(number: js.typedarray.Uint8Array, base: Double) = this()
      def this(number: js.typedarray.Uint8Array, base: hex) = this()
      def this(number: Double, base: Double) = this()
      def this(number: Double, base: hex) = this()
      def this(number: typings.bnJs.mod.BN, base: Double) = this()
      def this(number: typings.bnJs.mod.BN, base: hex) = this()
      def this(number: Buffer, base: Double) = this()
      def this(number: Buffer, base: hex) = this()
      def this(number: String, base: Double, endian: Endianness) = this()
      def this(number: String, base: Unit, endian: Endianness) = this()
      def this(number: String, base: hex, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
      def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
      def this(number: Double, base: Double, endian: Endianness) = this()
      def this(number: Double, base: Unit, endian: Endianness) = this()
      def this(number: Double, base: hex, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
      def this(number: Buffer, base: Double, endian: Endianness) = this()
      def this(number: Buffer, base: Unit, endian: Endianness) = this()
      def this(number: Buffer, base: hex, endian: Endianness) = this()
    }
    
    @JSImport("ethereumjs-util/dist/externals", "BN")
    @js.native
    val ^ : js.Object & (Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ]) = js.native
    /* static member */
    @JSImport("ethereumjs-util/dist/externals", "BN.BN")
    @js.native
    def BN: Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("ethereumjs-util/dist/externals", "BN.BN")
    @js.native
    open class BNCls protected ()
      extends StObject
         with typings.bnJs.mod.BN {
      def this(number: String) = this()
      def this(number: js.Array[Double]) = this()
      def this(number: js.typedarray.Uint8Array) = this()
      def this(number: Double) = this()
      def this(number: typings.bnJs.mod.BN) = this()
      def this(number: Buffer) = this()
      def this(number: String, base: Double) = this()
      def this(number: String, base: hex) = this()
      def this(number: js.Array[Double], base: Double) = this()
      def this(number: js.Array[Double], base: hex) = this()
      def this(number: js.typedarray.Uint8Array, base: Double) = this()
      def this(number: js.typedarray.Uint8Array, base: hex) = this()
      def this(number: Double, base: Double) = this()
      def this(number: Double, base: hex) = this()
      def this(number: typings.bnJs.mod.BN, base: Double) = this()
      def this(number: typings.bnJs.mod.BN, base: hex) = this()
      def this(number: Buffer, base: Double) = this()
      def this(number: Buffer, base: hex) = this()
      def this(number: String, base: Double, endian: Endianness) = this()
      def this(number: String, base: Unit, endian: Endianness) = this()
      def this(number: String, base: hex, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
      def this(number: js.Array[Double], base: Unit, endian: Endianness) = this()
      def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Double, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: Unit, endian: Endianness) = this()
      def this(number: js.typedarray.Uint8Array, base: hex, endian: Endianness) = this()
      def this(number: Double, base: Double, endian: Endianness) = this()
      def this(number: Double, base: Unit, endian: Endianness) = this()
      def this(number: Double, base: hex, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Double, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: Unit, endian: Endianness) = this()
      def this(number: typings.bnJs.mod.BN, base: hex, endian: Endianness) = this()
      def this(number: Buffer, base: Double, endian: Endianness) = this()
      def this(number: Buffer, base: Unit, endian: Endianness) = this()
      def this(number: Buffer, base: hex, endian: Endianness) = this()
    }
    
    inline def BN_=(
      x: Instantiable3[
          /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
          /* base */ js.UndefOr[Double | hex], 
          /* endian */ js.UndefOr[Endianness], 
          typings.bnJs.mod.BN
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BN")(x.asInstanceOf[js.Any])
    
    /**
      * @description returns true if the supplied object is a BN.js instance
      */
    /* static member */
    inline def isBN(b: Any): /* is bn.js.bn.js.BN */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBN")(b.asInstanceOf[js.Any]).asInstanceOf[/* is bn.js.bn.js.BN */ Boolean]
    
    /**
      * @description returns the maximum of 2 BN instances.
      */
    /* static member */
    inline def max(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description returns the minimum of 2 BN instances.
      */
    /* static member */
    inline def min(left: typings.bnJs.mod.BN, right: typings.bnJs.mod.BN): typings.bnJs.mod.BN = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.bnJs.mod.BN]
    
    /**
      * @description  create a reduction context  with the Montgomery trick.
      */
    /* static member */
    inline def mont(num: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("mont")(num.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    
    /**
      * @description  create a reduction context
      */
    /* static member */
    inline def red(reductionContext: typings.bnJs.mod.BN): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    inline def red(reductionContext: IPrimeName): ReductionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(reductionContext.asInstanceOf[js.Any]).asInstanceOf[ReductionContext]
    
    /* static member */
    @JSImport("ethereumjs-util/dist/externals", "BN.wordSize")
    @js.native
    def wordSize: `26` = js.native
    inline def wordSize_=(x: `26`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordSize")(x.asInstanceOf[js.Any])
    
    type _To = js.Object & (Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ])
    
    /* This means you don't have to write `^`, but can instead just say `BN.foo` */
    override def _to: js.Object & (Instantiable3[
        /* number */ Double | String | js.Array[Double] | js.typedarray.Uint8Array | Buffer | typings.bnJs.mod.BN, 
        /* base */ js.UndefOr[Double | hex], 
        /* endian */ js.UndefOr[Endianness], 
        typings.bnJs.mod.BN
      ]) = ^
  }
  
  object rlp {
    
    @JSImport("ethereumjs-util/dist/externals", "rlp")
    @js.native
    val ^ : js.Any = js.native
    
    object default {
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.default")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.default.decode")
      @js.native
      def decode: FnCall = js.native
      inline def decode(input: Input): Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Decoded]
      inline def decode_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
      
      inline def decode_Union(input: Input): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
      
      inline def decode_false(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
      
      inline def decode_true(input: Input, stream: `true`): Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Decoded]
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.default.encode")
      @js.native
      def encode: js.Function1[/* input */ Input, js.typedarray.Uint8Array] = js.native
      inline def encode(input: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      inline def encode_=(x: js.Function1[/* input */ Input, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    }
    
    inline def decode(input: Input): Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Decoded]
    
    inline def decode_Union(input: Input): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
    
    inline def decode_false(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
    
    inline def decode_true(input: Input, stream: `true`): Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Decoded]
    
    inline def encode(input: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    object utils {
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.utils")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.utils.bytesToHex")
      @js.native
      def bytesToHex: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String] = js.native
      inline def bytesToHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def bytesToHex_=(x: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesToHex")(x.asInstanceOf[js.Any])
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.utils.concatBytes")
      @js.native
      def concatBytes: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
      inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
      inline def concatBytes_=(x: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatBytes")(x.asInstanceOf[js.Any])
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.utils.hexToBytes")
      @js.native
      def hexToBytes: js.Function1[/* hex */ String, js.typedarray.Uint8Array] = js.native
      inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      inline def hexToBytes_=(x: js.Function1[/* hex */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexToBytes")(x.asInstanceOf[js.Any])
      
      @JSImport("ethereumjs-util/dist/externals", "rlp.utils.utf8ToBytes")
      @js.native
      def utf8ToBytes: js.Function1[/* utf */ String, js.typedarray.Uint8Array] = js.native
      inline def utf8ToBytes(utf: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ToBytes")(utf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      inline def utf8ToBytes_=(x: js.Function1[/* utf */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8ToBytes")(x.asInstanceOf[js.Any])
    }
  }
}
