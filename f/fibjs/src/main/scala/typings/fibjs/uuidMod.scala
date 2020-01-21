package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
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
  val DNS: `0` = js.native
  val OID: `2` = js.native
  val URL: `1` = js.native
  val X509: `3` = js.native
  val hostID: Double = js.native
  def md5(ns: Double, name: String): ClassBuffer = js.native
  def node(): ClassBuffer = js.native
  def random(): ClassBuffer = js.native
  def sha1(ns: Double, name: String): ClassBuffer = js.native
  def snowflake(): ClassBuffer = js.native
}

