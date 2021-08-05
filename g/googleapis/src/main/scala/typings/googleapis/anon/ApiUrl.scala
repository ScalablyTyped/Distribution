package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiUrl extends StObject {
  
  var apiUrl: js.UndefOr[String] = js.undefined
  
  var browserUrl: js.UndefOr[String] = js.undefined
}
object ApiUrl {
  
  inline def apply(): ApiUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiUrl]
  }
  
  extension [Self <: ApiUrl](x: Self) {
    
    inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
    
    inline def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
    
    inline def setBrowserUrl(value: String): Self = StObject.set(x, "browserUrl", value.asInstanceOf[js.Any])
    
    inline def setBrowserUrlUndefined: Self = StObject.set(x, "browserUrl", js.undefined)
  }
}
