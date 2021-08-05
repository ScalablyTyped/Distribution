package typings.duosecurityDuoWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@duosecurity/duo_web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def signRequest(ikey: String, skey: String, akey: String, username: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign_request")(ikey.asInstanceOf[js.Any], skey.asInstanceOf[js.Any], akey.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verifyResponse(ikey: String, skey: String, akey: String, sig_response: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("verify_response")(ikey.asInstanceOf[js.Any], skey.asInstanceOf[js.Any], akey.asInstanceOf[js.Any], sig_response.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
