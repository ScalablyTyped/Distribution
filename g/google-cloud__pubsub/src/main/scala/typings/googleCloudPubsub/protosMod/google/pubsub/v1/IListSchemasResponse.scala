package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSchemasResponse. */
trait IListSchemasResponse extends StObject {
  
  /** ListSchemasResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListSchemasResponse schemas */
  var schemas: js.UndefOr[js.Array[ISchema] | Null] = js.undefined
}
object IListSchemasResponse {
  
  inline def apply(): IListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSchemasResponse]
  }
  
  extension [Self <: IListSchemasResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSchemas(value: js.Array[ISchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: ISchema*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
