package typings.ethjsUtil

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethjs-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_]): Boolean = js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_], some: Boolean): Boolean = js.native
  def fromAscii(stringValue: String): String = js.native
  def fromUtf8(stringValue: String): String = js.native
  def getBinarySize(str: String): Double = js.native
  def getKeys(params: js.Array[_], key: String): js.Array[_] = js.native
  def getKeys(params: js.Array[_], key: String, allowEmpty: Boolean): js.Array[_] = js.native
  def intToBuffer(i: Double): Buffer = js.native
  def intToHex(i: Double): String = js.native
  def isHexPrefixed(str: String): Boolean = js.native
  def isHexString(value: String): Boolean = js.native
  def isHexString(value: String, length: Double): Boolean = js.native
  def padToEven(value: String): String = js.native
  def stripHexPrefix(str: String): String = js.native
  def toAscii(hex: String): String = js.native
  def toUtf8(hex: String): String = js.native
}

