package typings.ethereumjsRlp

import typings.ethereumjsRlp.anon.FnCall
import typings.ethereumjsRlp.ethereumjsRlpBooleans.`false`
import typings.ethereumjsRlp.ethereumjsRlpBooleans.`true`
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethereumjs/rlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object RLP {
    
    @JSImport("@ethereumjs/rlp", "RLP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ethereumjs/rlp", "RLP.decode")
    @js.native
    def decode: FnCall = js.native
    inline def decode(input: Input): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
    inline def decode_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    inline def decode_Decoded(input: Input): Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Decoded]
    
    inline def decode_false(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
    
    inline def decode_true(input: Input, stream: `true`): Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Decoded]
    
    @JSImport("@ethereumjs/rlp", "RLP.encode")
    @js.native
    def encode: js.Function1[/* input */ Input, js.typedarray.Uint8Array] = js.native
    inline def encode(input: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def encode_=(x: js.Function1[/* input */ Input, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
  }
  
  inline def decode(input: Input): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  
  inline def decode_Decoded(input: Input): Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Decoded]
  
  inline def decode_false(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  
  inline def decode_true(input: Input, stream: `true`): Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Decoded]
  
  inline def encode(input: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  object utils {
    
    @JSImport("@ethereumjs/rlp", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ethereumjs/rlp", "utils.bytesToHex")
    @js.native
    def bytesToHex: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String] = js.native
    inline def bytesToHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def bytesToHex_=(x: js.Function1[/* uint8a */ js.typedarray.Uint8Array, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytesToHex")(x.asInstanceOf[js.Any])
    
    @JSImport("@ethereumjs/rlp", "utils.concatBytes")
    @js.native
    def concatBytes: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = js.native
    inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
    inline def concatBytes_=(x: js.Function1[/* repeated */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatBytes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ethereumjs/rlp", "utils.hexToBytes")
    @js.native
    def hexToBytes: js.Function1[/* hex */ String, js.typedarray.Uint8Array] = js.native
    inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def hexToBytes_=(x: js.Function1[/* hex */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexToBytes")(x.asInstanceOf[js.Any])
    
    @JSImport("@ethereumjs/rlp", "utils.utf8ToBytes")
    @js.native
    def utf8ToBytes: js.Function1[/* utf */ String, js.typedarray.Uint8Array] = js.native
    inline def utf8ToBytes(utf: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ToBytes")(utf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def utf8ToBytes_=(x: js.Function1[/* utf */ String, js.typedarray.Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf8ToBytes")(x.asInstanceOf[js.Any])
  }
  
  trait Decoded extends StObject {
    
    var data: js.typedarray.Uint8Array | NestedUint8Array
    
    var remainder: js.typedarray.Uint8Array
  }
  object Decoded {
    
    inline def apply(data: js.typedarray.Uint8Array | NestedUint8Array, remainder: js.typedarray.Uint8Array): Decoded = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoded]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decoded] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array | NestedUint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRemainder(value: js.typedarray.Uint8Array): Self = StObject.set(x, "remainder", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Input = string | number | bigint | std.Uint8Array | std.Array<@ethereumjs/rlp.@ethereumjs/rlp.Input> | null | undefined
  }}}
  to avoid circular code involving: 
  - @ethereumjs/rlp.@ethereumjs/rlp.Input
  */
  type Input = js.UndefOr[String | Double | js.BigInt | js.typedarray.Uint8Array | js.Array[Any] | Null]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NestedUint8Array = std.Array<std.Uint8Array | @ethereumjs/rlp.@ethereumjs/rlp.NestedUint8Array>
  }}}
  to avoid circular code involving: 
  - @ethereumjs/rlp.@ethereumjs/rlp.NestedUint8Array
  */
  @js.native
  trait NestedUint8Array
    extends StObject
       with Array[js.typedarray.Uint8Array | NestedUint8Array]
}
