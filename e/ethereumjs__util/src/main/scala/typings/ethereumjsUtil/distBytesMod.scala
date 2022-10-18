package typings.ethereumjsUtil

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsUtil.distTypesMod.NestedBufferArray
import typings.ethereumjsUtil.distTypesMod.NestedUint8Array
import typings.ethereumjsUtil.distTypesMod.PrefixedHexString
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBytesMod {
  
  @JSImport("@ethereumjs/util/dist/bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arrToBufArr(arr: js.typedarray.Uint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  inline def arrToBufArr(arr: NestedUint8Array): NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedBufferArray]
  
  inline def arrToBufArr_Buffer(arr: js.typedarray.Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def arrToBufArr_Union(arr: NestedUint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  
  inline def baToJSON(ba: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("baToJSON")(ba.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def bigIntToBuffer(num: js.BigInt): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntToBuffer")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bigIntToHex(num: js.BigInt): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntToHex")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bigIntToUnpaddedBuffer(value: js.BigInt): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntToUnpaddedBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bufArrToArr(arr: NestedBufferArray): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  inline def bufArrToArr(arr: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bufArrToArr_NestedUint8Array(arr: NestedBufferArray): NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedUint8Array]
  
  inline def bufArrToArr_Union(arr: Buffer): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  
  inline def bufferToBigInt(buf: Buffer): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToBigInt")(buf.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def bufferToHex(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHex")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bufferToInt(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToInt")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromSigned(num: Buffer): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSigned")(num.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def intToBuffer(i: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBuffer")(i.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def intToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setLengthLeft(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthLeft")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def setLengthRight(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthRight")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def short(buffer: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def short(buffer: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def short(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def short(buffer: Buffer, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toBuffer(v: ToBufferInputTypes): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toUnsigned(num: js.BigInt): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnsigned")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toUtf8(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unpadArray(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def unpadBuffer(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def unpadHexString(a: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadHexString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateNoLeadingZeroes(values: StringDictionary[js.UndefOr[Buffer]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoLeadingZeroes")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def zeros(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethereumjsUtil.distTypesMod.PrefixedHexString
    - scala.Double
    - js.BigInt
    - typings.node.bufferMod.global.Buffer
    - js.typedarray.Uint8Array
    - js.Array[scala.Double]
    - typings.ethereumjsUtil.distTypesMod.TransformableToArray
    - typings.ethereumjsUtil.distTypesMod.TransformableToBuffer
    - scala.Null
    - scala.Unit
  */
  type ToBufferInputTypes = js.UndefOr[
    _ToBufferInputTypes | js.Array[Double] | PrefixedHexString | Double | js.BigInt | Buffer | js.typedarray.Uint8Array | Null
  ]
  
  trait _ToBufferInputTypes extends StObject
  object _ToBufferInputTypes {
    
    inline def TransformableToArray(toArray: () => js.typedarray.Uint8Array): typings.ethereumjsUtil.distTypesMod.TransformableToArray = {
      val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[typings.ethereumjsUtil.distTypesMod.TransformableToArray]
    }
    
    inline def TransformableToBuffer(toBuffer: () => Buffer): typings.ethereumjsUtil.distTypesMod.TransformableToBuffer = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[typings.ethereumjsUtil.distTypesMod.TransformableToBuffer]
    }
  }
}
