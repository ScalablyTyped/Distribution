package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferFetchRequest extends StObject {
  
  var id: String
  
  var reference: String
}
object TransferFetchRequest {
  
  inline def apply(id: String, reference: String): TransferFetchRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferFetchRequest]
  }
  
  extension [Self <: TransferFetchRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
