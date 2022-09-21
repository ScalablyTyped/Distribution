package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSessionInfo extends StObject {
  
  /**
    * [Output-only] // [Preview] Id of the session.
    */
  var sessionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSessionInfo {
  
  inline def apply(): SchemaSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSessionInfo]
  }
  
  extension [Self <: SchemaSessionInfo](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
