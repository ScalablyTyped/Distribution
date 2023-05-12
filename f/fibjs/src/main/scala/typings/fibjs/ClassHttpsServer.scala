package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassHttpsServer
  extends StObject
     with ClassHttpServer {
  
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
    * @note Assumed to be an integer.
    */
  var verification: Double = js.native
}
