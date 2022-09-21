package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferBulkRequest extends StObject {
  
  var bulk_data: js.UndefOr[js.Array[Any]] = js.undefined
  
  var title: String
}
object TransferBulkRequest {
  
  inline def apply(title: String): TransferBulkRequest = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferBulkRequest]
  }
  
  extension [Self <: TransferBulkRequest](x: Self) {
    
    inline def setBulk_data(value: js.Array[Any]): Self = StObject.set(x, "bulk_data", value.asInstanceOf[js.Any])
    
    inline def setBulk_dataUndefined: Self = StObject.set(x, "bulk_data", js.undefined)
    
    inline def setBulk_dataVarargs(value: Any*): Self = StObject.set(x, "bulk_data", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
