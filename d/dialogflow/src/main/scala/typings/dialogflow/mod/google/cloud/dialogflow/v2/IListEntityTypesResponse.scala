package typings.dialogflow.mod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListEntityTypesResponse. */
trait IListEntityTypesResponse extends StObject {
  
  /** ListEntityTypesResponse entityTypes */
  var entityTypes: js.UndefOr[js.Array[IEntityType] | Null] = js.undefined
  
  /** ListEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListEntityTypesResponse {
  
  inline def apply(): IListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListEntityTypesResponse]
  }
  
  extension [Self <: IListEntityTypesResponse](x: Self) {
    
    inline def setEntityTypes(value: js.Array[IEntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: IEntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
