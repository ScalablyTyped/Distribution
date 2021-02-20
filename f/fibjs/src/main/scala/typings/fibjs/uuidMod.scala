package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief uuid 唯一 id 模块
  * @detail 基础模块。提供唯一 id 的创建于操作,```JavaScript,var uuid = require('uuid');,```
  */
object uuidMod {
  
  @JSImport("uuid", "DNS")
  @js.native
  val DNS: /* 0 */ Double = js.native
  
  @JSImport("uuid", "OID")
  @js.native
  val OID: /* 2 */ Double = js.native
  
  @JSImport("uuid", "URL")
  @js.native
  val URL: /* 1 */ Double = js.native
  
  @JSImport("uuid", "X509")
  @js.native
  val X509: /* 3 */ Double = js.native
  
  @JSImport("uuid", "hostID")
  @js.native
  val hostID: Double = js.native
  
  @JSImport("uuid", "md5")
  @js.native
  def md5(ns: Double, name: String): ClassBuffer = js.native
  
  @JSImport("uuid", "node")
  @js.native
  def node(): ClassBuffer = js.native
  
  @JSImport("uuid", "random")
  @js.native
  def random(): ClassBuffer = js.native
  
  @JSImport("uuid", "sha1")
  @js.native
  def sha1(ns: Double, name: String): ClassBuffer = js.native
  
  @JSImport("uuid", "snowflake")
  @js.native
  def snowflake(): ClassBuffer = js.native
}
