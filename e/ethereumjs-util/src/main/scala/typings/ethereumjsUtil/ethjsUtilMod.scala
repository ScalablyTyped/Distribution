package typings.ethereumjsUtil

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ethjsUtilMod {
  
  @JSImport("ethjs-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description Returns TRUE if the first specified array contains all elements
    *              from the second one. FALSE otherwise. If `some` is true, will
    *              return true if first specified array contain some elements of
    *              the second.
    */
  @scala.inline
  def arrayContainsArray(superset: js.Array[js.Any], subset: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def arrayContainsArray(superset: js.Array[js.Any], subset: js.Array[js.Any], some: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], some.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of ascii string
    */
  @scala.inline
  def fromAscii(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Should be called to get hex representation (prefixed by 0x) of utf8 string
    */
  @scala.inline
  def fromUtf8(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Get the binary size of a string
    */
  @scala.inline
  def getBinarySize(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinarySize")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @description getKeys([{a: 1, b: 2}, {a: 3, b: 4}], 'a') => [1, 3]
    */
  @scala.inline
  def getKeys(params: js.Array[js.Any], key: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def getKeys(params: js.Array[js.Any], key: String, allowEmpty: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * @description Converts an `Number` to a `Buffer`
    */
  @scala.inline
  def intToBuffer(i: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBuffer")(i.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * @description Converts a `Number` into a hex `String`
    */
  @scala.inline
  def intToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Returns a `Boolean` on whether or not the a `String` starts with '0x'
    */
  @scala.inline
  def isHexPrefixed(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexPrefixed")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * @description check if string is hex string of specific length
    */
  @scala.inline
  def isHexString(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isHexString(value: String, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @description Pads a `String` to have an even length
    */
  @scala.inline
  def padToEven(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("padToEven")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Removes '0x' from a given `String` if present
    */
  @scala.inline
  def stripHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Should be called to get ascii from it's hex representation
    */
  @scala.inline
  def toAscii(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @description Should be called to get utf8 from it's hex representation
    */
  @scala.inline
  def toUtf8(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
}
