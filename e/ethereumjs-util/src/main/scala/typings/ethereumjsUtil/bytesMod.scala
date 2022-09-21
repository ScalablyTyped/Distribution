package typings.ethereumjsUtil

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsUtil.externalsMod.BN
import typings.ethereumjsUtil.typesMod.NestedBufferArray
import typings.ethereumjsUtil.typesMod.NestedUint8Array
import typings.ethereumjsUtil.typesMod.PrefixedHexString
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bytesMod {
  
  @JSImport("ethereumjs-util/dist/bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arrToBufArr(arr: js.typedarray.Uint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  inline def arrToBufArr(arr: NestedUint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  
  inline def arrToBufArr_Buffer(arr: js.typedarray.Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def arrToBufArr_NestedBufferArray(arr: NestedUint8Array): NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedBufferArray]
  
  inline def baToJSON(ba: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("baToJSON")(ba.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def bufArrToArr(arr: NestedBufferArray): NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedUint8Array]
  inline def bufArrToArr(arr: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bufArrToArr_Union(arr: NestedBufferArray): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  inline def bufArrToArr_Union(arr: Buffer): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  
  inline def bufferToHex(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHex")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bufferToInt(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToInt")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromSigned(num: Buffer): BN = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSigned")(num.asInstanceOf[js.Any]).asInstanceOf[BN]
  
  inline def intToBuffer(i: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBuffer")(i.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def intToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setLengthLeft(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthLeft")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def setLengthRight(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthRight")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def toBuffer(v: ToBufferInputTypes): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toUnsigned(num: BN): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnsigned")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toUtf8(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unpadArray(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def unpadBuffer(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def unpadHexString(a: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadHexString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateNoLeadingZeroes(values: StringDictionary[js.UndefOr[Buffer]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoLeadingZeroes")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def zeros(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethereumjsUtil.typesMod.PrefixedHexString
    - scala.Double
    - typings.ethereumjsUtil.externalsMod.BN
    - typings.node.bufferMod.global.Buffer
    - js.typedarray.Uint8Array
    - js.Array[scala.Double]
    - typings.ethereumjsUtil.typesMod.TransformableToArray
    - typings.ethereumjsUtil.typesMod.TransformableToBuffer
    - scala.Null
    - scala.Unit
  */
  type ToBufferInputTypes = js.UndefOr[
    _ToBufferInputTypes | js.Array[Double] | PrefixedHexString | Double | Buffer | js.typedarray.Uint8Array | Null
  ]
  
  trait _ToBufferInputTypes extends StObject
}
