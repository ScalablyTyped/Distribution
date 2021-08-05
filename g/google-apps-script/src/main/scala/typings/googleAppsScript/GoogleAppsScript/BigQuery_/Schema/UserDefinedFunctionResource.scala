package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedFunctionResource extends StObject {
  
  var inlineCode: js.UndefOr[String] = js.undefined
  
  var resourceUri: js.UndefOr[String] = js.undefined
}
object UserDefinedFunctionResource {
  
  inline def apply(): UserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionResource]
  }
  
  extension [Self <: UserDefinedFunctionResource](x: Self) {
    
    inline def setInlineCode(value: String): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
    
    inline def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
