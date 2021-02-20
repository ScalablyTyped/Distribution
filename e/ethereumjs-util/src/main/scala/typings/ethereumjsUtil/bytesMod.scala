package typings.ethereumjsUtil

import typings.bnJs.mod.^
import typings.ethereumjsUtil.typesMod.TransformableToArray
import typings.ethereumjsUtil.typesMod.TransformableToBuffer
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bytesMod {
  
  @JSImport("ethereumjs-util/dist/bytes", "addHexPrefix")
  @js.native
  def addHexPrefix(str: String): String = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "baToJSON")
  @js.native
  def baToJSON(ba: js.Any): js.Any = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "bufferToHex")
  @js.native
  def bufferToHex(buf: Buffer): String = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "bufferToInt")
  @js.native
  def bufferToInt(buf: Buffer): Double = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "fromSigned")
  @js.native
  def fromSigned(num: Buffer): ^ = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "setLengthLeft")
  @js.native
  def setLengthLeft(msg: Buffer, length: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "setLengthRight")
  @js.native
  def setLengthRight(msg: Buffer, length: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: String): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: js.Array[Double]): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: Double): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: ^): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: TransformableToArray): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: TransformableToBuffer): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util/dist/bytes", "toBuffer")
  @js.native
  def toBuffer(v: Uint8Array): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "toUnsigned")
  @js.native
  def toUnsigned(num: ^): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "unpadArray")
  @js.native
  def unpadArray(a: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "unpadBuffer")
  @js.native
  def unpadBuffer(a: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "unpadHexString")
  @js.native
  def unpadHexString(a: String): String = js.native
  
  @JSImport("ethereumjs-util/dist/bytes", "zeros")
  @js.native
  def zeros(bytes: Double): Buffer = js.native
}
