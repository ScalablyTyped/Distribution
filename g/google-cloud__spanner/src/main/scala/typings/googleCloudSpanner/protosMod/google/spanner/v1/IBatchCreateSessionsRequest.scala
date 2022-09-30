package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BatchCreateSessionsRequest. */
trait IBatchCreateSessionsRequest extends StObject {
  
  /** BatchCreateSessionsRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** BatchCreateSessionsRequest sessionCount */
  var sessionCount: js.UndefOr[Double | Null] = js.undefined
  
  /** BatchCreateSessionsRequest sessionTemplate */
  var sessionTemplate: js.UndefOr[ISession | Null] = js.undefined
}
object IBatchCreateSessionsRequest {
  
  inline def apply(): IBatchCreateSessionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchCreateSessionsRequest]
  }
  
  extension [Self <: IBatchCreateSessionsRequest](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    inline def setSessionCountNull: Self = StObject.set(x, "sessionCount", null)
    
    inline def setSessionCountUndefined: Self = StObject.set(x, "sessionCount", js.undefined)
    
    inline def setSessionTemplate(value: ISession): Self = StObject.set(x, "sessionTemplate", value.asInstanceOf[js.Any])
    
    inline def setSessionTemplateNull: Self = StObject.set(x, "sessionTemplate", null)
    
    inline def setSessionTemplateUndefined: Self = StObject.set(x, "sessionTemplate", js.undefined)
  }
}
