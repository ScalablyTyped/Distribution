package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.longrunning

import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.IAny
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.rpc.IStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Operation. */
trait IOperation extends StObject {
  
  /** Operation done */
  var done: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Operation error */
  var error: js.UndefOr[IStatus | Null] = js.undefined
  
  /** Operation metadata */
  var metadata: js.UndefOr[IAny | Null] = js.undefined
  
  /** Operation name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Operation response */
  var response: js.UndefOr[IAny | Null] = js.undefined
}
object IOperation {
  
  inline def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  
  extension [Self <: IOperation](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneNull: Self = StObject.set(x, "done", null)
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setError(value: IStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMetadata(value: IAny): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResponse(value: IAny): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseNull: Self = StObject.set(x, "response", null)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
