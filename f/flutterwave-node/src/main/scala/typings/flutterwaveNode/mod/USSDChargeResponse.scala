package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Responsemessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USSDChargeResponse extends StObject {
  
  var data: Responsemessage
}
object USSDChargeResponse {
  
  inline def apply(data: Responsemessage): USSDChargeResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[USSDChargeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USSDChargeResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Responsemessage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
