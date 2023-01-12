package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CancelOperationRequest. */
trait ICancelOperationRequest extends StObject {
  
  /** CancelOperationRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object ICancelOperationRequest {
  
  inline def apply(): ICancelOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICancelOperationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICancelOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
