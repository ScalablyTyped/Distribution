package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Subaccounts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountListResponse extends StObject {
  
  var data: Subaccounts
}
object SubaccountListResponse {
  
  inline def apply(data: Subaccounts): SubaccountListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountListResponse]
  }
  
  extension [Self <: SubaccountListResponse](x: Self) {
    
    inline def setData(value: Subaccounts): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
