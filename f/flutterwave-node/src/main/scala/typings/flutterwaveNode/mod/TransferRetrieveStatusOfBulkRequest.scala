package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferRetrieveStatusOfBulkRequest extends StObject {
  
  var batch_id: String
}
object TransferRetrieveStatusOfBulkRequest {
  
  inline def apply(batch_id: String): TransferRetrieveStatusOfBulkRequest = {
    val __obj = js.Dynamic.literal(batch_id = batch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferRetrieveStatusOfBulkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferRetrieveStatusOfBulkRequest] (val x: Self) extends AnyVal {
    
    inline def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
  }
}
