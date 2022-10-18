package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.DataResponsecode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USSDChargeResponse extends StObject {
  
  var data: DataResponsecode
}
object USSDChargeResponse {
  
  inline def apply(data: DataResponsecode): USSDChargeResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[USSDChargeResponse]
  }
  
  extension [Self <: USSDChargeResponse](x: Self) {
    
    inline def setData(value: DataResponsecode): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
