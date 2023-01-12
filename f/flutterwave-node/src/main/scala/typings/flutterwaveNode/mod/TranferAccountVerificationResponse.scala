package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.DataStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranferAccountVerificationResponse extends StObject {
  
  var data: DataStatus
}
object TranferAccountVerificationResponse {
  
  inline def apply(data: DataStatus): TranferAccountVerificationResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranferAccountVerificationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranferAccountVerificationResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: DataStatus): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
