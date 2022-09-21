package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListIntentsResponse. */
trait IListIntentsResponse extends StObject {
  
  /** ListIntentsResponse intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
  
  /** ListIntentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListIntentsResponse {
  
  inline def apply(): IListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListIntentsResponse]
  }
  
  extension [Self <: IListIntentsResponse](x: Self) {
    
    inline def setIntents(value: js.Array[IIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsNull: Self = StObject.set(x, "intents", null)
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: IIntent*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
