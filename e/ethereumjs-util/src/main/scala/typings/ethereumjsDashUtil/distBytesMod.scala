package typings.ethereumjsDashUtil

import typings.bnDotJs.bnDotJsMod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-util/dist/bytes", JSImport.Namespace)
@js.native
object distBytesMod extends js.Object {
  def addHexPrefix(str: String): String = js.native
  def baToJSON(ba: js.Any): js.Any = js.native
  def bufferToHex(buf: Buffer): String = js.native
  def bufferToInt(buf: Buffer): Double = js.native
  def fromSigned(num: Buffer): ^ = js.native
  def setLength(msg: js.Any, length: Double): js.Any = js.native
  def setLength(msg: js.Any, length: Double, right: Boolean): js.Any = js.native
  def setLengthLeft(msg: js.Any, length: Double): js.Any = js.native
  def setLengthLeft(msg: js.Any, length: Double, right: Boolean): js.Any = js.native
  def setLengthRight(msg: js.Any, length: Double): js.Any = js.native
  def stripZeros(a: js.Any): js.Any = js.native
  def toBuffer(v: js.Any): Buffer = js.native
  def toUnsigned(num: ^): Buffer = js.native
  def unpad(a: js.Any): js.Any = js.native
  def zeros(bytes: Double): Buffer = js.native
}

