package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateSessionRequest. */
trait ICreateSessionRequest extends StObject {
  
  /** CreateSessionRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** CreateSessionRequest session */
  var session: js.UndefOr[ISession | Null] = js.undefined
}
object ICreateSessionRequest {
  
  inline def apply(): ICreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateSessionRequest]
  }
  
  extension [Self <: ICreateSessionRequest](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
