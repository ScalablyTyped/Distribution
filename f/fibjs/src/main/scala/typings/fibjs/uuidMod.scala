package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief uuid 唯一 id 模块
  * @detail 基础模块。提供唯一 id 的创建于操作,```JavaScript,var uuid = require('uuid');,```
  */
@JSImport("uuid", JSImport.Namespace)
@js.native
object uuidMod extends js.Object {
  
  val DNS: /* 0 */ Double = js.native
  
  val OID: /* 2 */ Double = js.native
  
  val URL: /* 1 */ Double = js.native
  
  val X509: /* 3 */ Double = js.native
  
  val hostID: Double = js.native
  
  def md5(ns: Double, name: String): ClassBuffer = js.native
  
  def node(): ClassBuffer = js.native
  
  def random(): ClassBuffer = js.native
  
  def sha1(ns: Double, name: String): ClassBuffer = js.native
  
  def snowflake(): ClassBuffer = js.native
}
