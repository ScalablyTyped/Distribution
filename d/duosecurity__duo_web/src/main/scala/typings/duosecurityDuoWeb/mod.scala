package typings.duosecurityDuoWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@duosecurity/duo_web", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ERR_AKEY: String = js.native
  
  val ERR_IKEY: String = js.native
  
  val ERR_SKEY: String = js.native
  
  val ERR_USER: String = js.native
  
  @JSName("sign_request")
  def signRequest(ikey: String, skey: String, akey: String, username: String): String = js.native
  
  @JSName("verify_response")
  def verifyResponse(ikey: String, skey: String, akey: String, sig_response: String): String | Null = js.native
}
