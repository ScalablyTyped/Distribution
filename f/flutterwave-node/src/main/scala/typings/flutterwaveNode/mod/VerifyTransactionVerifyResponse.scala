package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyTransactionVerifyResponse
  extends StObject
     with BaseResponse
     with /* others */ StringDictionary[Any]
object VerifyTransactionVerifyResponse {
  
  inline def apply(message: String, status: String): VerifyTransactionVerifyResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyTransactionVerifyResponse]
  }
}
