package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSessionEntityTypesResponse. */
trait IListSessionEntityTypesResponse extends StObject {
  
  /** ListSessionEntityTypesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListSessionEntityTypesResponse sessionEntityTypes */
  var sessionEntityTypes: js.UndefOr[js.Array[ISessionEntityType] | Null] = js.undefined
}
object IListSessionEntityTypesResponse {
  
  inline def apply(): IListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSessionEntityTypesResponse]
  }
  
  extension [Self <: IListSessionEntityTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSessionEntityTypes(value: js.Array[ISessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setSessionEntityTypesNull: Self = StObject.set(x, "sessionEntityTypes", null)
    
    inline def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    inline def setSessionEntityTypesVarargs(value: ISessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value*))
  }
}
