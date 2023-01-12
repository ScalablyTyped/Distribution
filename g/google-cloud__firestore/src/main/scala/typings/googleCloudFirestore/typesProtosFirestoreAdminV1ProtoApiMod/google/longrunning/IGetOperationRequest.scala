package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.longrunning

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGetOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
