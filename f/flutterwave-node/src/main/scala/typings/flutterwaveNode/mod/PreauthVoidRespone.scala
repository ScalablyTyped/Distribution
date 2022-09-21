package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreauthVoidRespone
  extends StObject
     with BaseResponse {
  
  var data: typings.flutterwaveNode.anon.Status
}
object PreauthVoidRespone {
  
  inline def apply(data: typings.flutterwaveNode.anon.Status, message: String, status: String): PreauthVoidRespone = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreauthVoidRespone]
  }
  
  extension [Self <: PreauthVoidRespone](x: Self) {
    
    inline def setData(value: typings.flutterwaveNode.anon.Status): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
