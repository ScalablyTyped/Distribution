package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefinedFunctionResource extends StObject {
  
  var inlineCode: js.UndefOr[String] = js.undefined
  
  var resourceUri: js.UndefOr[String] = js.undefined
}
object UserDefinedFunctionResource {
  
  @scala.inline
  def apply(): UserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionResource]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionResourceMutableBuilder[Self <: UserDefinedFunctionResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineCode(value: String): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
    
    @scala.inline
    def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
