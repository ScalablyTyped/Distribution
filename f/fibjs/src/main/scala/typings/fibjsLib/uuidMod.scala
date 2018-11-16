package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief uuid 唯一 id 模块
	* @detail 基础模块。提供唯一 id 的创建于操作,```JavaScript,var uuid = require('uuid');,```
	*/
@JSImport("uuid", JSImport.Namespace)
@js.native
object uuidMod extends js.Object {
  val DNS: /* 0 */ scala.Double = js.native
  val OID: /* 2 */ scala.Double = js.native
  val URL: /* 1 */ scala.Double = js.native
  val X509: /* 3 */ scala.Double = js.native
  val hostID: scala.Double = js.native
  def md5(ns: scala.Double, name: java.lang.String): fibjsLib.Class_Buffer = js.native
  def node(): fibjsLib.Class_Buffer = js.native
  def random(): fibjsLib.Class_Buffer = js.native
  def sha1(ns: scala.Double, name: java.lang.String): fibjsLib.Class_Buffer = js.native
  def snowflake(): fibjsLib.Class_Buffer = js.native
}

