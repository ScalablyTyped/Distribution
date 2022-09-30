package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSessionsResponse. */
trait IListSessionsResponse extends StObject {
  
  /** ListSessionsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListSessionsResponse sessions */
  var sessions: js.UndefOr[js.Array[ISession] | Null] = js.undefined
}
object IListSessionsResponse {
  
  inline def apply(): IListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSessionsResponse]
  }
  
  extension [Self <: IListSessionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSessions(value: js.Array[ISession]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsNull: Self = StObject.set(x, "sessions", null)
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setSessionsVarargs(value: ISession*): Self = StObject.set(x, "sessions", js.Array(value*))
  }
}
