package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Appfee
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileMoneyUgandaResponse extends StObject {
  
  var data: Appfee
}
object MobileMoneyUgandaResponse {
  
  inline def apply(data: Appfee): MobileMoneyUgandaResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileMoneyUgandaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileMoneyUgandaResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Appfee): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
