package typings.duosecurityDuoWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@duosecurity/duo_web", "ERR_AKEY")
  @js.native
  val ERR_AKEY: String = js.native
  
  @JSImport("@duosecurity/duo_web", "ERR_IKEY")
  @js.native
  val ERR_IKEY: String = js.native
  
  @JSImport("@duosecurity/duo_web", "ERR_SKEY")
  @js.native
  val ERR_SKEY: String = js.native
  
  @JSImport("@duosecurity/duo_web", "ERR_USER")
  @js.native
  val ERR_USER: String = js.native
  
  @JSImport("@duosecurity/duo_web", "sign_request")
  @js.native
  def signRequest(ikey: String, skey: String, akey: String, username: String): String = js.native
  
  @JSImport("@duosecurity/duo_web", "verify_response")
  @js.native
  def verifyResponse(ikey: String, skey: String, akey: String, sig_response: String): String | Null = js.native
}
