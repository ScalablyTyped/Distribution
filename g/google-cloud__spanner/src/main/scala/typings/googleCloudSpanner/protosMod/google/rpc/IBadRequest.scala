package typings.googleCloudSpanner.protosMod.google.rpc

import typings.googleCloudSpanner.protosMod.google.rpc.BadRequest.IFieldViolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BadRequest. */
trait IBadRequest extends StObject {
  
  /** BadRequest fieldViolations */
  var fieldViolations: js.UndefOr[js.Array[IFieldViolation] | Null] = js.undefined
}
object IBadRequest {
  
  inline def apply(): IBadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBadRequest]
  }
  
  extension [Self <: IBadRequest](x: Self) {
    
    inline def setFieldViolations(value: js.Array[IFieldViolation]): Self = StObject.set(x, "fieldViolations", value.asInstanceOf[js.Any])
    
    inline def setFieldViolationsNull: Self = StObject.set(x, "fieldViolations", null)
    
    inline def setFieldViolationsUndefined: Self = StObject.set(x, "fieldViolations", js.undefined)
    
    inline def setFieldViolationsVarargs(value: IFieldViolation*): Self = StObject.set(x, "fieldViolations", js.Array(value*))
  }
}
