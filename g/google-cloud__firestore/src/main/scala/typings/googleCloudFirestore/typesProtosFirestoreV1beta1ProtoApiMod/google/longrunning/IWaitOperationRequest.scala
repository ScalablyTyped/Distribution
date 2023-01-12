package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.longrunning

import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a WaitOperationRequest. */
trait IWaitOperationRequest extends StObject {
  
  /** WaitOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** WaitOperationRequest timeout */
  var timeout: js.UndefOr[IDuration | Null] = js.undefined
}
object IWaitOperationRequest {
  
  inline def apply(): IWaitOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWaitOperationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWaitOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimeout(value: IDuration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
