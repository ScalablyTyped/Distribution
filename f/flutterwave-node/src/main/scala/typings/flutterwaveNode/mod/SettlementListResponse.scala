package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Info
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementListResponse
  extends StObject
     with BaseResponse {
  
  var data: Info
}
object SettlementListResponse {
  
  inline def apply(data: Info, message: String, status: String): SettlementListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettlementListResponse]
  }
  
  extension [Self <: SettlementListResponse](x: Self) {
    
    inline def setData(value: Info): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
