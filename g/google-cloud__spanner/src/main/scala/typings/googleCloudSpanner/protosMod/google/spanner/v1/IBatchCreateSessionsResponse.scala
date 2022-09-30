package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchCreateSessionsResponse. */
trait IBatchCreateSessionsResponse extends StObject {
  
  /** BatchCreateSessionsResponse session */
  var session: js.UndefOr[js.Array[ISession] | Null] = js.undefined
}
object IBatchCreateSessionsResponse {
  
  inline def apply(): IBatchCreateSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchCreateSessionsResponse]
  }
  
  extension [Self <: IBatchCreateSessionsResponse](x: Self) {
    
    inline def setSession(value: js.Array[ISession]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSessionVarargs(value: ISession*): Self = StObject.set(x, "session", js.Array(value*))
  }
}
