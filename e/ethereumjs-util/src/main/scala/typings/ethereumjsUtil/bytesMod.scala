package typings.ethereumjsUtil

import typings.ethereumjsUtil.typesMod.TransformableToArray
import typings.ethereumjsUtil.typesMod.TransformableToBuffer
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bytesMod {
  
  @JSImport("ethereumjs-util/dist/bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def baToJSON(ba: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("baToJSON")(ba.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def bufferToHex(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHex")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bufferToInt(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToInt")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fromSigned(num: Buffer): typings.bnJs.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSigned")(num.asInstanceOf[js.Any]).asInstanceOf[typings.bnJs.mod.^]
  
  inline def setLengthLeft(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthLeft")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def setLengthRight(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthRight")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def toBuffer(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")().asInstanceOf[Buffer]
  inline def toBuffer(v: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(v: js.Array[Double]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(v: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(v: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(v: TransformableToArray): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(v: TransformableToBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(v: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(v: Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toUnsigned(num: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnsigned")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def unpadArray(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def unpadBuffer(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def unpadHexString(a: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadHexString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def zeros(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
