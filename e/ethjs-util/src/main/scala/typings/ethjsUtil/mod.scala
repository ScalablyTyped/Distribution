package typings.ethjsUtil

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethjs-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayContainsArray(superset: js.Array[js.Any], subset: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def arrayContainsArray(superset: js.Array[js.Any], subset: js.Array[js.Any], some: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], some.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def fromAscii(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def fromUtf8(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getBinarySize(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinarySize")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getKeys(params: js.Array[js.Any], key: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def getKeys(params: js.Array[js.Any], key: String, allowEmpty: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def intToBuffer(i: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBuffer")(i.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def intToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isHexPrefixed(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexPrefixed")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isHexString(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isHexString(value: String, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def padToEven(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("padToEven")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stripHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toAscii(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toUtf8(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
}
