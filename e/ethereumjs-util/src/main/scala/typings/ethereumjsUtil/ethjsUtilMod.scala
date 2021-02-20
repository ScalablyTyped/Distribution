package typings.ethereumjsUtil

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ethjsUtilMod {
  
  /**
    * @description Returns TRUE if the first specified array contains all elements
    *              from the second one. FALSE otherwise. If `some` is true, will
    *              return true if first specified array contain some elements of
    *              the second.
    */
  @JSImport("ethjs-util", "arrayContainsArray")
  @js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_]): Boolean = js.native
  @JSImport("ethjs-util", "arrayContainsArray")
  @js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_], some: Boolean): Boolean = js.native
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of ascii string
    */
  @JSImport("ethjs-util", "fromAscii")
  @js.native
  def fromAscii(stringValue: String): String = js.native
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of utf8 string
    */
  @JSImport("ethjs-util", "fromUtf8")
  @js.native
  def fromUtf8(stringValue: String): String = js.native
  
  /**
    * @description Get the binary size of a string
    */
  @JSImport("ethjs-util", "getBinarySize")
  @js.native
  def getBinarySize(str: String): Double = js.native
  
  /**
    * @description getKeys([{a: 1, b: 2}, {a: 3, b: 4}], 'a') => [1, 3]
    */
  @JSImport("ethjs-util", "getKeys")
  @js.native
  def getKeys(params: js.Array[_], key: String): js.Array[_] = js.native
  @JSImport("ethjs-util", "getKeys")
  @js.native
  def getKeys(params: js.Array[_], key: String, allowEmpty: Boolean): js.Array[_] = js.native
  
  /**
    * @description Converts an `Number` to a `Buffer`
    */
  @JSImport("ethjs-util", "intToBuffer")
  @js.native
  def intToBuffer(i: Double): Buffer = js.native
  
  /**
    * @description Converts a `Number` into a hex `String`
    */
  @JSImport("ethjs-util", "intToHex")
  @js.native
  def intToHex(i: Double): String = js.native
  
  /**
    * @description Returns a `Boolean` on whether or not the a `String` starts with '0x'
    */
  @JSImport("ethjs-util", "isHexPrefixed")
  @js.native
  def isHexPrefixed(str: String): Boolean = js.native
  
  /**
    * @description check if string is hex string of specific length
    */
  @JSImport("ethjs-util", "isHexString")
  @js.native
  def isHexString(value: String): Boolean = js.native
  @JSImport("ethjs-util", "isHexString")
  @js.native
  def isHexString(value: String, length: Double): Boolean = js.native
  
  /**
    * @description Pads a `String` to have an even length
    */
  @JSImport("ethjs-util", "padToEven")
  @js.native
  def padToEven(value: String): String = js.native
  
  /**
    * @description Removes '0x' from a given `String` if present
    */
  @JSImport("ethjs-util", "stripHexPrefix")
  @js.native
  def stripHexPrefix(str: String): String = js.native
  
  /**
    * @description Should be called to get ascii from it's hex representation
    */
  @JSImport("ethjs-util", "toAscii")
  @js.native
  def toAscii(hex: String): String = js.native
  
  /**
    * @description Should be called to get utf8 from it's hex representation
    */
  @JSImport("ethjs-util", "toUtf8")
  @js.native
  def toUtf8(hex: String): String = js.native
}
