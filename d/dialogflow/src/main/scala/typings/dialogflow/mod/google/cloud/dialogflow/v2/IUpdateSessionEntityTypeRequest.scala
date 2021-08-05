package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateSessionEntityTypeRequest. */
trait IUpdateSessionEntityTypeRequest extends StObject {
  
  /** UpdateSessionEntityTypeRequest sessionEntityType */
  var sessionEntityType: js.UndefOr[ISessionEntityType | Null] = js.undefined
  
  /** UpdateSessionEntityTypeRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateSessionEntityTypeRequest {
  
  inline def apply(): IUpdateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateSessionEntityTypeRequest]
  }
  
  extension [Self <: IUpdateSessionEntityTypeRequest](x: Self) {
    
    inline def setSessionEntityType(value: ISessionEntityType): Self = StObject.set(x, "sessionEntityType", value.asInstanceOf[js.Any])
    
    inline def setSessionEntityTypeNull: Self = StObject.set(x, "sessionEntityType", null)
    
    inline def setSessionEntityTypeUndefined: Self = StObject.set(x, "sessionEntityType", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
