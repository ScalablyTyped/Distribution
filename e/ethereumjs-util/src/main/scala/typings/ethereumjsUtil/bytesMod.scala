package typings.ethereumjsUtil

import typings.bnJs.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/bytes", JSImport.Namespace)
@js.native
object bytesMod extends js.Object {
  def addHexPrefix(str: String): String = js.native
  def baToJSON(ba: js.Any): js.Any = js.native
  def bufferToHex(buf: Buffer): String = js.native
  def bufferToInt(buf: Buffer): Double = js.native
  def fromSigned(num: Buffer): ^ = js.native
  def setLengthLeft(msg: Buffer, length: Double): Buffer = js.native
  def setLengthRight(msg: Buffer, length: Double): Buffer = js.native
  def toBuffer(v: js.Any): Buffer = js.native
  def toUnsigned(num: ^): Buffer = js.native
  def unpadArray(a: js.Array[Double]): js.Array[Double] = js.native
  def unpadBuffer(a: Buffer): Buffer = js.native
  def unpadHexString(a: String): String = js.native
  def zeros(bytes: Double): Buffer = js.native
}

