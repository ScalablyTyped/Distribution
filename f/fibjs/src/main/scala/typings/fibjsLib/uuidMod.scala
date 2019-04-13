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
  val DNS: fibjsLib.fibjsLibNumbers.`0` = js.native
  val OID: fibjsLib.fibjsLibNumbers.`2` = js.native
  val URL: fibjsLib.fibjsLibNumbers.`1` = js.native
  val X509: fibjsLib.fibjsLibNumbers.`3` = js.native
  val hostID: scala.Double = js.native
  def md5(ns: scala.Double, name: java.lang.String): fibjsLib.Class_Buffer = js.native
  def node(): fibjsLib.Class_Buffer = js.native
  def random(): fibjsLib.Class_Buffer = js.native
  def sha1(ns: scala.Double, name: java.lang.String): fibjsLib.Class_Buffer = js.native
  def snowflake(): fibjsLib.Class_Buffer = js.native
}

