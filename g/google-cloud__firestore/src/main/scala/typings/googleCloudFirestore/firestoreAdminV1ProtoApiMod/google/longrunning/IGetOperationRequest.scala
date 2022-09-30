package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetOperationRequest. */
trait IGetOperationRequest extends StObject {
  
  /** GetOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetOperationRequest {
  
  inline def apply(): IGetOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetOperationRequest]
  }
  
  extension [Self <: IGetOperationRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
