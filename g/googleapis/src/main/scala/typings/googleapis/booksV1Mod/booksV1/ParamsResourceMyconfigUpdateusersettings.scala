package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMyconfigUpdateusersettings
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUsersettings] = js.undefined
}
object ParamsResourceMyconfigUpdateusersettings {
  
  inline def apply(): ParamsResourceMyconfigUpdateusersettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMyconfigUpdateusersettings]
  }
  
  extension [Self <: ParamsResourceMyconfigUpdateusersettings](x: Self) {
    
    inline def setRequestBody(value: SchemaUsersettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
