package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewDefinition extends StObject {
  
  var query: js.UndefOr[String] = js.undefined
  
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
}
object ViewDefinition {
  
  @scala.inline
  def apply(): ViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewDefinition]
  }
  
  @scala.inline
  implicit class ViewDefinitionMutableBuilder[Self <: ViewDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = StObject.set(x, "userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedFunctionResourcesUndefined: Self = StObject.set(x, "userDefinedFunctionResources", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value :_*))
  }
}
