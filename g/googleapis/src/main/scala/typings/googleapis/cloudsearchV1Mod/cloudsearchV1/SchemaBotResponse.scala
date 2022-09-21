package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBotResponse extends StObject {
  
  var botId: js.UndefOr[SchemaUserId] = js.undefined
  
  var requiredAction: js.UndefOr[String | Null] = js.undefined
  
  var responseType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL for setting up bot.
    */
  var setupUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaBotResponse {
  
  inline def apply(): SchemaBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBotResponse]
  }
  
  extension [Self <: SchemaBotResponse](x: Self) {
    
    inline def setBotId(value: SchemaUserId): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setRequiredAction(value: String): Self = StObject.set(x, "requiredAction", value.asInstanceOf[js.Any])
    
    inline def setRequiredActionNull: Self = StObject.set(x, "requiredAction", null)
    
    inline def setRequiredActionUndefined: Self = StObject.set(x, "requiredAction", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSetupUrl(value: String): Self = StObject.set(x, "setupUrl", value.asInstanceOf[js.Any])
    
    inline def setSetupUrlNull: Self = StObject.set(x, "setupUrl", null)
    
    inline def setSetupUrlUndefined: Self = StObject.set(x, "setupUrl", js.undefined)
  }
}
