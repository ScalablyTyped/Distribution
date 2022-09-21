package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGlobalorganizationoperationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the Operations resource to delete.
    */
  var operation: js.UndefOr[String] = js.undefined
  
  /**
    * Parent ID for this request.
    */
  var parentId: js.UndefOr[String] = js.undefined
}
object ParamsResourceGlobalorganizationoperationsDelete {
  
  inline def apply(): ParamsResourceGlobalorganizationoperationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGlobalorganizationoperationsDelete]
  }
  
  extension [Self <: ParamsResourceGlobalorganizationoperationsDelete](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
  }
}
