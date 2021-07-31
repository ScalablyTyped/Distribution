package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterializedViewDefinition extends StObject {
  
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
}
object MaterializedViewDefinition {
  
  @scala.inline
  def apply(): MaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterializedViewDefinition]
  }
  
  @scala.inline
  implicit class MaterializedViewDefinitionMutableBuilder[Self <: MaterializedViewDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
