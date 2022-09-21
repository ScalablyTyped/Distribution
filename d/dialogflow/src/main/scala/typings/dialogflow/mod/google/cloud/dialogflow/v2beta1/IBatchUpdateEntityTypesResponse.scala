package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchUpdateEntityTypesResponse. */
trait IBatchUpdateEntityTypesResponse extends StObject {
  
  /** BatchUpdateEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.undefined
}
object IBatchUpdateEntityTypesResponse {
  
  inline def apply(): IBatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateEntityTypesResponse]
  }
  
  extension [Self <: IBatchUpdateEntityTypesResponse](x: Self) {
    
    inline def setEntityTypes(value: js.Array[IEntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: IEntityType*): Self = StObject.set(x, "entityTypes", js.Array(value*))
  }
}
