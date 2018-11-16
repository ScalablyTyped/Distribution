package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief http query 处理模块
	* @detail 引用方法：,```JavaScript,var querystring = require('querystring');,```
	*/
@JSImport("querystring", JSImport.Namespace)
@js.native
object querystringMod extends js.Object {
  def escape(str: java.lang.String): java.lang.String = js.native
  def parse(str: java.lang.String): fibjsLib.Class_HttpCollection = js.native
  def parse(str: java.lang.String, sep: java.lang.String): fibjsLib.Class_HttpCollection = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String): fibjsLib.Class_HttpCollection = js.native
  def parse(str: java.lang.String, sep: java.lang.String, eq: java.lang.String, opt: js.Object): fibjsLib.Class_HttpCollection = js.native
  def stringify(obj: js.Object): java.lang.String = js.native
  def stringify(obj: js.Object, sep: java.lang.String): java.lang.String = js.native
  def stringify(obj: js.Object, sep: java.lang.String, eq: java.lang.String): java.lang.String = js.native
  def stringify(obj: js.Object, sep: java.lang.String, eq: java.lang.String, opt: js.Object): java.lang.String = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}

