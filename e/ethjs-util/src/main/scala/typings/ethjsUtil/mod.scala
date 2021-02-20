package typings.ethjsUtil

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethjs-util", "arrayContainsArray")
  @js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_]): Boolean = js.native
  @JSImport("ethjs-util", "arrayContainsArray")
  @js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_], some: Boolean): Boolean = js.native
  
  @JSImport("ethjs-util", "fromAscii")
  @js.native
  def fromAscii(stringValue: String): String = js.native
  
  @JSImport("ethjs-util", "fromUtf8")
  @js.native
  def fromUtf8(stringValue: String): String = js.native
  
  @JSImport("ethjs-util", "getBinarySize")
  @js.native
  def getBinarySize(str: String): Double = js.native
  
  @JSImport("ethjs-util", "getKeys")
  @js.native
  def getKeys(params: js.Array[_], key: String): js.Array[_] = js.native
  @JSImport("ethjs-util", "getKeys")
  @js.native
  def getKeys(params: js.Array[_], key: String, allowEmpty: Boolean): js.Array[_] = js.native
  
  @JSImport("ethjs-util", "intToBuffer")
  @js.native
  def intToBuffer(i: Double): Buffer = js.native
  
  @JSImport("ethjs-util", "intToHex")
  @js.native
  def intToHex(i: Double): String = js.native
  
  @JSImport("ethjs-util", "isHexPrefixed")
  @js.native
  def isHexPrefixed(str: String): Boolean = js.native
  
  @JSImport("ethjs-util", "isHexString")
  @js.native
  def isHexString(value: String): Boolean = js.native
  @JSImport("ethjs-util", "isHexString")
  @js.native
  def isHexString(value: String, length: Double): Boolean = js.native
  
  @JSImport("ethjs-util", "padToEven")
  @js.native
  def padToEven(value: String): String = js.native
  
  @JSImport("ethjs-util", "stripHexPrefix")
  @js.native
  def stripHexPrefix(str: String): String = js.native
  
  @JSImport("ethjs-util", "toAscii")
  @js.native
  def toAscii(hex: String): String = js.native
  
  @JSImport("ethjs-util", "toUtf8")
  @js.native
  def toUtf8(hex: String): String = js.native
}
