package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BvnVerificationResponse
  extends StObject
     with BaseResponse {
  
  var data: typings.flutterwaveNode.anon.Bvn
}
object BvnVerificationResponse {
  
  inline def apply(data: typings.flutterwaveNode.anon.Bvn, message: String, status: String): BvnVerificationResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BvnVerificationResponse]
  }
  
  extension [Self <: BvnVerificationResponse](x: Self) {
    
    inline def setData(value: typings.flutterwaveNode.anon.Bvn): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
