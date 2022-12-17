package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Bankname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountFetchResponse extends StObject {
  
  var data: Bankname
}
object SubaccountFetchResponse {
  
  inline def apply(data: Bankname): SubaccountFetchResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountFetchResponse]
  }
  
  extension [Self <: SubaccountFetchResponse](x: Self) {
    
    inline def setData(value: Bankname): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
