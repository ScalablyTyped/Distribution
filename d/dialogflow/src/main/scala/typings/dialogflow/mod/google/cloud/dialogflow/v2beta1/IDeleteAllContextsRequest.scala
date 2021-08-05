package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteAllContextsRequest. */
trait IDeleteAllContextsRequest extends StObject {
  
  /** DeleteAllContextsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IDeleteAllContextsRequest {
  
  inline def apply(): IDeleteAllContextsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteAllContextsRequest]
  }
  
  extension [Self <: IDeleteAllContextsRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
