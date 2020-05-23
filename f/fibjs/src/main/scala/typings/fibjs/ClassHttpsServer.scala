package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassHttpsServer extends ClassHttpServer {
  /**
    * class prop 
    *
    * 
    * @brief 客户端证书验证 ca
    * 
    * @readonly
    * @type X509Cert
    */
  var ca: ClassX509Cert = js.native
  /**
    * class prop 
    *
    * 
    * @brief 设定证书验证模式，缺省为 VERIFY_NONE
    * 
    * 
    * @type Integer
    */
  var verification: Double = js.native
}

