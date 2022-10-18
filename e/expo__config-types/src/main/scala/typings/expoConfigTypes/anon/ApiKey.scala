package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKey extends StObject {
  
  /**
    * Your Branch API key
    */
  var apiKey: js.UndefOr[String] = js.undefined
}
object ApiKey {
  
  inline def apply(): ApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKey]
  }
  
  extension [Self <: ApiKey](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
