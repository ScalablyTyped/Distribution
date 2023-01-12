package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListContextsResponse. */
trait IListContextsResponse extends StObject {
  
  /** ListContextsResponse contexts */
  var contexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  
  /** ListContextsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListContextsResponse {
  
  inline def apply(): IListContextsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListContextsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IListContextsResponse] (val x: Self) extends AnyVal {
    
    inline def setContexts(value: js.Array[IContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsNull: Self = StObject.set(x, "contexts", null)
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: IContext*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
