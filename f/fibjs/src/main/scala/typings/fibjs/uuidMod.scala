package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief uuid 唯一 id 模块
  * @detail 基础模块。提供唯一 id 的创建于操作,```JavaScript,var uuid = require('uuid');,```
  */
object uuidMod {
  
  @JSImport("uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def md5(ns: Double, name: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(ns.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  @scala.inline
  def node(): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("node")().asInstanceOf[ClassBuffer]
  
  @scala.inline
  def random(): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[ClassBuffer]
  
  @scala.inline
  def sha1(ns: Double, name: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(ns.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  @scala.inline
  def snowflake(): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("snowflake")().asInstanceOf[ClassBuffer]
}
