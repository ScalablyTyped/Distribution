package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameterTypeStructTypes extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[QueryParameterType] = js.undefined
}
object QueryParameterTypeStructTypes {
  
  @scala.inline
  def apply(): QueryParameterTypeStructTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterTypeStructTypes]
  }
  
  @scala.inline
  implicit class QueryParameterTypeStructTypesMutableBuilder[Self <: QueryParameterTypeStructTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: QueryParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
