package typings.ethereumjsUtil

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethjs-util", JSImport.Namespace)
@js.native
object ethjsUtilMod extends js.Object {
  
  /**
    * @description Returns TRUE if the first specified array contains all elements
    *              from the second one. FALSE otherwise. If `some` is true, will
    *              return true if first specified array contain some elements of
    *              the second.
    */
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_]): Boolean = js.native
  def arrayContainsArray(superset: js.Array[_], subset: js.Array[_], some: Boolean): Boolean = js.native
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of ascii string
    */
  def fromAscii(stringValue: String): String = js.native
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of utf8 string
    */
  def fromUtf8(stringValue: String): String = js.native
  
  /**
    * @description Get the binary size of a string
    */
  def getBinarySize(str: String): Double = js.native
  
  /**
    * @description getKeys([{a: 1, b: 2}, {a: 3, b: 4}], 'a') => [1, 3]
    */
  def getKeys(params: js.Array[_], key: String): js.Array[_] = js.native
  def getKeys(params: js.Array[_], key: String, allowEmpty: Boolean): js.Array[_] = js.native
  
  /**
    * @description Converts an `Number` to a `Buffer`
    */
  def intToBuffer(i: Double): Buffer = js.native
  
  /**
    * @description Converts a `Number` into a hex `String`
    */
  def intToHex(i: Double): String = js.native
  
  /**
    * @description Returns a `Boolean` on whether or not the a `String` starts with '0x'
    */
  def isHexPrefixed(str: String): Boolean = js.native
  
  /**
    * @description check if string is hex string of specific length
    */
  def isHexString(value: String): Boolean = js.native
  def isHexString(value: String, length: Double): Boolean = js.native
  
  /**
    * @description Pads a `String` to have an even length
    */
  def padToEven(value: String): String = js.native
  
  /**
    * @description Removes '0x' from a given `String` if present
    */
  def stripHexPrefix(str: String): String = js.native
  
  /**
    * @description Should be called to get ascii from it's hex representation
    */
  def toAscii(hex: String): String = js.native
  
  /**
    * @description Should be called to get utf8 from it's hex representation
    */
  def toUtf8(hex: String): String = js.native
}
