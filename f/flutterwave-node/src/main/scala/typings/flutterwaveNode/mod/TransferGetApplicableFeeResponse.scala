package typings.flutterwaveNode.mod

import typings.flutterwaveNode.anon.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferGetApplicableFeeResponse
  extends StObject
     with BaseResponse {
  
  var data: js.Array[Currency]
}
object TransferGetApplicableFeeResponse {
  
  inline def apply(data: js.Array[Currency], message: String, status: String): TransferGetApplicableFeeResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferGetApplicableFeeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferGetApplicableFeeResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Currency]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Currency*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
